package org.example.Hospital;

import org.example.Doctor.doctor;

public class hospital {
    private String name;
    private String address;
    private doctor chiefDoctor;

    public hospital(String name, String address, doctor chiefDoctor) {
        this.name = name;
        this.address = address;
        this.chiefDoctor = chiefDoctor;
    }

    public void hospitalInfo() {
        System.out.println("Hospital: " + name);
        System.out.println("Address: " + address);
        System.out.println("Chief Doctor: " + chiefDoctor.getFullName());
    }
}
