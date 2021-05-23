package main;

public class Storage {

    public int material1; // Id 1
    public int material2; // Id 2
    public int material3; // Id 3
    public int material4; // Id 4
    public int material5; // Id 5

    public int product1; // Id 6
    public int product2; // Id 7
    public int product3; // Id 8
    public int product4; // Id 9
    public int product5; // Id 10
    public int product6; // Id 11

    public Storage() {
        this.material1 = 0;
        this.material2 = 0;
        this.material3 = 0;
        this.material4 = 0;
        this.material5 = 0;
        this.product1 = 0;
        this.product2 = 0;
        this.product3 = 0;
        this.product4 = 0;
        this.product5 = 0;
        this.product6 = 0;
    }

    public void add(int itemIndex, int itemCount) {
        switch (itemIndex) {
            case 1: this.material1 = this.material1 + itemCount;
            case 2: this.material2 = this.material2 + itemCount;
            case 3: this.material3 = this.material3 + itemCount;
            case 4: this.material4 = this.material4 + itemCount;
            case 5: this.material5 = this.material5 + itemCount;

            case 6: this.product1 = this.product1 + itemCount;
            case 7: this.product2 = this.product2 + itemCount;
            case 8: this.product3 = this.product3 + itemCount;
            case 9: this.product4 = this.product4 + itemCount;
            case 10: this.product5 = this.product5 + itemCount;
            case 11: this.product6 = this.product6 + itemCount;
        }
    }

}
