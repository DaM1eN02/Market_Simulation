package main.actors;

import main.Marketplace;
import main.Storage;

/**
 * @author Damien Arriens
 */

public class Consumer extends Thread {
    Storage storage;
    Marketplace marketplace = Marketplace.getMarket();

    @Override
    public void run() {
        for (int i = 6; i <= 11; i++) {

            /**
             * Amount of product which a Consumer will buy per product
             */
            int amount = (int) (Math.random() * 3) + 1;

            /**
             * Products are transferred to the Consumer
             */
            if (marketplace.goods[i] >= amount) {
                marketplace.goods[i] = marketplace.goods[i] - amount;
                this.storage.goods[i] = this.storage.goods[i] + amount;
                System.out.println(this.getName() + " bought " +  amount + " of Product " + (i-5));
            }
        }
    }

    public Consumer() {
        this.storage = new Storage();
    }

}
