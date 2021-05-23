package main.actors;

import main.Storage;

public class Consumer extends Thread {
    Storage storage;

    @Override
    public void run() {

    }

    public Consumer() {
        this.storage = new Storage();
    }

}
