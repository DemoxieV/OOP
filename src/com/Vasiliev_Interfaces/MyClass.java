package com.Vasiliev_Interfaces;

public class MyClass implements MyInterface, First, Second{
    @Override
    public int getNumber(double x) {
        return (int)x;
    }

    @Override
    public char getSymbol(int n) {
        return (char) ('A'+n);
    }

    @Override
    public void hello() {
        System.out.println("Метод из интерфейса First");
    }

    @Override
    public void hi() {
        System.out.println("Метод из интерфейса Second");
    }
}
