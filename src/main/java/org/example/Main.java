package org.example;

import org.example.Doctor.doctor;
import org.example.Hospital.hospital;
import org.example.Patient.patient;

public class Main {
    public static void main(String[] args) {

        doctor doc1 = new doctor("John Smith", "Cardiology", 10);
        doctor doc2 = new doctor("Alice Brown", "Neurology", 3);


        doc1.checkExperience();
        doc2.checkExperience();


        hospital h1 = new hospital("City Hospital", "123 Main St", doc1);
        h1.hospitalInfo();

        patient p1 = new patient("Bob White", 45, "Flu");
        patient p2 = new patient("Mary Green", 70, "Diabetes");

        p1.patientInfo();
        p2.patientInfo();
    }
}
