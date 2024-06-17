package com.pharmacy.management;
import java.util.Date;
import java.time.LocalTime;




public class Purchase {
    private Date date;
    private LocalTime time;
    private String buyer;
    private int quantity;

    public Purchase(Date date, LocalTime time, String buyer, int quantity) {
        this.date = date;
        this.time = time;
        this.buyer = buyer;
        this.quantity = quantity;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return this.time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
    
    public String getBuyer() {
        return this.buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

