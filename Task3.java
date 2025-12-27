public class Task3 {
    public static void main(String[] args) {
        DischargeStack stack = new DischargeStack();

        stack.push(new DischargeRecord(333));
        stack.push(new DischargeRecord(777));
        stack.push(new DischargeRecord(666));
        stack.push(new DischargeRecord(1007));
        stack.push(new DischargeRecord(160));

        System.out.println("\nAfter adding 5 new records: ");
        stack.printStack();

        System.out.println("\nProcessing 3 recirds: ");
        for (int i = 0; i < 3; i++) {
            DischargeRecord processed = stack.pop();
            if (processed != null) {
                System.out.println(processed);
            }
        }

        System.out.println("\nAfter removing 3 records: ");
        stack.printStack();

    }
}



