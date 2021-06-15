package com.Shildt_Polymorphism;

public class Overload {
    public static void main(String[] args) {
        B subObj=new B(1,2,3);

        subObj.show("k: "); //вызов метода show() из класса B
        subObj.show(); //вызов метода show() из класса A
    }
}
