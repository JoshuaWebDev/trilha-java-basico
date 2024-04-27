public class VariablesTypes {
    public static void main(String[] args) throws Exception {
        // variables types examples
        double salary = 2500.33;
        short shortNumber = 1;
        int normalNumber = shortNumber;
        short shortNumber2 = (short) normalNumber;

        // constants examples
        final double VALOR_DE_PI = 3.14;

        System.out.println("Double: " + salary);
        System.out.println("Integer: " + shortNumber);
        System.out.println("Constant: " + VALOR_DE_PI);
    }
}
