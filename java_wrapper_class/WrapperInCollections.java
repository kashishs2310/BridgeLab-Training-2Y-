import java.util.*;

public class WrapperInCollections {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> priceList = new ArrayList<>();

        for (double p : prices)
            priceList.add(p); // auto-boxing

        double max = Collections.max(priceList);
        double avg = priceList.stream().mapToDouble(Double::doubleValue).average().orElse(0);

        System.out.println("Highest price: " + max);
        System.out.println("Average price: " + avg);
    }
}
