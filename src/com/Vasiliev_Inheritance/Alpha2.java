package com.Vasiliev_Inheritance;
//Наследование и закрытые члены суперкласса
public class Alpha2 {
    private int code;

    public void setCode(int code){
        this.code=code;
    }

    public void show(){
        System.out.println("Поле code: "+code);
    }

    Alpha2(int code){
        setCode(code);
    }
}
