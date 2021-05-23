package main;

public class Marketplace {

    private static Marketplace market = new Marketplace();
    private Marketplace(){
    }

    public static Marketplace getMarket() {
        return market;
    }
}
