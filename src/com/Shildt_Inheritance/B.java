package com.Shildt_Inheritance;

public class B extends A{
    int i; //Эта переменная i скрывается переменную i из класса A

    B(){
        //вызов конструктора суперкласса по умолчанию
        System.out.println("Конструктор B");
    }

    B(int a, int b){
        super.i=a; //переменная i из класса A
        this.i=b; //переменная i из класса B
    }

    void show(){
        System.out.println("i в суперкласса равна "+super.i);
        System.out.println("i в подклассе равна "+this.i);
    }
}
