package main.actors;

import main.Main;
import main.Storage;

public class Producer extends Thread {
    Storage storage;

    @Override
    public void run() {
        this.storage = new Storage();

        for (int time = 1; time <= 25; time++) {
            if (this == Main.Producer1) {

            }
        }
    }

}
