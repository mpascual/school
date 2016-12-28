import java.util.*;

public class ThrowApartmentException {
  public static void main(String[] args) throws ApartmentException {
    try {
      Apartment apt1 = new Apartment();
      Apartment apt2 = new Apartment();
      Apartment apt3 = new Apartment();
      Apartment apt4 = new Apartment();
      Apartment apt5 = new Apartment();
      Apartment apt6 = new Apartment();
     
      // Address /  apartment number / number of bedrooms / rent value 
      apt1.setInfo("3 Plaza View Lane", 100, 0, 2500); // trigger bedroom under alert
      apt2.setInfo("3 Plaza View Lane", 101, 5, 2500); // trigger bedroom over alert
      apt3.setInfo("3 Plaza View Lane", 99, 2, 2500); // trigger apartment number less than 3 digits
      apt4.setInfo("3 Plaza View Lane", 103, 3, 400); // trigger apartment rent under 500
      apt5.setInfo("3 Plaza View Lane", 104, 4, 2600); // trigger apartment rent over 2500
      apt6.setInfo("3 Plaza View Lane", 105, 3, 2500); // one good apartment set

      apt1.getInfo();
      apt2.getInfo();
      apt3.getInfo();
      apt4.getInfo();
      apt5.getInfo();
      apt6.getInfo();
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}
