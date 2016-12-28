public class FormLetterWriter {
  public static void main(String[] args) {
    String firstname = "Marino";
    String lastname = "Pascual";
    displaySalutation(firstname);
    displaySalutation(firstname, lastname);
  }

  public static void displaySalutation(String lastname) {
    System.out.print("Dear Mr. or Ms. " + lastname + ". ");
    System.out.println("Thank you for your recent order.");
  }

  public static void displaySalutation(String firstname, String lastname) {
    System.out.print("Dear " + firstname + " " + lastname + ". ");
    System.out.println("Thank you for your recent order.");
  }
}
