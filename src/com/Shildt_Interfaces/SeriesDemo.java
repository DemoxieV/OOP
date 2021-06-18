package com.Shildt_Interfaces;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos obj=new ByTwos();

        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: "+obj.getNext());
        }

        System.out.println("\nСброс");
        obj.reset();

        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: "+obj.getNext());
        }

        System.out.println("\nНачальное значение: 100");
        obj.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: "+obj.getNext());
        }
    }
}
