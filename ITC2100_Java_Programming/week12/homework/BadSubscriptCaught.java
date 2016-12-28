import java.util.*;

public class BadSubscriptCaught {
  public static void main(String[] args) {
    String[] firstNames = {"Andy", "Andrew", "Michael", "Eric", "Brian", "Gordon", "Rich", "Adam", "Dale", "Cornell"};
    String pos;

    try {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter position from 0-9 >>");
      pos = input.nextLine();
      int newpos = Integer.parseInt(pos);
      System.out.println("You chose first name " + firstNames[newpos]);
    }
    catch(ArrayIndexOutOfBoundsException e) {
       System.out.println("You chose a number that is out of range: " + e);
       System.exit(1);
    }
  }
}
