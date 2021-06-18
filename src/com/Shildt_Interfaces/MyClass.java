package com.Shildt_Interfaces;
//Этот класс должен реализовать все методы, объявленные в интерфейсах А и В
public class MyClass implements B{
    @Override
    public void meth1() {
        System.out.println("Реализация метода 1");
    }

    @Override
    public void meth2() {
        System.out.println("Реализация метода 2");
    }

    @Override
    public void meth3() {
        System.out.println("Реализация метода 3");
    }
}
