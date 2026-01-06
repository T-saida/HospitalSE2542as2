import org.example.Doctor.doctor;
import org.example.Hospital.hospital;
import org.example.Patient.patient;

public class Main {
    public static void main(String[] args) {


        doctor doc1 = new doctor("John Smith", 45, "Cardiology", 10);
        doctor doc2 = new doctor("Alice Brown", 35, "Neurology", 3);

        doc1.checkExperience();
        doc2.checkExperience();

        hospital h1 = new hospital("City Hospital", "123 Main St", doc1);

        patient p1 = new patient("Bob White", 45, "Flu");
        patient p2 = new patient("Mary Green", 70, "Diabetes");

        h1.addPatient(p1);
        h1.addPatient(p2);

        h1.hospitalInfo();

        System.out.println("\n--- All Patients ---");
        p1.patientInfo();
        p2.patientInfo();

        System.out.println("\n--- Search for Mary Green ---");
        patient searchResult = h1.findPatientByName("Mary Green");
        if (searchResult != null) {
            System.out.println("Found: " + searchResult);
        }

        System.out.println("\n--- Elderly Patients ---");
        for (patient p : h1.getElderlyPatients()) {
            System.out.println(p);
        }
    }
}


