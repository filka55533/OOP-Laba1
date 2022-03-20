package com.example.laba1;

public abstract class Figure {
    public Point startPoint;
    public abstract double getLength();
    public abstract boolean isItFigurePoint(double x, double y);

    Figure(Point point) {
        this.startPoint = point;
    }

    protected double getDistanceBetweenTwoPoints(Point startPoint, Point endPoint){
        double x = startPoint.x - endPoint.x;
        double y = startPoint.y - endPoint.y;
        return Math.sqrt(x*x + y*y);
    }
}
