package com.master.recylingviewexample.holder;

import java.util.ArrayList;

public class Holder {
    public static ArrayList<String> arrayList=new ArrayList<>();

    public static ArrayList<String> getArrayList() {
        return arrayList;
    }

    public static void setArrayList(ArrayList<String> arrayList) {
        Holder.arrayList = arrayList;
    }
}
