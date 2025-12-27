public class DischargeStack {
    private class Node {
        DischargeRecord record;
        Node next;
        Node(DischargeRecord record) {
            this.record = record;
            this.next = null;
        }
    }

    private Node head;
    private int size;
    public DischargeStack() {
        head = null;
        size = 0;
    }

    public void push(DischargeRecord record) { // adding a new record to the top
        if (record == null) {
            return;
        }
        Node newNode = new Node(record);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public DischargeRecord pop() { //removing and returning top record
        if (head == null) {
            return null;
        }
        DischargeRecord record = head.record;
        head = head.next;
        size--;
        return record;
    }
    public DischargeRecord peek() { //returning the value of the top record
        if (head == null) {
            return null;
        }
        return head.record;
    }

    public void printStack() { // printing the stack
        Node p = head;
        while (p != null) {
            System.out.println(p.record.toString());
            p = p.next;
        }
    }

    public int  size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }

}
