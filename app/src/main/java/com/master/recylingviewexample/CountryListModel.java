package com.master.recylingviewexample;

public class CountryListModel {
    private String name;
    private String iso;
    private String phonecode;

    public CountryListModel(String name, String iso, String phonecode) {
        this.name = name;
        this.iso = iso;
        this.phonecode = phonecode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getPhonecode() {
        return phonecode;
    }

    public void setPhonecode(String phonecode) {
        this.phonecode = phonecode;
    }
}
