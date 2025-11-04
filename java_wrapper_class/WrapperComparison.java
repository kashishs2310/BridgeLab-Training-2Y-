public class WrapperComparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println("a == b : " + (a == b)); // true (cache range -128 to 127)
        System.out.println("c == d : " + (c == d)); // false (outside cache range)
        System.out.println("a.equals(b) : " + a.equals(b)); // true

        System.out.println("\nExplanation:");
        System.out.println("Java caches Integer objects between -128 and 127.");
        System.out.println("So 'a' and 'b' point to the same object, but 'c' and 'd' do not.");
    }
}
