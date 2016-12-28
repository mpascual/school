public class Apartment {
  String address;
  int aptNumber, aptBedroom, aptRent;

  public String aptDigits() {
    String errmsg = "The apartment number does not consist of three digits.";
    return errmsg;
  }

  public String aptBedrooms() {
    String errmsg = "The apartment has less than 1 or more than 4.";
    return errmsg;
  }

  public String aptRent() {
    String errmsg = "The apartment rent cannot be less than $500 or over $2,500.";
    return errmsg;
  }

  public void setInfo(String addr, int aptNum, int aptBed, int aptCost) {
    //int length = String.valueOf(aptNum).length();
    address = addr;
    aptNumber = aptNum;
    aptBedroom = aptBed;
    aptRent = aptCost;
  }

  public void getInfo() throws ApartmentException {
    int length = String.valueOf(aptNumber).length(); 
    if(length < 3) {
      throw new ApartmentException(aptDigits()); 
    }

    int blength = String.valueOf(aptBedroom).length(); 
    if(blength > 1 || blength > 4) {
      throw new ApartmentException(aptBedrooms());
    }

    int rentLength = String.valueOf(aptRent).length(); 
    if(rentLength < 500 || rentLength > 2500) {
      throw new ApartmentException(aptRent());
    }

  }
}
