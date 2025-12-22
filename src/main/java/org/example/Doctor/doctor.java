package org.example.Doctor;

public class doctor {
    private String fullName;
    private String specialization;
    private int experience;

    public doctor(String fullName, String specialization, int experience) {
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
    public String toString() {
        return "doctor: " + fullName + ", specialization: " + specialization + ", experience: " + experience;
    }

    // Пример main для проверки
    public static void main(String[] args) {
        doctor d1 = new doctor("John Smith", "Cardiologist", 7);
        doctor d2 = new doctor("Alice Brown", "Pediatrician", 3);

        d1.checkExperience();
        d2.checkExperience();

        System.out.println(d1);
        System.out.println(d2);
    }
}

