package org.example.Patient;

import org.example.Person;

public class patient extends Person {

    private String disease;

    public patient(String fullName, int age, String disease) {
        super(fullName, age);
        this.disease = disease;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String getRole() {
        return "Patient";
    }

    public void patientInfo() {
        System.out.println(toString());

        if (age > 60) {
            System.out.println("This patient is elderly.");
        } else {
            System.out.println("This patient is not elderly.");
        }
    }

    @Override
    public String toString() {
        return "Patient: " + fullName + ", Age: " + age + ", Disease: " + disease;
    }
}



