package main;

public class Marketplace {

    public int product1; // Id 6
    public int product2; // Id 7
    public int product3; // Id 8
    public int product4; // Id 9
    public int product5; // Id 10
    public int product6; // Id 11

    private static Marketplace market = new Marketplace();

    private Marketplace(){
        this.product1 = 0;
        this.product2 = 0;
        this.product3 = 0;
        this.product4 = 0;
        this.product5 = 0;
        this.product6 = 0;
    }

    public static Marketplace getMarket() {
        return market;
    }
}
