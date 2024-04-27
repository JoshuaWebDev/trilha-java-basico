public class Operators {
    public static void main(String[] args) {
        int a, b, c;
        a = 5;
        b = 6;
        c = 6;

        String result = a == b ? "a is equal b" : "a is not equal b";
        System.out.println(result);

        result = b == c ? "b is equal c" : "b is not equal c";
        System.out.println(result);

        String concatenation = "?";

        concatenation = 1 + 1 + 1 + "1";
        System.out.println(concatenation);

        concatenation = 1 + "1" + 1 + 1;
        System.out.println(concatenation);

        concatenation = 1 + "1" + 1 + "1";
        System.out.println(concatenation);

        concatenation = "1" + 1 + 1 + 1;
        System.out.println(concatenation);

        concatenation = "1" + (1 + 1 + 1);
        System.out.println(concatenation);
    }
}
