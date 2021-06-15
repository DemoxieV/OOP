package com.Vasiliev_Inheritance;

public class Bravo extends Alpha{
    char symbol;

    //закрытый метод для отображения символьного поля
    private void show(){
        System.out.println("Класс Bravo:");
        System.out.println("Поле symbol - "+this.symbol);
        //Отображение горизонтальной линии
        for (int k = 1; k <=18 ; k++) {
            System.out.print("-");
        }
        System.out.println();
    }

    Bravo(String name, int code, char symbol){
        super(name, code);
        this.symbol=symbol;
        show(); //Вызов закрытого метода!
    }

    Bravo(char symbol){
        super();
        this.symbol=symbol;
        show();
    }

    Bravo(String name){
        super(name);
        this.symbol='A';
        show();
    }

    Bravo(int code){
        super(code);
        this.symbol='B';
        show();
    }

    Bravo(){
        //неявный вызов конструктора суперкласса без аргументов
        this.symbol='C';
        show();
    }

    Bravo(String name, int code){
        this(name,code,'D');
    }

}
