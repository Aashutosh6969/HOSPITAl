package model;

import java.util.Scanner;

public class Patient extends Ward{
    String username;
    String patient_name ;
    String patient_address;
    int patient_phone;

    public String getUsername() {
        return username;

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_address() {
        return patient_address;
    }

    public void setPatient_address(String patient_address) {
        this.patient_address = patient_address;
    }

    public int getPatient_phone() {
        return patient_phone;
    }

    public void setPatient_phone(int patient_phone) {
        this.patient_phone = patient_phone;
    }



    public Patient(String ward_name, String username, String patient_name, String patient_address, int patient_phone) {
        super(ward_name);
        this.username = username;
        this.patient_name = patient_name;
        this.patient_address = patient_address;
        this.patient_phone = patient_phone;
    }


    @Override
    public void printFormat2(){
        super.printFormat2();
        System.out.println("Username :" + this.getUsername());
        System.out.println("Name :" + this.getPatient_name());
        System.out.println("Address :" + this.getPatient_address());
        System.out.println("Phone :" + this.getPatient_phone());
    }



}
