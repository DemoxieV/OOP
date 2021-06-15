package com.Shildt_Inheritance;
//Переменная может указывать только на объекты своего типа
//Исключение - наследование, если бы Y расширял X
public class IncompatibleRef {
    public static void main(String[] args) {
        X x=new X(10);
        X x2;
        Y y=new Y(5);

        x2=x; // Допустимо, т.к. обе переменные одного типа
//      x2=y; // Ошибка, т.к. переменные разных типов (объекты разных классов)
    }
}
