import java.util.*;

public class EmployeeDataProcessing {
    public static void main(String[] args) {
        int[] ages = {25, 32, 29, 41, 22};
        ArrayList<Integer> ageList = new ArrayList<>();

        for (int age : ages)
            ageList.add(age); // auto-boxing

        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        System.out.println("Youngest age: " + youngest);
        System.out.println("Oldest age: " + oldest);
    }
}
