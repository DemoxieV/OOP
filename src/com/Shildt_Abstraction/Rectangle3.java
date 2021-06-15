package com.Shildt_Abstraction;

//Подкласс для представления прямоугольников, производный от класса TwoDShape
public class Rectangle3 extends TwoDShape3 {

    Rectangle3(){
        super();
    }

    Rectangle3(double x){
        super(x,"прямоугольник");
    }

    Rectangle3(double w, double h){
        super(w,h, "прямоугольник");
    }

    Rectangle3(Rectangle3 obj){
        super(obj);
    }

//    boolean isSquare(){ // Является ли прямоугольник квадратом?
//        if(getWidth()==getHeight()) return true;
//        return false;
//    }


    String isSquare(){ // Является ли прямоугольник квадратом?
        if(getWidth()==getHeight()) return "да";
        return "нет";
    }

    //Переопределение метода для класса Rectangle2
    double area(){ //площадь прямоугольника
        return getWidth()*getHeight();
    }
}
