package com.Shildt_Polymorphism;
// Наследование: простая иерархия классов

//Класс, описывающий двумерные объекты
public class TwoDShape2 {
    //объявим теперь переменные суперкласса закрытыми
    private double width;
    private double height;
    private String name;

    //Конструктор по умолчанию
    TwoDShape2(){
        width=height=0.0;
        name="none";
    }

    //Создание объекта с одинаковыми значениями переменных экземпляра width и height
    TwoDShape2(double x, String n){
        width=height=x;
        name=n;
    }

    //Параметризированный конструктор суперкласса
    TwoDShape2(double w, double h, String n){
        width=w;
        height=h;
        name=n;
    }

    //Создание одного объекта на основе другого объекта
    TwoDShape2(TwoDShape2 obj){
        width = obj.width;
        height = obj.height;
        name=obj.name;
    }

    //Методы доступа к закрытым переменным экземпляра width и height
    double getWidth(){ return width; }
    double getHeight(){ return height; }

    void setWidth(double w){ width =w; }
    void setHeight(double h){ height=h; }

    String getName(){ return name; }

    void showDim(){
        System.out.println("Ширина и высота: "+ width +" и "+height);
    }

    double area(){
        System.out.println("Метод area() должен быть переопределен");
        return 0.0;
    }
}
