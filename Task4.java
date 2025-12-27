import java.util.Scanner
public class Task4 {
    public static void main(String[] args) {
        HospitalSystem hospital = new HospitalSystem();

        hospital.addPatient(new Patient(1001, "Felix Pewds", 5, 30));
        hospital.addPatient(new Patient(1002, "Cristiano Ronaldo", 8, 41));
        hospital.addPatient(new Patient(1003, "Gabe Newell", 3, 68));
        hospital.addPatient(new Patient(1004, "Cuman Boru", 9, 1001));
        hospital.addPatient(new Patient(1005, "Clark Kent", 2, 30));
        hospital.addPatient(new Patient(1006, "Bruce Wayne", 7, 31));
        hospital.addPatient(new Patient(1007, "Jackie Chan", 10, 67));
        hospital.addPatient(new Patient(1008, "Eddie Murphy", 4, 55));
        hospital.addPatient(new Patient(1009, "Mithun Chakraborty", 6, 38));
        hospital.addPatient(new Patient(1010, "Emil Shakhvaladov", 1, 21));

        hospital.addTreatmentRequest(1001, false);
        hospital.addTreatmentRequest(1002, true);
        hospital.addTreatmentRequest(1003, false);
        hospital.addTreatmentRequest(1004, true);
        hospital.addTreatmentRequest(1005, false);
        hospital.addTreatmentRequest(1006, false);
        hospital.addTreatmentRequest(1007, true);
        hospital.addTreatmentRequest(1008, false);

        hospital.addDischargeRecord(1009);
        hospital.addDischargeRecord(1010);

        hospital.printSystemState();

        System.out.println("Processing 4 treatment requests:");
        for (int i = 0; i < 4; i++) {
            hospital.processTreatmentRequest();
        }

        hospital.sortPatientsBySeverity();

        hospital.printSystemState();
    }
}
