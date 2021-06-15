package com.Shildt_Polymorphism;

//Подкласс для представления прямоугольников, производный от класса TwoDShape
public class Rectangle2 extends TwoDShape2 {

    Rectangle2(){
        super();
    }

    Rectangle2(double x){
        super(x,"прямоугольник");
    }

    Rectangle2(double w, double h){
        super(w,h, "прямоугольник");
    }

    Rectangle2(Rectangle2 obj){
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
