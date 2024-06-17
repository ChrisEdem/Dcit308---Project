package com.pharmacy.management;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalTime;

public class Drug {
    private String name;
    private String description;
    private double price;
    private String supplier;
    private List<Purchase> purchaseHistory;

    public Drug(String name, String description, double price, String supplier) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.supplier = supplier;
        this.purchaseHistory = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    public String getSupplier() {
        return this.supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public void addPurchaseHistory(Purchase purchase) {
        this.purchaseHistory.add(purchase);
    }

    public List<Purchase> getPurchaseHistory() {
        return this.purchaseHistory;
    }
}

