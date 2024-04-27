package edu.joshua.firstweek;

public class MyFirstClass {
    public static void main(String[] args) {
        String firstName = "John";
        String lastname = "Doe";

        String fullname = fullName(firstName, lastname);
        System.out.println(fullname);
    }

    public static String fullName(String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
    }
}
