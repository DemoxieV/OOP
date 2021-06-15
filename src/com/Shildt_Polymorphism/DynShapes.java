package com.Shildt_Polymorphism;

public class DynShapes {
    public static void main(String[] args) {
        TwoDShape2 shapes[]=new TwoDShape2[5];
        shapes[0]=new Triangle2("контурный", 8.0, 12.0);
        shapes[1]=new Rectangle2(10);
        shapes[2]=new Rectangle2(10,4);
        shapes[3]=new Triangle2(7.0);
        shapes[4]=new TwoDShape2(10,20, "фигура");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Объект - "+shapes[i].getName());
            System.out.println("Площадь - "+shapes[i].area());
            System.out.println();
        }
    }
}
