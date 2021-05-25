package main.actors;

import main.Marketplace;
import main.Storage;

public class Consumer extends Thread {
    Storage storage;
    Marketplace marketplace = Marketplace.getMarket();

    @Override
    public void run() {
        for (int i = 6; i <= 11; i++) {
            int amount = (int) (Math.random() * 3) + 1;
            if (marketplace.goods[i] >= amount) {
                marketplace.goods[i] = marketplace.goods[i] - amount;
                this.storage.goods[i] = this.storage.goods[i] + amount;
                System.out.println(this.getName() + " bought " +  amount + " of Product " + i);
            }
        }
    }

    public Consumer() {
        this.storage = new Storage();
    }

}
