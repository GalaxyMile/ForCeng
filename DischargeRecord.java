public class DischargeRecord {
    int patientId;
    long dischargeTime;

    public DischargeRecord(int patientId) {
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "Patient Id: " + patientId + ", Discharge Time: " + dischargeTime;
    }
}





