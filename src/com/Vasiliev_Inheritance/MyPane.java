package com.Vasiliev_Inheritance;
import javax.swing.*;

//Можно наследовать как пользовательские, так и библиотечные классы
public class MyPane extends JOptionPane{

    //Статический метод для отображения диалогового окна
    static void showMessage(String txt, String title){
        //Вызов статического метода showMessageDialog() из класса JOptionPane
        showMessageDialog(null, txt, title, PLAIN_MESSAGE, new ImageIcon("H:/ProjectPics/hamster.png"));
    }

    //Статический метод для отображения диалогового окна
    static void showMessage(String txt){
        showMessage(txt,"Сообщение");
    }

    //Статический метод для отображения окна с полем ввода для считывания целого числа
    static int getInteger(String txt){
        String res;
        res=showInputDialog(null,txt,"Число (по умолчанию 10)",QUESTION_MESSAGE);
        if(res==null) return 10;
        else return Integer.parseInt(res);
    }
}
