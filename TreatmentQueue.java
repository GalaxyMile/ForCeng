public class TreatmentQueue {
    private class Node {
        TreatmentRequest request;
        Node next;

        Node(TreatmentRequest request) {
            this.request = request;
            this.next = null;
        }
    }

    private Node firstNode;
    private Node lastNode;
    private int size;

    public TreatmentQueue() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    public void enqueue(TreatmentRequest request) { //Requesting adding to the endo f the queue
        if (request == null) {
            return;
        }
        Node newNode = new Node(request);
        if (firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
        size++;
    }

    public TreatmentRequest dequeue() { //
        if (firstNode == null) {
            return null;
        }
        TreatmentRequest request = firstNode.request;
        firstNode = firstNode.next;
        size--;

        if (firstNode == null) {
            lastNode = null;
        }
        return request;
    }

    public int size() {
        return size;
    }


    public void printQueue() { //pRinting requests from first to last
        Node current = firstNode;
        while (current != null) {
            System.out.println(current.request);
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == size;
    }
}









