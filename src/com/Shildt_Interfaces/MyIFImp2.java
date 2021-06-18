package com.Shildt_Interfaces;

public class MyIFImp2 implements MyIF{
    //Предоставляются реализации обоих методов

    @Override
    public int getUserID() {
        return 100;
    }

    @Override
    public int getAdminID() {
        return 42; //Теперь будет использоваться не метод по умолчанию, а будет возвращено значение 42
//        return MyIF.super.getAdminID(); //явная ссылка на реализацию метода по умолчанию
    }
}
