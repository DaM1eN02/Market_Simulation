package main;

/**
 * @author Damien Arriens
 */

public class Marketplace {

    /**
     * An array which saves the amount of material and products from index 1-11, index 0 is left open for better overview
     */
    public int[] goods = new int[12];
    //id 1-5: Material 1-5
    //id 6-11: Product 1-6

    private static Marketplace market;

    private Marketplace(){
        for (int i = 1; i <= 11; i++) {
            goods[i] = 0;
        }
    }

    /**
     * The only way to be able to refer to the market object, which makes it a singleton
     * @return returns the market and makes it available to the other classes
     */
    public static Marketplace getMarket() {
        if (market == null) {
            market = new Marketplace();
        }
        return market;
    }
}
