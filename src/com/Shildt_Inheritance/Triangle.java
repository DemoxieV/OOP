package com.Shildt_Inheritance;
//Подкласс для представления треугольников, производный от класса TwoDShape
//Класс Triangle наследует класс TwoDShape
public class Triangle extends TwoDShape{
    private String style;

    //Конструктор по умолчанию
    Triangle(){
        super(); //вызов конструктора суперкласса по умолчанию
        style="none";
    }

    //Конструктор с одним аргументом
    Triangle(double x){
        super(x); //вызов конструктора суперкласса с одним аргументом
        style="закрашенный";
    }

    Triangle(String s, double w, double h){ //конструктор подкласса
        super(w,h); //Вызов конструктора суперкласса первой инструкцией! с 2мя аргументами
//        setWidth(w); //При наличии параметризированного конструктора суперкласса
//        setHeight(h); //отпадает необходимость в методах для доступа к переменным экземпляра
        style=s;
    }

    //Создание одного объекта на основе другого объекта
    Triangle(Triangle obj){
        super(obj); //Передача объекта конструктору класса TwoDShape
        style=obj.style;
    }

    double area(){
        //Из класса Triangle можно обращаться к членам класса TwoDShape
        //Т.к. переменные экземпляра суперкласса закрытые, обращаемся через методы
        return getWidth()*getHeight()/2;
    }

    void showStyle(){
        System.out.println("Треугольник "+style);
    }
}
