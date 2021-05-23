package main.actors;

import main.Main;
import main.Storage;

public class Supplier extends Thread{
    Storage storage;
    int numberOfItems;
    int materialIndex;
    int materialCount;

    @Override
    public void run() {

        for (int time = 1; time <= 25; time++) {
            this.numberOfItems = (int) (Math.random() * 5) + 1; // The number of how many individual materials are produced
            for (int count = 1; count <= numberOfItems; count++) {
                this.materialIndex = (int) (Math.random() * 5) + 1; // The number of the materialIndex (For simplicity I included the possibility for one Material being selected twice
                this.materialCount = (int) (Math.random() * 10) + 1; // The number of the materialCount which is produced per material
                this.storage.add(materialIndex, materialCount);
            }
            transportGoods((Supplier) Main.Supplier1, (Producer) Main.Producer1); // Giving the Items from the Suppliers to the Producers
            transportGoods((Supplier) Main.Supplier2, (Producer) Main.Producer2);
            transportGoods((Supplier) Main.Supplier3, (Producer) Main.Producer3);
        }
    }

    public void transportGoods(Supplier s, Producer p) {
        p.storage.material1 = p.storage.material1 + s.storage.material1;
        p.storage.material2 = p.storage.material2 + s.storage.material2;
        p.storage.material3 = p.storage.material3 + s.storage.material3;
        p.storage.material4 = p.storage.material4 + s.storage.material4;
        p.storage.material5 = p.storage.material5 + s.storage.material5;
    }

    public Supplier() {
        this.storage = new Storage();
    }

}
