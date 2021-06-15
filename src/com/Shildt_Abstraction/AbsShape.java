package com.Shildt_Abstraction;

public class AbsShape {
    public static void main(String[] args) {
        TwoDShape3 shapes[]=new TwoDShape3[5];
        shapes[0]=new Triangle3("контурный", 8.0, 12.0);
        shapes[1]=new Rectangle3(10);
        shapes[2]=new Rectangle3(10,4);
        shapes[3]=new Triangle3(7.0);


        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Объект - "+shapes[i].getName());
            System.out.println("Площадь - "+shapes[i].area());
            System.out.println();
        }
    }
}
