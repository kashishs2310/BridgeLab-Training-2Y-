import java.util.*;

public class ReverseStringStack {
    public static void main(String[] args) {
        String input = "Kashish";
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
