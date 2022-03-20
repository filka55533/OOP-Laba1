package com.example.laba1;

public abstract class OpenFigure extends Figure{
    protected Point endPoint;
    OpenFigure(Point startPoint, Point endPoint){
        super(startPoint);
        this.endPoint = endPoint;
    }
}
