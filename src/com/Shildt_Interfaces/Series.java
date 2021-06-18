package com.Shildt_Interfaces;

public interface Series {
    int getNext(); //возврат следующего по порядку числа
    void reset(); //сброс
    void setStart(int x); //установка начального значения

    //Возврат массива, который содержит следующие n элементов ряда, помимо текущего элемента
    default int[] getNextArray(int n){
        return getArray(n); //Используем закрытый метод
    }

    //Возврат массива, который содержит следующие n элементов в ряду, после пропуска элементов
    default int[] skipAndGetNextArray(int skip, int n){
        //пропуск указанного числа элементов
        getArray(skip);
        return getArray(n); //Используем закрытый метод
    }

    //возврат массива, который содержит n элементов
    private int [] getArray(int n){
        int[] vals=new int[n];
        for (int i = 0; i < n; i++) {
            vals[i]=getNext();
        }
        return vals;
    }
}
