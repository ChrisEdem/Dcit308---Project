package com.pharmacy.management;

import java.util.ArrayList;
import java.util.List;

public class PharmacyManagementSystem {
    private List<Drug> drugs;

    public PharmacyManagementSystem() {
        this.drugs = new ArrayList<>();
    }

    public void addDrug(Drug drug) {
        this.drugs.add(drug);
    }

    public Drug searchDrug(String name) {
        for (Drug drug : this.drugs) {
            if (drug.getName().equals(name)) {
                return drug;
            }
        }
        return null;
    }

    public List<Drug> getAllDrugs() {
        return this.drugs;
    }
}
