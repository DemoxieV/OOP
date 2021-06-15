package com.Shildt_labs;
//Данный класс икапсулирует данные о транспортных средствах
public class Vehicle {
   private int passengers; //кол-во пассажиров
   private int fuelcap; //емкость топливного бака
   private int mpg; //потребление топлива в милях на галлон

    public Vehicle(int p, int f, int m) {
        this.passengers = p;
        this.fuelcap = f;
        this.mpg = m;
    }

    //Добавляем метод для расчета дальности поездки в класс транспортного средства
    int range(){
        return mpg*fuelcap; // возврат дальности поездки для заданного средства
//        System.out.println("Дальность - "+fuelcap*mpg+" миль.");
    }
    //параметризированный метод расчета объема топлива для преодоления заданного расстояния
    double fuelneeded(int miles){
        return (double) miles/mpg;
    }


    //Методы доступа к переменным экземпляра
    int getPassengers(){ return passengers; }
    void setPassengers(int p){ passengers=p; }
    int getFuelcap(){ return fuelcap; }
    void setFuelcap(int f) {fuelcap=f; }
    int getMpg(){ return mpg; }
    void setMpg(int m){ mpg=m; }
}
