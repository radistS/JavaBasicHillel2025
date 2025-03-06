package lec_13.interfaces;


import lec_13.interfaces.logExample.Logger;

public class Rus implements Say, Logger {

    @Override
    public void sayHello() {
        System.out.println("Привет ...");
    }

    @Override
    public void sayGoodBuy() {
        System.out.println("Пока ...");
    }

    @Override
    public void printLog(String msg) {

    }

    @Override
    public String xxx() {
        return "dzfgdfhdfgjn";
    }

    @Override
    public void print() {
        Logger.super.print();
    }
}
