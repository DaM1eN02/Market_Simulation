package main.actors;

import main.Main;
import main.Marketplace;
import main.Storage;

/**
 * @author Jannik Szopa
 */

public class Producer extends Thread {
    Storage storage;
    Marketplace marketplace = Marketplace.getMarket();

    @Override
    public void run() {

        /**
          A producer gets a random amount of good per material if available
         */
        for (int i = 1; i <= 5; i++) {
            /**
             * The amount of material is bought from the marketplace from a range of 1 to 10
             */
            int materialCount = (int) (Math.random() * 10) + 1;

            /**
             * If the amount of material is available on the market, the materials are transferred to the producer
             */
            if (marketplace.goods[i] >= materialCount) {
                marketplace.goods[i] = marketplace.goods[i] - materialCount;
                this.storage.goods[i] = this.storage.goods[i] + materialCount;
            }
            System.out.println(this.getName() + " bought " + materialCount + " of Product " + (i-5));
        }

        if (this == Main.Producer1) {
            producer1();
        }
        if (this == Main.Producer2) {
            producer2();
        }
        if (this == Main.Producer3) {
            producer3();
        }

        /**
         * Products are offered on the market again
         */
        for (int i = 6; i <= 11; i++) {
            marketplace.goods[i] = marketplace.goods[i] + this.storage.goods[i];
        }
    }

    /**
     * All product lines for the Producer1
     */
    public void producer1() {

        while (this.storage.goods[1] >= 3 && this.storage.goods[2] >= 2) {
            this.storage.goods[1] = this.storage.goods[1] - 3;
            this.storage.goods[2] = this.storage.goods[2] - 2;
            this.storage.goods[6]++;
            System.out.println(this.getName() + " produced 1 Item from Product 1");
        }
        while (this.storage.goods[3] >= 1 && this.storage.goods[4] >= 4 && this.storage.goods[5] >= 2) {
            this.storage.goods[3] = this.storage.goods[3] - 1;
            this.storage.goods[4] = this.storage.goods[4] - 4;
            this.storage.goods[5] = this.storage.goods[5] - 2;
            this.storage.goods[7]++;
            System.out.println(this.getName() + " produced 1 Item from Product 2");
        }
    }

    /**
     * All product lines for the Producer2
     */
    public void producer2() {
        while (this.storage.goods[2] >= 2 && this.storage.goods[4] >= 3) {
            this.storage.goods[2] = this.storage.goods[2] - 2;
            this.storage.goods[4] = this.storage.goods[4] - 3;
            this.storage.goods[8]++;
            System.out.println(this.getName() + " produced 1 Item from Product 3");
        }
        while (this.storage.goods[1] >= 2 && this.storage.goods[3] >= 4 && this.storage.goods[5] >= 2) {
            this.storage.goods[1] = this.storage.goods[1] - 2;
            this.storage.goods[3] = this.storage.goods[3] - 4;
            this.storage.goods[5] = this.storage.goods[5] - 2;
            this.storage.goods[9]++;
            System.out.println(this.getName() + " produced 1 Item from Product 4");
        }
    }

    /**
     * All product lines for the Producer3
     */
    public void producer3() {
        while (this.storage.goods[3] >= 5 && this.storage.goods[5] >= 6) {
            this.storage.goods[3] = this.storage.goods[3] - 5;
            this.storage.goods[5] = this.storage.goods[5] - 6;
            this.storage.goods[10]++;
            System.out.println(this.getName() + " produced 1 Item from Product 5");
        }
        while (this.storage.goods[1] >= 1 && this.storage.goods[2] >= 2 && this.storage.goods[4] >= 2) {
            this.storage.goods[1] = this.storage.goods[1] - 1;
            this.storage.goods[2] = this.storage.goods[2] - 2;
            this.storage.goods[4] = this.storage.goods[4] - 2;
            this.storage.goods[11]++;
            System.out.println(this.getName() + " produced 1 Item from Product 6");
        }
    }

    public Producer() {
        this.storage = new Storage();
    }

}
