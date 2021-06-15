package com.Shildt_Inheritance;
// Наследование: простая иерархия классов

//Класс, описывающий двумерные объекты
public class TwoDShape{
    //объявим теперь переменные суперкласса закрытыми
    private double width;
    private double height;

    //Конструктор по умолчанию
    TwoDShape(){
        width=height=0.0;
    }

    //Создание объекта с одинаковыми значениями переменных экземпляра width и height
    TwoDShape(double x){
        width=height=x;
    }

    //Параметризированный конструктор суперкласса
    TwoDShape(double w, double h){
        width=w;
        height=h;
    }

    //Создание одного объекта на основе другого объекта
    TwoDShape(TwoDShape obj){
        width = obj.width;
        height = obj.height;
    }

    //Методы доступа к закрытым переменным экземпляра width и height
    double getWidth(){ return width; }
    double getHeight(){ return height; }

    void setWidth(double w){ width =w; }
    void setHeight(double h){ height=h; }

    void showDim(){
        System.out.println("Ширина и высота: "+ width +" и "+height);
    }
}
