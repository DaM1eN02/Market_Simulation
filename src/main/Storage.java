package main;

public class Storage {
    public int[] goods = new int[12];

    public Storage () {
        for (int i = 1; i <= 11; i++) {
            this.goods[i] = 0;
        }
    }

    public void add (int materialIndex, int materialCount) { // A simple method, which adds up material in the object storage
        this.goods[materialIndex] = this.goods[materialIndex] + materialIndex;
    }
}
