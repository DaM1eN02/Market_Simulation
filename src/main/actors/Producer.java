package main.actors;

import main.Main;
import main.Marketplace;
import main.Storage;

public class Producer extends Thread {
    Storage storage;
    Marketplace marketplace = Marketplace.getMarket();

    @Override
    public void run() {

        while (Main.Supplier1.isAlive() || Main.Supplier2.isAlive() || Main.Supplier3.isAlive()) {
            if (this == Main.Producer1) {
               producer1();
            }
            if (this == Main.Producer2) {
                producer2();
            }
            if (this == Main.Producer3) {
                producer3();
            }

            // All products are offered on the market
            marketplace.product1 = marketplace.product1 + this.storage.product1;
            marketplace.product2 = marketplace.product2 + this.storage.product2;
            marketplace.product3 = marketplace.product3 + this.storage.product3;
            marketplace.product4 = marketplace.product4 + this.storage.product4;
            marketplace.product5 = marketplace.product5 + this.storage.product5;
            marketplace.product6 = marketplace.product6 + this.storage.product6;
        }
    }

    public void producer1() { // All product lines for the Producer 1
        while (this.storage.material1 >= 3 && this.storage.material2 >= 2) {
            this.storage.material1 = this.storage.material1 - 3;
            this.storage.material2 = this.storage.material2 - 2;
            this.storage.product1++;
        }
        while (this.storage.material3 >= 1 && this.storage.material4 >= 4 && this.storage.material5 >= 2) {
            this.storage.material3 = this.storage.material3 - 1;
            this.storage.material4 = this.storage.material4 - 4;
            this.storage.material5 = this.storage.material5 - 2;
            this.storage.product2++;
        }
    }

    public void producer2() { // All product lines for Producer 2
        while (this.storage.material2 >= 2 && this.storage.material4 >= 3) {
            this.storage.material2 = this.storage.material2 - 2;
            this.storage.material4 = this.storage.material4 - 3;
            this.storage.product3++;
        }
        while (this.storage.material1 >= 2 && this.storage.material3 >= 4 && this.storage.material5 >= 2) {
            this.storage.material1 = this.storage.material1 - 2;
            this.storage.material3 = this.storage.material3 - 4;
            this.storage.material5 = this.storage.material5 - 2;
            this.storage.product4++;
        }
    }

    public void producer3() { // All product lines for Producer 3
        while (this.storage.material3 >= 5 && this.storage.material5 >= 6) {
            this.storage.material3 = this.storage.material3 - 5;
            this.storage.material5 = this.storage.material5 - 6;
            this.storage.product5++;
        }
        while (this.storage.material1 >= 1 && this.storage.material2 >= 2 && this.storage.material4 >= 2) {
            this.storage.material1 = this.storage.material1 - 1;
            this.storage.material2 = this.storage.material2 - 2;
            this.storage.material4 = this.storage.material4 - 2;
            this.storage.product6++;
        }
    }

    public Producer() {
        this.storage = new Storage();
    }

}
