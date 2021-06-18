package com.Shildt_Interfaces;

public interface MyIF {
    //объявление обычного метода интерфейса без реализации
    int getUserID();

    //объявление метода интерфейса по умолчанию с реализацией
    //класс, реализующий этот интерфейс, не должен переопределять данный метод
    default int getAdminID(){
        return 1;
    }
}
