package com.Shildt_labs;
//Кольцевая очередь - можно вложить любое кол-во элементов (начало очереди)
// при условии своевременного удаления более ранних элементов
public class CircularQueue implements ICharQ{
    private char q[]; //массив для хранения элементов очереди
    private int putloc, getloc; //индексы вставляемых и извлекаемых элементов

    //Создание пустой очереди заданного размера
    public CircularQueue(int size){
        q=new char[size+1]; //выделение памяти для очереди
        putloc=getloc=0;
    }

    //Помещение символа в очередь
    //Очередь считается полной, если индекс putloc на 1 меньше индекса getloc
    //или индекс putloc указывает на конец массива, а индекс getloc - на его начало
    @Override
    public void put(char ch) {
        if(putloc+1==getloc | ((putloc==q.length-1) & (getloc==0))){
            System.out.println("- Очередь заполнена");
            return;
        }
        q[putloc++]=ch;
        if(putloc==q.length) putloc=0; //перейти в начало массива
    }

    //Извлечение символа из очереди
    @Override
    public char get() {
        if(getloc==putloc){
            System.out.println("- Очередь пуста");
            return (char) 0;
        }
        char ch = q[getloc++];
        if(getloc==q.length) getloc=0; //вернуться в начало очереди
        return ch; //Исправлено. В учебнике "return q[getloc]" => неверный вывод, упускал элемент q[0]
    }
}
