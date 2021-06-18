package com.Shildt_Interfaces;

public class DefaultInterfaceMethod {
    public static void main(String[] args) {
        MyIFImp obj=new MyIFImp();
        System.out.println("Идентификатор пользователя: "+obj.getUserID());
        System.out.println("Индентификатор администратора: "+obj.getAdminID());
    }
}
