package com.Shildt_labs;
//Класс, реализующий очередь фиксированного размера для хранения символов
public class FixedQueue implements ICharQ{
    private char q[]; //массив для хранения элементов очереди
    private int putloc, getloc; //индексы вставляемых и извлекаемых элементов

    //Создание пустой очереди заданного размера
    public FixedQueue(int size){
        q=new char[size]; //выделение памяти для очереди
        putloc=getloc=0;
    }

    //Помещение символа в очередь
    @Override
    public void put(char ch) {
        if(putloc==q.length){
            System.out.println("- Очередь заполнена");
            return;
        }
        q[putloc++]=ch;
    }

    //Извлечение символа из очереди
    @Override
    public char get() {
        if(getloc==putloc){
            System.out.println("- Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }
}
