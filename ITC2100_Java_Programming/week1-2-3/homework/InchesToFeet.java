// Homework, week 2.

public class InchesToFeet {
    public static void main(String[] args) {
        final int inches = 86;
        final int inchesPerFoot = 12;
         
        int inchesConverted = inches / inchesPerFoot;
        int remainder = inches % inchesPerFoot;

        System.out.println("Final answer is " + inchesConverted +
            " feet and " + remainder + " inches");
    }
}
