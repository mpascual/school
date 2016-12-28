import java.util.Scanner;

public class CreatePurchase {
  public static void main(String[] args) {
    int invoice;
    double sale;
    double tax;
    Purchase purchase1 = new Purchase();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Invoice Number (1000-8000)");
    invoice = input.nextInt();

    while(invoice < 1000 || invoice > 8000) {
      System.out.println("Invoice number entered does not fall in the range " +
        "of 1000-8000");
      System.out.println("Enter Invoice Number (1000-8000)");
      invoice = input.nextInt();
    }

    System.out.println("Enter Sale Amount (must be over zero)");
    sale = input.nextDouble();

    while(sale <= 0) {
      System.out.println("Sale amount must be over 0.");
      System.out.println("Enter Sale Amount (must be over zero)");
      sale = input.nextDouble();
    }

    // set inputs using object from Purchase class
    purchase1.setInvoice(invoice);
    purchase1.setSaleAmount(sale);
    purchase1.displayDetails();
   }
}
