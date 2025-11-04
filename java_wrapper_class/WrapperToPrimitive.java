public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double obj = 45.67; // Wrapper

        double d = obj.doubleValue(); // Wrapper → double
        int i = (int) obj.doubleValue(); // Casting to int

        System.out.println("Double object: " + obj);
        System.out.println("Primitive double: " + d);
        System.out.println("Converted int: " + i);
    }
}
