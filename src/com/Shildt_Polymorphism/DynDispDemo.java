package com.Shildt_Polymorphism;
//Вызываемая версия метода who() определяется типом объекта, а не типом самой переменной в момент вызова
public class DynDispDemo {
    public static void main(String[] args) {
        Sup superObj=new Sup();
        Sub1 subObj1=new Sub1();
        Sub2 subObj2=new Sub2();

        Sup supRef;

        supRef=superObj;
        supRef.who();

        supRef=subObj1;
        supRef.who();

        supRef=subObj2;
        supRef.who();

    }
}
