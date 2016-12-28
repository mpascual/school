class Emprec {
 String name;
 double hours;
 double rate;

 void calc_gross_pay()
 {
 System.out.println(" The gross salary is " + (hours * rate) );
 }// calc_gross_pay
}// Emprec

 // This class declares an object of type Box.
 class Emp_Ex3 {
 public static void main(String args[]) {
 Emprec employee = new Emprec();
 Emprec employee2 = new Emprec();
 double employee_gross_pay;
 // Let's assign values to both employee's objects
 employee.name = " Mary Smith ";
 employee.hours = 40;
 employee.rate = 15.00;
 employee2.name = " Butch Barkley ";
 employee2.hours = 3;
 employee2.rate = 6.25;
 // Let's compute the gross salary for Mary
 //employee_gross_pay = employee.hours * employee.rate;
 // now let's print the output for this employee
 System.out.print(" The gross salary for " + employee.name );
 //This method will replace the commented line
 employee.calc_gross_pay();
 // System.out.println(" is " + employee_gross_pay );
 // Let's compute the gross salary for Butch
 //employee_gross_pay = employee2.hours * employee2.rate;
 // now let's print the output for this employee
 System.out.print(" The gross salary for " + employee2.name );
 //This method will once again replace the commented line
 employee2.calc_gross_pay();
 // System.out.println(" is " + employee_gross_pay );
 }//main
}// Emp_Ex3


