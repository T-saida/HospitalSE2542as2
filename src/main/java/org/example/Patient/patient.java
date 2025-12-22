package org.example.Patient;

public class patient {
    public String name;
    public int age;
    public String disease;

    public patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public void patientInfo() {
        System.out.println("Patient: " + name + ", Age: " + age + ", Disease: " + disease);

        if (age > 60) {
            System.out.println("This patient is elderly.");
        } else {
            System.out.println("This patient is not elderly.");
        }
    }
}
