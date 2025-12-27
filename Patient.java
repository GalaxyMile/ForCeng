public class Patient {
    int patientId;
    String name;
    int severity;
    int age;

    public Patient(int patientId, String name, int severity, int age) {
        this.patientId = patientId;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient Id: " + patientId + ", Name: " + name + ", Severity: " + severity + ", Age: " + age;
    }
}

