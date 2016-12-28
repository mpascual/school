// Game Zone homework
import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
       String noun1;
       String noun2;
       String adj;
       String ptverb;

       Scanner inputDevice = new Scanner(System.in);
       System.out.print("Please enter your first noun >> ");
       noun1 = inputDevice.nextLine();
       System.out.print("Please enter your second noun >> ");
       noun2 = inputDevice.nextLine();
       System.out.print("Please enter an adjective >> ");
       adj = inputDevice.nextLine();
       System.out.print("Please enter a past tense verb >> ");
       ptverb = inputDevice.nextLine();

       System.out.println("Mary had a little " + noun1);
       System.out.println("Its " + noun2 + " was " + adj +
           " as snow");
       System.out.println("And everywhere that Mary " + ptverb);
       System.out.println("The " + noun1 + " was sure to go.");
    }
}
