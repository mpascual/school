import java.util.Scanner;

public class CarCareChoice {
  public static void main(String[] args) {
    String[] services = {"oil change", "tire rotation", "battery check", 
      "brake inspection"};
    String serviceWanted;
    int[] prices = {25, 22, 15, 5};

    Scanner input = new Scanner(System.in);
    System.out.println("oil change?\ntire rotation?\nbattery check?\n" +
      "brake inspection?\n");
    serviceWanted = input.nextLine();

    // subtract the length of array string 'services' because count starts at 0
    for(int x = 0; x <= (services.length - 1); x++) {
      // change case to lowercase to match our services string array
      if(serviceWanted.toLowerCase().equals(services[x])) {
         System.out.println("Customer asked for: " + serviceWanted);
         System.out.println("The cost will be $" +  prices[x]);
         // We found a match, start doing stuff.
         System.exit(0);
      }
    }
    System.out.println("Invalid item.");
  }
}
