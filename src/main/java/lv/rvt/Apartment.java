package lv.rvt;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;
    private int price;
    

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
        this.price = price;
    }

    public int priceDifference(Apartment compared){
        this.price = this.squares * this.pricePerSquare;
        int priceCompared = compared.squares * compared.pricePerSquare;
        return(price - priceCompared);
    }
}

