package com.ccb.odontoplus.model;

import com.google.common.collect.Maps;

import java.util.Map;

public class Mouth {
    private Map<String, Tooth> tooths = Maps.newHashMap();

    public Mouth() {
        createRow(1,8);
        createRow(2,8);
        createRow(3,8);
        createRow(4,8);
        createRow(5,5);
        createRow(6,5);
        createRow(7,5);
        createRow(8,5);
    }

    private void createRow(int base, int numberOfTeeth) {
        int start = base*10+1;
        int end = start + numberOfTeeth - 1;
        for (int i = start; i<=end; i++) {
            String number = ""+i;
            tooths.put(number, new Tooth(number));
        }
    }
}
