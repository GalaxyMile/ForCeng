import java.util.*;

public class HospitalSystem {
    private MyPatientList admittedPatients;
    private TreatmentQueue normalQueue;
    private TreatmentQueue priorityQueue;
    private DischargeStack dischargeStack;
    private HashMap<Integer, Patient> patientsLookup;

    public HospitalSystem() {
        admittedPatients = new MyPatientList();
        normalQueue = new TreatmentQueue();
        priorityQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientsLookup = new HashMap<>();
    }

    public void addPatient(Patient patient) { //Adding a new patient
        if (patient == null) return;
        admittedPatients.insertPatient(patient);
        patientsLookup.put(patient.patientId, patient);
    }

    public void addTreatmentRequest(int patientId, boolean isPriority) { //Adding a prioritized treatment request
        TreatmentRequest request = new TreatmentRequest(patientId, isPriority);
        if (isPriority) {
            priorityQueue.enqueue(request);
        } else {
            normalQueue.enqueue(request);
        }
    }

    public void addDischargeRecord(int patientId) { //adding a discharge record
        DischargeRecord record = new DischargeRecord(patientId);
        dischargeStack.push(record);
    }

    public void processTreatmentRequest() { //processing a singhle treatment request
        TreatmentRequest request = null;

        if (!priorityQueue.isEmpty()) {
            request = priorityQueue.dequeue();
        } else if (!normalQueue.isEmpty()) {
            request = normalQueue.dequeue();
        }

        if (request != null) {
            System.out.println("Treated patient ID: " + request.patientId +
                    " (Priority: " + (request.isPriority() ? "YES" : "NO") + ")");
            addDischargeRecord(request.patientId);
        } else {
            System.out.println("No available treatment requests.");
        }
    }


    public void sortPatientsBySeverity() { //Sorting patients according to their injury levels
        List<Patient> patientList = new ArrayList<>();
        admittedPatients.printToList(patientList);

        for (int i = 0; i < patientList.size() - 1; i++) {
            for (int j = 0; j < patientList.size() - i - 1; j++) {
                if (patientList.get(j).severity < patientList.get(j + 1).severity) {
                    Patient temp = patientList.get(j);
                    patientList.set(j, patientList.get(j + 1));
                    patientList.set(j + 1, temp);
                }
            }
        }


        System.out.println("\nPatients sorted by severity (highest first):");
        for (Patient p : patientList) {
            System.out.println(p);
        }
    }


    public void printSystemState() { //printing the system state
        System.out.println("\nHSS:");
        System.out.println("Admitted Patients:");
        admittedPatients.printList();

        System.out.println("\nPriority Treatment Queue:");
        priorityQueue.printQueue();

        System.out.println("\nNormal Treatment Queue:");
        normalQueue.printQueue();

        System.out.println("\nDischarge Records:");
        dischargeStack.printStack();

        System.out.println("\nTotal registered patients: " + patientsLookup.size());
    }
}




