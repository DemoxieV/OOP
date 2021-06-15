package com.Shildt_labs;

//Расширение класса Vehicle для грузовиков
public class Truck extends Vehicle{
    private int cargocap; //грузоподъемность, выраженная в фунтах

    //Конструктор класса Truck
    Truck(int p, int f, int m, int c){
        //Инициализация членов класса Vehicle через конструктор этого класса
        super(p,f,m);
        this.cargocap=c;
    }

    //Методы доступа к переменной cargocap
    int getCargo(){ return cargocap; }
    void putCargo(int c){ cargocap=c; }
}
