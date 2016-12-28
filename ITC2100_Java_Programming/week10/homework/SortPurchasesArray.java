import java.util.*;
import javax.swing.*;

public class SortPurchasesArray {
  public static void main(String[] args) {
    final String QUIT = "99";
    ArrayList<String> invoice = new ArrayList<String>();
    ArrayList<String> sale = new ArrayList<String>();
    String name;
    String saleN;
    String sort;
    final int LIMIT = 4;

    for(int x = 0; x < LIMIT + 1; ++x) {
      name = JOptionPane.showInputDialog(null, "Enter invoice number or 99 to QUIT");
      if(name.equals("99")) { System.exit(0); }
      invoice.add(name);

      saleN = JOptionPane.showInputDialog(null, "Enter sale amount for invoice " +
        name + " or 99 to QUIT");
      if(saleN.equals("99")) { System.exit(0); }
      sale.add(saleN);
    }

    System.out.println("Invoice: " + invoice + "\nSales: " + sale);

    sort = JOptionPane.showInputDialog(null, "Sort by invoice or sale amount?");
    if(sort.equals("invoice")) {
      System.out.println("Sort by invoice");
    }
    else {
      System.out.println("Sort by sale");
    }

    //Purchase purchase1 = new Purchase();
    //purchase1.setInvoice(invoice);
    //purchase1.setSaleAmount(sale);
   }
}
