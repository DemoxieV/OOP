package com.Shildt_Abstraction;
// Использование final для создания именованных констант
public class ErrorMsg {
    final int OUTERR=0;
    final int INERR=1;
    final int DISKERR=2;

    //static позволяет обращаться по имени класса, а не через объект - экземпляр класса
    static final int INDEXERR=3;

    String msg[]= {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };

    //Возврат сообщения об ошибке
    String getErrorMsg(int i){
        if (i>=0 & i<msg.length)
            return msg[i];
        else return "Несуществующий код ошибки";
    }
}
