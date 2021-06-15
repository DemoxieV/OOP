package com.Vasiliev_Polymorphism;

public class Bravo3 extends Alpha3{
    String name;
    void show(){
        System.out.println("Из класса Alpha: "+super.name);
        System.out.println("Из класса Bravo: "+this.name);
    }

    Bravo3(String a, String b){
        super();
        super.name=a;
        name=b;
    }

}
