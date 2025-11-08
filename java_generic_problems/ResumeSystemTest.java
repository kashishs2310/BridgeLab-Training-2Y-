import java.util.*;

abstract class JobRole {
    String title;
    JobRole(String title) { this.title = title; }
    public String toString() { return title; }
}

class SoftwareEngineer extends JobRole { SoftwareEngineer() { super("Software Engineer"); } }
class DataScientist extends JobRole { DataScientist() { super("Data Scientist"); } }
class ProductManager extends JobRole { ProductManager() { super("Product Manager"); } }

class Resume<T extends JobRole> {
    private T role;
    Resume(T role) { this.role = role; }
    public void process() { System.out.println("Processing resume for " + role); }
}

class ScreeningPipeline {
    public static void handleRoles(List<? extends JobRole> roles) {
        for (JobRole role : roles)
            System.out.println("Screening role: " + role);
    }
}

public class ResumeSystemTest {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = new Resume<>(new SoftwareEngineer());
        r1.process();

        List<JobRole> allRoles = Arrays.asList(new DataScientist(), new ProductManager());
        ScreeningPipeline.handleRoles(allRoles);
    }
}
