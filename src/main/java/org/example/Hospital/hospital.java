package org.example.Hospital;

import org.example.Doctor.doctor;
import org.example.Patient.patient;

import java.util.ArrayList;
import java.util.List;

public class hospital {

    private String name;
    private String address;
    private doctor chiefDoctor;
    private List<patient> patients = new ArrayList<>();   // data pool

    public hospital(String name, String address, doctor chiefDoctor) {
        this.name = name;
        this.address = address;
        this.chiefDoctor = chiefDoctor;
    }

    public void addPatient(patient p) {
        patients.add(p);
    }

    // поиск
    public patient findPatientByName(String name) {
        for (patient p : patients) {
            if (p.getFullName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // фильтрация
    public List<patient> getElderlyPatients() {
        List<patient> result = new ArrayList<>();
        for (patient p : patients) {
            if (p.getAge() > 60) result.add(p);
        }
        return result;
    }

    public void hospitalInfo() {
        System.out.println("Hospital: " + name);
        System.out.println("Address: " + address);
        System.out.println("Chief Doctor: " + chiefDoctor.getFullName());
        System.out.println("Patients count: " + patients.size());
    }
}

