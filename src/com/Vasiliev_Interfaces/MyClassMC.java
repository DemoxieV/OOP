package com.Vasiliev_Interfaces;

public class MyClassMC extends BaseB implements FirstF, SecondS{
    @Override
    public String getFirst() {
        return "Интерфейс FirstF";
    }

    @Override
    public String getSecond() {
        return "Интерфейс SecondS";
    }

    @Override
    public void showSmth() {
        System.out.println("Мы используем:");
        System.out.println(getFirst());
        System.out.println(getSecond());
        System.out.println(getBaseB());
        FirstF.super.showSmth();
        SecondS.super.showSmth();
        super.showSmth();
    }
}
