package com.pharmacy.management;
import java.util.List;
import java.util.Date;
import java.time.LocalTime;



public class Main {
    public static void main(String[] args) {
        PharmacyManagementSystem pharmacy = new PharmacyManagementSystem();

        // add drugs
        Drug drug1 = new Drug("Drug1", "Description1", 10.99, "Supplier1");
        Drug drug2 = new Drug("Drug2", "Description2", 5.99, "Supplier2");
        pharmacy.addDrug(drug1);
        pharmacy.addDrug(drug2);

        // search for a drug
        Drug searchedDrug = pharmacy.searchDrug("Drug1");
        if (searchedDrug != null) {
            System.out.println("Drug found: " + searchedDrug.getName());
        } else {
            System.out.println("Drug not found");
        }

        // view all drugs
        List<Drug> allDrugs = pharmacy.getAllDrugs();
        for (Drug drug : allDrugs) {
            System.out.println(drug.getName());
        }

        // add purchase history
        Purchase purchase = new Purchase(new Date(), LocalTime.now(), "Buyer1", 2);
        drug1.addPurchaseHistory(purchase);
     // view purchase history
        List<Purchase> purchaseHistory = drug1.getPurchaseHistory();
        for (Purchase purchase1 : purchaseHistory) {
            System.out.println(purchase1.getBuyer());
        }
    }
}

