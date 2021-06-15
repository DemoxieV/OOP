package com.Shildt_Abstraction;
//Абстрактный класс, описывающий двумерные объекты
abstract class TwoDShape3 {
    //объявим теперь переменные суперкласса закрытыми
    private double width;
    private double height;
    private String name;

    //Конструктор по умолчанию
    TwoDShape3(){
        width=height=0.0;
        name="none";
    }

    //Создание объекта с одинаковыми значениями переменных экземпляра width и height
    TwoDShape3(double x, String n){
        width=height=x;
        name=n;
    }

    //Параметризированный конструктор суперкласса
    TwoDShape3(double w, double h, String n){
        width=w;
        height=h;
        name=n;
    }

    //Создание одного объекта на основе другого объекта
    TwoDShape3(TwoDShape3 obj){
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

    //Абстрактный метод, который должен быть переопределен во всех подклассах! Иначе ошибка компиляции
    abstract double area();
}
