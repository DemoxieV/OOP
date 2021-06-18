package com.Vasiliev_labs;

public class ExtendingInterfaceDemo3 {
    public static void main(String[] args) {
        MyClass3 obj=new MyClass3();
        obj.alpha3(); //Вызов переопределенного метода в интерфейсе Second3
        obj.bravo3(); //Вызов переопределенного метода в классе
    }
}
