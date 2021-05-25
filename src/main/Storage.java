package main;

public class Storage {
    public int[] goods = new int[12];
    //id 1-5: Material 1-5
    //id 6-11: Product 1-6

    public Storage () {
        for (int i = 1; i <= 11; i++) {
            this.goods[i] = 0;
        }
    }
}
