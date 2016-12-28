public class EmployeeMessages {
  public String empNotNumeric() {
    String errmsg = "The employee number is not numeric.";
    return errmsg;
  }

  public String empNum1000() {
    String errmsg = "The employee number is less than 1000.";
    return errmsg;
  }

  public String empNum9999() {
    String errmsg = "The employee number is more than 9999.";
    return errmsg;
  }

  public String hourlyNotNumeric() {
    String errmsg = "The hourly pay rate is not numeric.";
    return errmsg;
  }

  public String hourly9() {
    String errmsg = "The hourly pay rate is less than $9.00";
    return errmsg;
  }

  public String hourly25() {
    String errmsg = "The hourly pay rate is more than $25.00";
    return errmsg;
  }

}
