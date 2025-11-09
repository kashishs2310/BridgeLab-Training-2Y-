import java.util.*;

public class UndoFeature {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Type  2. Undo  3. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter text: ");
                String text = sc.nextLine();
                stack.push(text);
            } 
            else if (choice == 2) {
                if (!stack.isEmpty())
                    System.out.println("Undo: " + stack.pop());
                else
                    System.out.println("Nothing to undo!");
            } 
            else if (choice == 3) {
                break;
            }

            System.out.println("Current stack: " + stack);
        }
        sc.close();
    }
}
