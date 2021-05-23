package main;

import main.actors.Consumer;
import main.actors.Producer;
import main.actors.Supplier;

public class Main {
    public static Thread Supplier1;
    public static Thread Supplier2;
    public static Thread Supplier3;
    public static Thread Producer1;
    public static Thread Producer2;
    public static Thread Producer3;
    public static Thread Consumer1;
    public static Thread Consumer2;
    public static Thread Consumer3;
    public static Thread Consumer4;
    public static Thread Consumer5;

    public static void main(String[] args){
        Marketplace marketplace = Marketplace.getMarket();

        Supplier1 = new Supplier();
        Supplier2 = new Supplier();
        Supplier3 = new Supplier();
        Producer1 = new Producer();
        Producer2 = new Producer();
        Producer3 = new Producer();
        Consumer1 = new Consumer();
        Consumer2 = new Consumer();
        Consumer3 = new Consumer();
        Consumer4 = new Consumer();
        Consumer5 = new Consumer();

        Producer1.start();
        Producer2.start();
        Producer3.start();
    }
}