// Fibonacci numbers are the numbers in the following integer sequence, called
// the Fibonacci sequence, and characterized by the fact that every number after
// the first two is the sum of the two preceding ones.

public class Fibonacci {
  public static void main(String[] args) {
    int count;

    for(count = 1; count <= 50; count++) {
      long fibonacci = 1;
      long fibonacci1 = 1;
      long fibonacci2 = 1;
      int i;

      if(count == 1 || count == 2) {
        System.out.println("Count: " + count + ". Fibonacci Number: " + "1.");
      }
      else {
	for(i = 3; i <= 50; i++) {
	  fibonacci = fibonacci1 + fibonacci2;
	  fibonacci1 = fibonacci2;
	  fibonacci2 = fibonacci;
	  System.out.println("Count: " + i + ". Fibonacci Number: " +
            fibonacci + ".");
	}
        System.exit(0);
      }
    }
  }
}
