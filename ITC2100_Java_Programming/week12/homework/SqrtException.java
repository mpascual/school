import java.util.*;
//import java.lang.Math.sqrt;

public class SqrtException {
  public static void main(String[] args) {
    int number;
    try {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number to get the square root >> ");
      number = input.nextInt();
      System.out.println("The square root of " + number + " is " + Math.sqrt(number));

      // force throw exception
      if(number < 0) {
        throw new ArithmeticException();
      }
    }
    catch (ArithmeticException e) {
      System.out.println("ArithmeticException!\nThe number entered was a negative integer");
    }
  }
}
