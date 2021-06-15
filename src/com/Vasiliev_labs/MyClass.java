package com.Vasiliev_labs;
//Использование метода toString(), который вызывается автоматически при попытке преобразовать объект в текст
public class MyClass {
    String name;
    int code;

    MyClass(String txt, int num){
        name=txt;
        code=num;
    }

    public String toString(){
        String txt="Объект класса MyClass\n";
        txt+="Поле name: "+name+"\n";
        txt+="Поле code: "+code+"\n";
        //Импровизированная линия
        for (int k = 1; k <=21; k++) {
            txt+="-";
        }
        return txt;
    }
}
