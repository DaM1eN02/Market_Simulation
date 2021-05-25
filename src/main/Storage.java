package main;

/**
 * @author Damien Arriens
 */

public class Storage {

    /**
     * An array which saves the amount of material and products from index 1-11, index 0 is left open for better overview
     */
    public int[] goods = new int[12];
    //id 1-5: Material 1-5
    //id 6-11: Product 1-6

    public Storage () {
        for (int i = 1; i <= 11; i++) {
            this.goods[i] = 0;
        }
    }
}
