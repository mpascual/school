import java.util.Scanner;

public class BookstoreCredit {
  public static void main(String[] args) {
    String student;
    double gpa;
    double credit;

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter student name");
    student = input.nextLine(); 
    System.out.println("Please enter student GPA");
    gpa = input.nextDouble();
    credit = 10 * gpa;

    System.out.println("Student " + student + " has a GPA of " + gpa +
      ". This student has earned $" + credit + " in credit to the bookstore.");
  }
}
