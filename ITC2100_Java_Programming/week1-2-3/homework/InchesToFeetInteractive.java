// Homework, week 2.
import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        int inches;
        final int inchesPerFoot = 12;
        
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("How tall are you? (in inches) >> ");
        inches = inputDevice.nextInt();
 
        int inchesConverted = inches / inchesPerFoot;
        int remainder = inches % inchesPerFoot;

        System.out.println("Final answer is " + inchesConverted +
            " feet and " + remainder + " inches");
    }
}

