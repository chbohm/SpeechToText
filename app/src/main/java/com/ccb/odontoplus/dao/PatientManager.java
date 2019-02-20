package com.ccb.odontoplus.dao;

import com.ccb.odontoplus.model.Patient;
import com.google.common.collect.Maps;

import java.util.Map;

public class PatientManager {

    static Map<String, Patient> patients = Maps.newHashMap();

    static {
        patients.put("28132661", new Patient("Bohm","Christian",28132661));
        patients.put("28135849", new Patient("Ramirez","Cristela",28135849));
    }

    public static Patient getByDNI(Integer dni) {
        return PatientManager.patients.get(dni);
    }


}
