package com.Vasiliev_labs;

public class Bravo extends Alpha{
    int code;

    @Override
    void show() {
        String txt="Объект класса Bravo\n";
        txt+="Поле name: "+name+"\n";
        txt+="Поле code: "+code+"\n";
        //Импровизированная линия
        for (int k = 1; k <=20; k++) {
            txt+="-";
        }
        System.out.println(txt);
    }
}
