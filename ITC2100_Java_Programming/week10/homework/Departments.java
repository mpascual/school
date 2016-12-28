import java.util.*;

// Include at least 5 departments with supervisors
public class Departments {
  public static void main(String[] args) {
    String deptName;
    //String[][] department = new String[5][5];
    String[][] department = {
                 { "marketing", "Mr. Craven" },
                 { "sales", "Ms. Hodgson" },
                 { "engineering", "Mr. Tinsley" },
                 { "accounting", "Ms. Kilmer" },
                 { "shipping", "Mr. Haley" }
                 };

    for(int a = 0; a <= 4; ++ a) {
      System.out.println("Departments available: " + department[a][0]);
    }

    // take user department input
    Scanner input = new Scanner(System.in);
    System.out.print("\nEnter department name: ");
    deptName = input.nextLine();
    deptName = deptName.toLowerCase(); // convert entry to lowercase
    //System.out.println("Department entered: " + deptName);

    // search our array for text input by user
    for(int x = 0; x <= 4; ++x) {
      int position = Arrays.binarySearch(department[x], deptName);
      if(position == 0) {
        System.out.println("Supervisor for: " + deptName + " department is: " + 
          department[x][position + 1]);
        System.exit(0);
      }
   }
   System.out.println("Department not found.");
  }
}
