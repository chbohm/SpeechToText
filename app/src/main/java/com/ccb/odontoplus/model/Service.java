package com.ccb.odontoplus.model;

import com.google.common.collect.Maps;

import java.util.Date;
import java.util.Map;

public class Service {

    private Date date;
    private Patient patient;
    private Mouth mouth;


    public Service() {
    }

    public void setPatient(Patient patient) {
       mouth = new Mouth();
    }


}
