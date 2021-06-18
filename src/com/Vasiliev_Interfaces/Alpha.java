package com.Vasiliev_Interfaces;

public class Alpha implements Base{
    String word;

    Alpha(String txt){
        word=txt;
    }

    @Override
    public void hello() {
        System.out.println("Объект класса Alpha");
    }


    @Override //переопределили метод интерфейса по умолчанию
    public void show(String txt) {
        System.out.println("Класс Alpha: "+txt);
    }

    @Override
    public void show2() {
        System.out.println("Текстовое поле: "+word);
    }

}
