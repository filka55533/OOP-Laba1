package com.example.laba1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.IOException;



public class Main extends Application {
    public void drawFigure(Canvas canvas, Figure figure){
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        gc.setLineWidth(2);
        double step = 10e-2;
        for (double x = 0; x < canvas.getWidth(); x += step) {
            if (x == step * 1000)
                System.out.println("dasdsa");
            for (double y = 0; y < canvas.getHeight(); y += step)
                if (figure.isItFigurePoint(x, y)) {
                    gc.moveTo(x, y);
                    gc.lineTo(x, y);
                }
        }
        gc.stroke();
    }

    public Canvas[] canvases;


    public void initFigures(Group root){
        canvases = new Canvas[7];
        //Initialization of figures
        Figure[] figures = new Figure[7];
        figures[0] = new Circle(new Point(20, 20), 30);
        figures[1] = new Ellipse(new Point(20, 20), new Point(100, 80));
        figures[2] = new PolyLine(new Point(10, 10), new Point(50, 50), new Point(100, 20));
        figures[3] = new Rectangle(new Point(10, 10), 60, 30);
        figures[4] = new Segment(new Point(10, 10), new Point(50, 50), 50, true);
        figures[5] = new Square(new Point(10, 10), 40);
        figures[6] = new Triangle(new Point(0, 0), new Point(50, 50), new Point(80, 60));


        for (int i = 0; i < canvases.length; i++){
            canvases[i] = new Canvas(200, 200);
            canvases[i].setLayoutX((i % 4) * 200);
            canvases[i].setLayoutY((i / 4) * 200);
            drawFigure(canvases[i], figures[i]);
            root.getChildren().add(canvases[i]);
        }

    }


    @Override
    public void start(Stage stage) throws IOException {

        Group root = new Group();
        initFigures(root);

        Scene scene = new Scene(root, 800, 800);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}