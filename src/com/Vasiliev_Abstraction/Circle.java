package com.Vasiliev_Abstraction;

public class Circle extends ColoredFigure{
    public Circle(String clr, int s) {
        super(clr, s);
    }

    @Override
    String getName(){
        return "Круг";
    }

    @Override
    double getArea() {
        double k=Math.PI;
        return size*size*k;
    }

    String getSizeName(){
        return "радиус";
    }
}
