public class PassArrayElement {
  public static void main(String[] args) {
    final int NUM_ELEMENTS = 6;
    String[] newEngland = {"Connecticut", "Maine", "Massachusetts",
      "New Hampshire", "Rhode Island", "Vermont"};
    //int[] someNUMS = {5, 10, 15, 20};
    int x, i;

    System.out.print("\n\nAt start of main: ");
    for(x=0; x<NUM_ELEMENTS; ++x) { /// loop to print out array values
      System.out.print(" " + newEngland[x]); // array values at start of main
    }

    System.out.println(); /// prints blank line
    for(x=0; x<NUM_ELEMENTS; ++x) { /// loop to extract array values one at a time and assigns them to methodGetsOneInt(int one)
      methodGetsOneString(newEngland[x]);
    }

    System.out.print("At end of main: ");
    for(x=0; x<NUM_ELEMENTS; ++x) {
      System.out.print(" " + newEngland[x]); /// array values at the end of main
    }

    for(i=1;i<=3;++i) { /// this loop prints out three (any number) blank lines
      System.out.println();
    }

    /* Below this line is a reverse loop routine that permits the output of an array in reverse order. It does not include the methodGetsOneInt(int one) method.
    This would be difficult to accomplish with out the use of an array. With the reverse loop it is easy. You may need this someday!
    */
    System.out.print("Here the array is reversed: ");
    for(x=NUM_ELEMENTS-1; x>=0; --x) { /// the NUM_ELEMENTS has 1 subtracted because NUM_Elements is 4 but array is zero-based so the fourth element is really index [3]
    //System.out.print(x); /// just a debug statement
      System.out.print(" " + newEngland[x]);
    }
    for(i=1;i<=3;++i) { /// this loop prints out three (any number) blank lines
      System.out.println();
    }
  }
  public static void methodGetsOneString(String one) {
    System.out.print("At start of method one is: " + one);
    //one=999; /// this can be any number
    one="New England Test";

    System.out.print(" and at end of method one is: " + one);
    System.out.println(); /// prints blank line
  }
}
