public class StudentGradeParser {
    public static void main(String[] args) {
        String[] grades = {"90", "A+", "85", "B", "75"};
        for (String grade : grades) {
            try {
                int g = Integer.parseInt(grade);
                System.out.println("Valid grade: " + g);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + grade);
            }
        }
    }
}
