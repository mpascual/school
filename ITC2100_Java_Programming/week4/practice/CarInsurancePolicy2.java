public class CarInsurancePolicy2 {
  private int policyNumber;
  private int numPayments;
  private String residentCity;

  public CarInsurancePolicy2(int num, int payments, String city) {
    policyNumber = num;
    numPayments = payments;
    residentCity = city;
  }

  public CarInsurancePolicy2(int num, int payments) {
    /* policyNumber = num;
    numPayments = payments;
    residentCity = "Mayfield"; */
    this(num, payments, "Mayfield");
  }

  public CarInsurancePolicy2(int num) {
    /* policyNumber = num;
    numPayments = 2;
    residentCity = "Mayfield"; */
    this(num, 2, "Mayfield");
  }

  public void display() {
    System.out.println("Policy #" + policyNumber + ". " + numPayments + " payments anually. Driver resides in " + residentCity + ".");
  }
}
  
