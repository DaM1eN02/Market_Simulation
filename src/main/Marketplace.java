package main;

public class Marketplace {
    public int[] goods = new int[12];
    //id 1-5: Material 1-5
    //id 6-11: Product 1-6

    private static Marketplace market;

    private Marketplace(){
        for (int i = 1; i <= 11; i++) {
            goods[i] = 0;
        }
    }

    public static Marketplace getMarket() {
        if (market == null) {
            market = new Marketplace();
        }
        return market;
    }
}
