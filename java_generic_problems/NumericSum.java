import java.util.*;

class NumericSum {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list)
            sum += n.doubleValue();
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> dblList = Arrays.asList(2.5, 3.5, 4.5);

        System.out.println("Sum of Integers: " + sumNumbers(intList));
        System.out.println("Sum of Doubles: " + sumNumbers(dblList));
    }
}
