package main.actors;

import main.Storage;

public class Consumer extends Thread {
    Storage storage;

    @Override
    public void run() {
        this.storage = new Storage();
        for (int time = 1; time <= 25; time++) {

        }
    }

}
