package org.example.Doctor;

import org.example.Person;

public class doctor extends Person {

    private String fullName;
    private String specialization;
    private int experience;

    public doctor(String fullName, int age, String specialization, int experience) {
        super(fullName, age);        // наследование
        this.fullName = fullName;
        this.specialization = specialization;
        this.experience = experience;
    }

    public void checkExperience() {
        if (experience > 5) {
            System.out.println(fullName + " is experienced.");
        } else {
            System.out.println(fullName + " is a junior doctor.");
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String getRole() {        // полиморфизм
        return "Doctor";
    }

    @Override
    public String toString() {       // override
        return "Doctor: " + fullName + ", age: " + age +
                ", specialization: " + specialization +
                ", experience: " + experience;
    }
}


