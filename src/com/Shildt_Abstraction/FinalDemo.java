package com.Shildt_Abstraction;

public class FinalDemo {
    public static void main(String[] args) {
        ErrorMsg err=new ErrorMsg();

        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.DISKERR));

        System.out.println(err.getErrorMsg(ErrorMsg.INDEXERR));
    }
}
