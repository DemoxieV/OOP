package com.Shildt_Interfaces;
//Реализация интерфейса MyIF с методом по умолчанию
public class MyIFImp implements MyIF{
    //реализации подлежит лишь метод getUserID(), метод по умолчанию переопределять необязательно

    @Override
    public int getUserID() {
        return 100;
    }
}
