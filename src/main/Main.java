package main;

import main.actors.Consumer;
import main.actors.Producer;
import main.actors.Supplier;

/**
 * @author Jannik Szopa
 */

public class Main {
    static Marketplace marketplace = Marketplace.getMarket();
    static Thread Supplier1 = new Supplier();
    static Thread Supplier2 = new Supplier();
    static Thread Supplier3 = new Supplier();
    public static Thread Producer1 = new Producer();
    public static Thread Producer2 = new Producer();
    public static Thread Producer3 = new Producer();
    static Thread Consumer1 = new Consumer();
    static Thread Consumer2 = new Consumer();
    static Thread Consumer3 = new Consumer();
    static Thread Consumer4 = new Consumer();
    static Thread Consumer5 = new Consumer();

    public static void main(String[] args) {
        /**
         * The time of 1-25
         */
        for (int time = 1; time <= 25; time++) {
            System.out.println("Phase " + time);
            System.out.println();

            if (time == 1) {
                startThreads();
            }

            /**
             * A while-loop which waits till every Thread stopped, so all jobs are finished in a time scale
             */
            while (Supplier1.isAlive() || Supplier2.isAlive() || Supplier3.isAlive() || Producer1.isAlive() || Producer2.isAlive() || Producer3.isAlive() || Consumer1.isAlive() || Consumer2.isAlive() || Consumer3.isAlive() || Consumer4.isAlive()|| Consumer5.isAlive()) { }
            output();
            runThreads();
        }
    }

    /**
     * A method to output the data from the marketplace
     */
    public static void output() { // All output functions
        System.out.println();
        System.out.println("Material 1: " + marketplace.goods[1]);
        System.out.println("Material 2: " + marketplace.goods[2]);
        System.out.println("Material 3: " + marketplace.goods[3]);
        System.out.println("Material 4: " + marketplace.goods[4]);
        System.out.println("Material 5: " + marketplace.goods[5]);
        System.out.println();
        System.out.println("Product 1: " + marketplace.goods[6]);
        System.out.println("Product 2: " + marketplace.goods[7]);
        System.out.println("Product 3: " + marketplace.goods[8]);
        System.out.println("Product 4: " + marketplace.goods[9]);
        System.out.println("Product 5: " + marketplace.goods[10]);
        System.out.println("Product 6: " + marketplace.goods[11]);
        System.out.println();
        System.out.println();
    }

    /**
     * A method, which separately starts the run method and does not start the Thread again
     */
    public static void runThreads() {
        Supplier1.run();
        Supplier2.run();
        Supplier3.run();
        Producer1.run();
        Producer2.run();
        Producer3.run();
        Consumer1.run();
        Consumer2.run();
        Consumer3.run();
        Consumer4.run();
        Consumer5.run();
    }

    /**
     * A method, which initialized the Threads
     */
    public static void startThreads() {
        Supplier1.start();
        Supplier2.start();
        Supplier3.start();
        Producer1.start();
        Producer2.start();
        Producer3.start();
        Consumer1.start();
        Consumer2.start();
        Consumer3.start();
        Consumer4.start();
        Consumer5.start();

        /**
         * The possibility to make other threads to interrupt this thread
         */
        try {
            Supplier1.join();
            Supplier2.join();
            Supplier3.join();
            Producer1.join();
            Producer2.join();
            Producer3.join();
            Consumer1.join();
            Consumer2.join();
            Consumer3.join();
            Consumer4.join();
            Consumer5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
