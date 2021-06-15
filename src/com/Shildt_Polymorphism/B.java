package com.Shildt_Polymorphism;

public class B extends A{
    int k;

    B(int a, int b, int c){
        super(a,b);
        k=c;
    }

    //Отображение переменной k - переопределение метода show() в суперклассе A
    //Переопределение метода
    void show(){
        super.show(); //вызов версии метода из суперкласса
        System.out.println("k: "+k);
    }

    //Перегрузка метода
    void show(String msg){
        System.out.println(msg+k);
    }
}
