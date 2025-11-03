import java.util.ArrayList;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;
    ArrayList<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        patients.add(p);
        System.out.println("Dr. " + name + " is consulting " + p.name);
    }

    void viewPatients() {
        System.out.println("Patients consulted by Dr. " + name + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
        System.out.println();
    }
}

class Hospital {
    String hospitalName;
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(Patient p) {
        patients.add(p);
    }

    public static void main(String[] args) {
        Hospital h = new Hospital("GLA Care Hospital");

        Doctor d1 = new Doctor("Dr. Mehta");
        Doctor d2 = new Doctor("Dr. Kashish");

        Patient p1 = new Patient("Riya");
        Patient p2 = new Patient("Aman");

        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p2);

        d1.viewPatients();
        d2.viewPatients();
    }
}
