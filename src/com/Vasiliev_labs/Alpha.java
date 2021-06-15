package com.Vasiliev_labs;
//Объектная переменная суперкласса может ссылаться на объект подкласса
public class Alpha {
    String name;

    void show(){
        String txt="Объект класса Alpha\n";
        txt+="Поле name: "+name+"\n";
        //Импровизированная линия
        for (int k = 1; k <=20; k++) {
            txt+="-";
        }
        System.out.println(txt);
    }
}
