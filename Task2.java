public class Task2 {
    public static void main(String[] args) {
        TreatmentQueue queue = new TreatmentQueue();

        queue.enqueue(new TreatmentRequest(101));
        queue.enqueue(new TreatmentRequest(102));
        queue.enqueue(new TreatmentRequest(103));
        queue.enqueue(new TreatmentRequest(104));
        queue.enqueue(new TreatmentRequest(105));
        queue.enqueue(new TreatmentRequest(106));
        queue.enqueue(new TreatmentRequest(107));
        queue.enqueue(new TreatmentRequest(108));

        System.out.println("After adding 8 Requests:");
        queue.printQueue();

        System.out.println("\nProcessing 3 requests:");
        for (int i = 0; i < 3; i++) {
            TreatmentRequest r = queue.dequeue();
            if (r != null) System.out.println("Processed: " + r);
        }

        System.out.println("\nRamaining requests:");
        queue.printQueue();

        System.out.println("Queue Size: " + queue.size());
    }
}

