package com.Vasiliev_labs;
//Смотрим, какой метод где реализован в порядке:
// класс MyClass2 (реализует) -> интерфейс Second2 (расширяет) -> интерфейс First2
public class ExtendingInterfaceDemo {
    public static void main(String[] args) {
        MyClass2 obj=new MyClass2();
        obj.alpha1();
        obj.bravo2();
        obj.charlie3();
        obj.delta4();
        obj.echo();
    }
}
