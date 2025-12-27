import java.util.Scanner
public class Task1 {
    public static void main(String[] args) {
        MyPatientList list = new MyPatientList();

        list.insertPatient(new Patient(1, "Jon Snow", 7, 24));
        list.insertPatient(new Patient(2, "Jaqen H'ghar", 4, 60));
        list.insertPatient(new Patient(3, "Timur Taragay Ibn Barlas", 9, 45));
        list.insertPatient(new Patient(4, "Emil Shakhvaladov", 1, 21));
        list.insertPatient(new Patient(5, "Eve Lannister", 3, 18));

        System.out.println("After adding 5 patients:");
        list.printList();

        System.out.println("\nDeleting the patient with the ID 3 ...");
        boolean removed = list.deletePatient(3);
        System.out.println("Deleted: " + removed);

        Patient found = list.findPatient(4);
        if (found != null) {
            System.out.println("\nPatient was found: " + found);
        } else {
            System.out.println("\nPatient with ID 4 was not found.");
        }

        System.out.println("\nFinal Patient List:");
        list.printList();
    }
}

