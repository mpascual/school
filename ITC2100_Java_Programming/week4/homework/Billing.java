public class Billing {
  double tax;

  public static void main(String[] args) {
    computeBill(10.99);  // Order a book at the price of 10.99 per book
    computeBill(10.99, 3); // Order 3 books at the price of 10.99 per book
    computeBill(10.99, 3, 50); // Order 3 books at the price of 10.99 per book with a 50% discount coupon.
  }

  public static void computeBill(double price) {
    double tax = 0.08;
    double bookPrice = price;
    double totalTax= bookPrice * tax;
    double totalOrder = totalTax + bookPrice;
    System.out.println("Total price for photo book ordered: $" + totalOrder);
  }

  public static void computeBill(double price, int quantity) {
    double tax = 0.08;
    double totalTax = (price * quantity) * tax;
    double totalPrice = price * quantity;
    double totalOrder = totalPrice + totalTax;
    System.out.println("Total price for photo book ordered: $" + totalOrder + ". Quantity: " + quantity);
  }

  public static void computeBill(double price, int quantity, double coupon) {
    double tax = 0.08;
    double totalTax = (price * quantity) * tax;
    double totalPrice = price * quantity;
    double totalOrderBeforeDiscount = totalPrice + totalTax;
    double totalOrder = totalOrderBeforeDiscount * (coupon / 100);
    System.out.println("Total price for photo book ordered: $" + totalOrder + ". Quantity: " + quantity + ". Discount rate of: " + coupon + "%.");
  }
}
