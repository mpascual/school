/*
    byte: -128 / 127
    short: -32,768 / 32,767
    int: -2,147,483,648 / 2,147,483,647
    long: -9,223,372,036,854,775,808 / 9,223,372,036,854,775,807
*/

public class DataDemo {
    public static void main(String[] args) {
        final int STATES_IN_US = 50;
        int aWholeNumber = 315;
        String firstName = "Rino";

        System.out.print("The number is ");
        System.out.println(aWholeNumber);
        System.out.println("US States " + STATES_IN_US);
        System.out.println("Name: " + firstName);
    }
}
