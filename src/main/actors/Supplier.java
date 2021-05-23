package main.actors;

import main.Storage;

public class Supplier extends Thread{
    Storage storage;
    int a;

    @Override
    public void run() {
        this.storage = new Storage();

        for (int time = 1; time <= 25; time++) {
            this.a = (int) (Math.random() * 5);
            for (int count = 1; count <= 5; count++) {

            }
        }
    }

}
