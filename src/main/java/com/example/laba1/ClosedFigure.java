package com.example.laba1;

public abstract class ClosedFigure extends Figure{
    ClosedFigure(Point startPoint){
        super(startPoint);
    }
    public abstract double getArea();
}
