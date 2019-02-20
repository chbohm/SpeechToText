package com.ccb.odontoplus.model;

public class Patient {

    private String lastName;
    private String firstName;
    private Integer dni;
    private Mouth mouth;

    public Patient() {

    }

    public Patient(String lastName, String firstName, Integer dni) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dni = dni;
        this.mouth = new Mouth();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Mouth getMouth() {
        return mouth;
    }
}
