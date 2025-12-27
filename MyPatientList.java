import java.util.List;

public class MyPatientList {
    private class Node {
        Patient p;
        Node next;

        Node(Patient p) {
            this.p = p;
            this.next = null;
        }
    }

    private Node firstNode;
    private Node lastNode;

    public MyPatientList() {
        firstNode = null;
        lastNode = null;
    }

    public void insertPatient(Patient p) { //Adding a new patient to the end of the list
        Node newNode = new Node(p);
        if (firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }

    public void printToList(List<Patient> list) { //Copying in ArrayList to sort
        Node current = firstNode;
        while (current != null) {
            list.add(current.p);
            current = current.next;
        }
    }

    public boolean deletePatient(int id) { //Deleting a patient using Id number
        if (firstNode == null) {
            return false;
        }
        if (firstNode.p.patientId == id) {
            firstNode = firstNode.next;
            if (firstNode == null) {
                lastNode = null;
            }
            return true;
        }

        Node temp = firstNode;
        while (temp.next != null) {
            if (temp.next.p.patientId == id) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    lastNode = temp;
                }
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public Patient findPatient(int id) { //Finding patient using Id number
        Node temp = firstNode;
        while (temp != null) {
            if (temp.p.patientId == id) {
                return temp.p;
            }
            temp = temp.next;
        }
        return null;
    }

    public void printList() { //Printing the list
        Node temp = firstNode;
        while (temp != null) {
            System.out.println(temp.p);
            temp = temp.next;
        }
    }
}




