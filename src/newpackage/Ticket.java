package newpackage;

import java.util.Date;

public class Ticket {
    
    private int number;
    private int row;
    private int seat;
    private double price;
    private Date purchaseDate;
    private Date validityDate;
    private Client cli;
    
    public Ticket(){
        
    }

    public Ticket(int number, int row, int seat, double price, Date purchaseDate, Date validityDate) {
        this.number = number;
        this.row = row;
        this.seat = seat;
        this.price = price;
        this.purchaseDate = purchaseDate;
        this.validityDate = validityDate;
    }

    public int getNumber() {
        return number;
    }

    public int getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }

    public double getPrice() {
        return price;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public Date getValidityDate() {
        return validityDate;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setValidityDate(Date validityDate) {
        this.validityDate = validityDate;
    }

    @Override
    public String toString() {
        return "Ticket{" + "number=" + number + ", row=" + row + ", seat=" + seat + ", price=" + price + ", purchaseDate=" + purchaseDate + ", validityDate=" + validityDate + '}';
    }
    
    
    
}
