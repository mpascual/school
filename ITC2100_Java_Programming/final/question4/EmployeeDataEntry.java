import java.util.*;

public class EmployeeDataEntry {
  public static void main(String[] args) throws EmployeeException {
    int empNum;
    int hourlyRate;
    try {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter employee number between 1000-9999 >> ");
      empNum = input.nextInt();
      EmployeeMessages empCheck = new EmployeeMessages();
      
      if(empNum < 1000) {
        // Make exception throw the error generated here.
        throw new EmployeeException(empCheck.empNum1000());
      }
      if(empNum > 9999) {
        throw new EmployeeException(empCheck.empNum9999());
      }

      // let's move forward to hourly rate if all is well at this point
      System.out.print("Enter employee hourly rate between 9 and 25 >> ");
      hourlyRate = input.nextInt();

      if(hourlyRate < 9) {
        throw new EmployeeException(empCheck.hourly9());
      }
      if(hourlyRate > 25) {
        throw new EmployeeException(empCheck.hourly25());
      }
      System.out.println("\nEmployee number " + empNum + " gets paid $" +
        hourlyRate + " per hour");

    }
    catch(InputMismatchException e) {
      System.out.println("The employee number or hourly is not numeric.");
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}
