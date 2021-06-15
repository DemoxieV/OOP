package com.Vasiliev_Abstraction;

abstract class ColoredFigure {
    String color;
    int size;

    ColoredFigure(String clr, int s){
        color=clr;
        size=s;
    }

    void show(){
        System.out.println("Фигура: "+color+" "+getName());
        System.out.println("Характерный размер ("+getSizeName()+"): "+size);
        System.out.printf("Площадь: %.3f\n", getArea());
        String line="";
        for (int k = 1; k <=34; k++) {
            line+="*";
        }
        System.out.println(line);
    }

    String getSizeName(){
        return "сторона";
    }

    abstract String getName();
    abstract double getArea();
}
