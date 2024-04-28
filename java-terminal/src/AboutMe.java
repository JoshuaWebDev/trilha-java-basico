public class AboutMe {
    public static void main(String[] args) {
        String firstname = args[0];
        String lastname = args[1];
        int age = Integer.valueOf(args[2]);
        double height = Double.valueOf(args[3]);

        System.out.println("My name is " + firstname + " " + lastname + ".");
        System.out.println("I have " + age + " years old.");
        System.out.println("My height is " + height + " cm.");
    }
}
