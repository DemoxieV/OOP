package com.Shildt_labs;
//Динамическая (растущая) очередь
public class DynQueue implements ICharQ{
    private char q[]; //массив для хранения элементов очереди
    private int putloc, getloc; //индексы вставляемых и извлекаемых элементов

    //Создание пустой очереди заданного размера
    public DynQueue(int size){
        q=new char[size]; //выделение памяти для очереди
        putloc=getloc=0;
    }

    //Помещение символа в очередь
    @Override
    public void put(char ch) {
        if(putloc==q.length){
            //Увеличение размера очереди
            char t[]=new char[q.length*2];

            //Копирование элементов в новую очередь
            for (int i = 0; i < q.length; i++) {
                t[i]=q[i];
            }
            q=t;
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
