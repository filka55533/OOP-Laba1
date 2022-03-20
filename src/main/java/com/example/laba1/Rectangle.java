package com.example.laba1;

public class Rectangle extends Polygon{
    public double width, height;
    Rectangle(Point startPoint, double width, double height){
        super(startPoint,
              new Point(startPoint.x + width, startPoint.y),
              new Point(startPoint.x + width, startPoint.y + height),
              new Point(startPoint.x, startPoint.y + height)
        );
        this.width = width;
        this.height = height;
    }

    @Override
    public double getLength() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

}
