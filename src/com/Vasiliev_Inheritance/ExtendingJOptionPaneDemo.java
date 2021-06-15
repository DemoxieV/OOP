package com.Vasiliev_Inheritance;

public class ExtendingJOptionPaneDemo {
    public static void main(String[] args) {
        //Отображение диалогового окна с сообщением
        MyPane.showMessage("Всем привет!");
        //Переменная для записи числового значения
        int number;
        //Отображение диалогового окна с полем для ввода и считывания значения
        number=MyPane.getInteger("Введите целое число: ");
        //Текст для отображения в диалоговом окне
        String txt="Числа от 1 до "+number+"\n";
        //Формирование текстовой строки с последовательностью натуральных чисел
        for (int k = 1; k <= number; k++) {
            txt+=k+" ";
        }
        //Отображение диалогового окна с сообщением
        MyPane.showMessage(txt,"Целые числа");
    }
}
