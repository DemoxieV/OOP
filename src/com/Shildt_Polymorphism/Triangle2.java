package com.Shildt_Polymorphism;

//Подкласс для представления треугольников, производный от класса TwoDShape
//Класс Triangle наследует класс TwoDShape
public class Triangle2 extends TwoDShape2 {
    private String style;

    //Конструктор по умолчанию
    Triangle2(){
        super(); //вызов конструктора суперкласса по умолчанию
        style="none";
    }

    //Конструктор с одним аргументом
    Triangle2(double x){
        super(x,"треугольник"); //вызов конструктора суперкласса
        style="закрашенный";
    }

    Triangle2(String s, double w, double h){ //конструктор подкласса
        super(w,h, "треугольник"); //Вызов конструктора суперкласса первой инструкцией! с 2мя аргументами
//        setWidth(w); //При наличии параметризированного конструктора суперкласса
//        setHeight(h); //отпадает необходимость в методах для доступа к переменным экземпляра
        style=s;
    }

    //Создание одного объекта на основе другого объекта
    Triangle2(Triangle2 obj){
        super(obj); //Передача объекта конструктору класса TwoDShape
        style=obj.style;
    }

    double area(){ //Переопределение метода для класса Triangle2
        return getWidth()*getHeight()/2;
    }

    void showStyle(){
        System.out.println("Треугольник "+style);
    }
}
