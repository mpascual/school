class Emprec {
 String name;
 double hours;
 double rate;
}

// This class declares an object of type Box.
class Emp_Ex {
 public static void main(String args[]) {
 Emprec employee = new Emprec();
 double employee_gross_pay;
 // Let's assign values to employee's instance variables
 employee.name = " Mary Smith ";
 employee.hours = 40;
 employee.rate = 15.00;
 // Let's compute the gross salary for this employee
 employee_gross_pay = employee.hours * employee.rate;
 // now let's print the output for this employee
 System.out.print(" The gross salary for " + employee.name );
 System.out.println(" is " + employee_gross_pay );
 } // closes out main
} // closes out Emp_Ex
