package com.example.laba1;

public class Square extends Rectangle{

    Square(Point startPoint, double width){
        super(startPoint, width, width);
    }

    @Override
    public double getLength() {
        return 4 * width;
    }

    @Override
    public double getArea() {
        return width * width;
    }
}
