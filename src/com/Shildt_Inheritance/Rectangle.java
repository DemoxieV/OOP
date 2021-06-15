package com.Shildt_Inheritance;
//Подкласс для представления прямоугольников, производный от класса TwoDShape
public class Rectangle extends TwoDShape{
//    boolean isSquare(){ // Является ли прямоугольник квадратом?
//        if(getWidth()==getHeight()) return true;
//        return false;
//    }
    Rectangle(double w, double h){
        super(w,h);
    }

    String isSquare(){ // Является ли прямоугольник квадратом?
        if(getWidth()==getHeight()) return "да";
        return "нет";
    }

    double area(){ //площадь прямоугольника
        return getWidth()*getHeight();
    }
}
