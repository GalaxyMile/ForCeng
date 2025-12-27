public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    boolean isPriority;

    public TreatmentRequest(int patientId, boolean isPriority) { //It's just constructor with priority
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();
        this.isPriority = isPriority;
    }

    public TreatmentRequest(int patientId) {
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId + ", Priority: " + (isPriority ? "YES" : "NO") +
                ", Arrival Time: " + arrivalTime;
    }

    public boolean isPriority() {
        return isPriority;
    }
}



