package com.Shildt_Inheritance;

public class Shapes {
    public static void main(String[] args) {
        //Triangle через конструктор инициализирует поле style и унаследованные width, height
        Triangle t1=new Triangle("красненький", 4.0,4.0);
        Triangle t2=new Triangle("в горошек", 8.0, 12.0);

//        t1.setWidth(4.0);
//        t1.setHeight(4.0);
//        t1.style="красненький";

//        t2.setWidth(8.0);
//        t2.setHeight(12.0);
//        t2.style="в горошек";

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь: "+t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь: "+t2.area());

        System.out.println();

        TwoDShape shape=new TwoDShape(10, 20);
//        shape.setWidth(10);
//        shape.setHeight(20);
        shape.showDim();

        System.out.println();

        Rectangle r1=new Rectangle(6.0, 6.0);
        Rectangle r2=new Rectangle(10.0, 5.0);
//        r1.setWidth(6.0);
//        r1.setHeight(6.0);
//        r2.setWidth(10.0);
//        r2.setHeight(5.0);

        System.out.println("Информация о r1: ");
        r1.showDim();
        System.out.println("Площадь: "+r1.area());
        System.out.println("Является ли фигура квадратом? "+r1.isSquare());
        System.out.println();

        System.out.println("Информация о r2: ");
        r2.showDim();
        System.out.println("Площадь: "+r2.area());
        System.out.println("Является ли фигура квадратом? "+r2.isSquare());


    }
}
