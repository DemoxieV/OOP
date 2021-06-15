package com.Vasiliev_Abstraction;

public class Triangle extends ColoredFigure{
    Triangle (String clr, int s){
        super(clr, s);
    }

    @Override
    String getName(){
        return "Треугольник";
    }

    @Override
    double getArea() {
        double k=Math.sqrt(3)/4;
        return size*size*k;
    }
}
