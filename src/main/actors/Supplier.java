package main.actors;

import main.Marketplace;
import main.Storage;

/**
 * @author Damien Arriens
 */

public class Supplier extends Thread{
    Storage storage;
    int numberOfItems;
    int materialIndex;
    int materialCount;
    Marketplace marketplace = Marketplace.getMarket();

    @Override
    public void run() {
        /**
         * The number of how many individual materials are produced from a range of 1 to 5
         */
        this.numberOfItems = (int) (Math.random() * 5) + 1;
        for (int count = 1; count <= numberOfItems; count++) {
            /**
             * The number of the materialIndex from a range of 1 to 5 (For simplicity I included the possibility for one Material being selected twice)
             */
            this.materialIndex = (int) (Math.random() * 5) + 1;

            /**
             * The number of the materialCount which is produced per material from a range of 1 to 10
             */
            this.materialCount = (int) (Math.random() * 10) + 1;

            /**
             * Materials are transferred to the storage
             */
            this.storage.goods[materialIndex] = this.storage.goods[materialIndex] + materialCount;
            System.out.println(this.getName() + " created " + materialCount + " of Material " + materialIndex);
        }

        for (int i = 1; i <= 5; i++) {
            marketplace.goods[i] = marketplace.goods[i] + this.storage.goods[i];
        }
    }

    public Supplier() {
        this.storage = new Storage();
    }

}
