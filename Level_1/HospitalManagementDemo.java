abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

// Subclasses: InPatient, OutPatient
class InPatient extends Patient {
    private double dailyRate;
    private int daysAdmitted;

    public InPatient(int patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted;
    }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}

// Interface: MedicalRecord
interface MedicalRecord {
    void addRecord(String record);

    String viewRecords();
}

// Main Method to Demonstrate Polymorphism
public class HospitalManagementDemo {
    public static void main(String[] args) {
        Patient p1 = new InPatient(1, "ayan", 22, 1000, 5);
        Patient p2 = new OutPatient(2, "vivek", 22, 500);

        Patient[] patients = {p1, p2};

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Bill: " + patient.calculateBill());
        }
    }
}