public class Purchase {
  int invoice;
  double saleAmount;
  double salesTax = 0.05; // Sales tax is %5.00

  public void setInvoice(int invoiceValue) {
    invoice = invoiceValue;
  }
  public void setSaleAmount(double saleAmountValue) {
    saleAmount = saleAmountValue;
  }
  public void setSalesTax(double salesTaxValue) {
    salesTax = salesTaxValue;
  }

  // get methods
  public int getInvoice() {
    return invoice;
  }
  public double getSaleAmount() {
    return saleAmount;
  }

  public void displayDetails() {
    double salesTaxTotal = salesTax * saleAmount;
    System.out.println("Invoice Number: " + invoice);
    System.out.println("Sale Amount: " + saleAmount);
    System.out.println("Sales Tax: " + salesTaxTotal);
  }
}
