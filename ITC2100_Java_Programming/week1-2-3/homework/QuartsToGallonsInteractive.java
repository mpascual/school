// Interactive version
import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        // Declare variables since they will be asked from System.in
        final int quartsInGallon = 4;
        int quartsForPaint;
        int totalPaint;

        // 1 gallon = 4 quarts
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter quarts needed for paint >> ");
        quartsForPaint = inputDevice.nextInt();
        inputDevice.nextLine();
        System.out.print("Please enter quarts in a gallon >> ");
        quartsInGallon = inputDevice.nextInt();

        System.out.println("A job that needs " + quartsForPaint +
            " quarts requires " + quartsInGallon + " gallons plus 2 quarts");
    }
}
