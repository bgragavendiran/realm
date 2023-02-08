package com.adiuvo.illuminate2.realm.realmmodels;

import io.realm.RealmModel;

public class PatientModel implements RealmModel {
    String abc;

    public PatientModel(String abc) {
        this.abc = abc;
    }

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }
}
