public class TwelveInts {
  public static void main(String[] args) {
    int[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    System.out.println("Counting from first to last");
    for(int x = 0; x <= 11; x++) {
      System.out.println(integers[x]);
    }
    System.out.println("\nCounting last to first..");
    // reverse array
    for(int y = 11; y >= 0; y--) {
      System.out.println(integers[y]);
    }
  }
}
