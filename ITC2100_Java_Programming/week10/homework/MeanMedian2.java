import java.util.*;

public class MeanMedian2 {
  public static void main(String[] args) {
    int[] numbers = new int[20];
    int comparisonsToMake = numbers.length - 1;
    Scanner keyboard = new Scanner(System.in);
    int a, b, temp;
    int mean = 0;

    for(a = 0; a < numbers.length; ++a) {
      System.out.print("Enter number " + (a + 1) + ": ");
      numbers[a] = keyboard.nextInt();
      mean = mean + numbers[a];;
    }
    System.out.println();
    display("Values Entered", numbers, 0);

    // Calculate mean
    System.out.println("Mean: " + (mean / a));

    // Find the median
    for(a = 0; a < numbers.length - 1; ++a) {
      for(b = 0; b < comparisonsToMake; ++b) {
        if(numbers[b] > numbers[b + 1]) {
          temp = numbers[b];
          numbers[b] = numbers[b + 1];
          numbers[b + 1] = temp;
        }
      }
      --comparisonsToMake;
    }
    int numLength = numbers.length / 2;
    if(numbers.length % 2 == 1) {
      System.out.println("Median: " + numbers[numLength]);
    }
    else {
      System.out.println("Median: " + (numbers[numLength - 1] + numbers[numLength]) / 2.0);
    }
  }

  public static void display(String name, int[] numbers, int a) {
    System.out.print(name + ": ");
    for(int x = 0; x < numbers.length; ++x)
      System.out.print(numbers[x] + " ");
    System.out.println();
  }
}
