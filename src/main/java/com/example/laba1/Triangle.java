package com.example.laba1;

public class Triangle extends Polygon{
    Triangle(Point firstPoint, Point secondPoint, Point thirdPoint){
        super(firstPoint, secondPoint, thirdPoint);
    }

    @Override
    public double getArea() {
        double a = getDistanceBetweenTwoPoints(points[0], points[1]);
        double b = getDistanceBetweenTwoPoints(points[1], points[2]);
        double c = getDistanceBetweenTwoPoints(points[0], points[2]);
        double p = (a + b + c)/2;
        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }

    @Override
    public double getLength() {
        double res = 0.0;
        for (int i = 0; i < points.length; i++)
            res += getDistanceBetweenTwoPoints(points[i], points[(i + 1) % points.length]);

        return res;
    }
}
