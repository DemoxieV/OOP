package com.Shildt_Interfaces;

public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos twoObj=new ByTwos();
        ByThrees threeObj=new ByThrees();
        Series obj; //ссылка на интерфейс

        for (int i = 0; i < 5; i++) {
            obj=twoObj; //ссылка на объект ByTwos
            System.out.println("Следующее значение ByTwos: "+obj.getNext());
            obj=threeObj; //ссылка на объект ByThrees
            System.out.println("Следующее значение ByThrees: "+obj.getNext());
        }
    }
}
