package com.Vasiliev_Abstraction;

public class AbstractClassDemo {
    public static void main(String[] args) {
        Triangle T=new Triangle("красный",2);
        Square S=new Square("черный",3);
        Circle C=new Circle("желтый",1);

        System.out.println("Использование объектных переменных подкласса\n");
        T.show();
        S.show();
        C.show();
        System.out.println();

        //Объектная переменная абстрактного суперкласса:
        ColoredFigure F;
        System.out.println("Использование объектной переменной абстрактного суперкласса\n");
        F=T;
        F.show();
        F=S;
        F.show();
        F=C;
        F.show();
    }
}
