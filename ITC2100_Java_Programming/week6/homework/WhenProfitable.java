// Gross profit in year 1 projected to be $20,000
// Expenses first year = 35,000
// Net profit or loss is gross profit minus expenses
// Gross profits increase 10% each yr
// Expenses are expected to increase 4% each yr
// Each year display gross profit/expenses/net profit
// Display the final year when net profit is positive
public class WhenProfitable {
  public static void main(String[] args) {
    int year = 0; // start of our counter
    int years = 20; // Iterate for this many years
    double grossProfit = 20000;
    double expenses = 35000;
    double netProfit = grossProfit - expenses;
    final double annualGrossProfit = 0.10;
    final double annualExpense = 0.04;
    boolean positive = true; // our loop control variable (p303)

    while(year < years) {
      year = year + 1;
      if(year == 1) {
        System.out.println("Year " + year + " gross profit: " + grossProfit +
	". Expenses: " + expenses + ". Net Profit: " + netProfit + ".");
        year = year + 1;
      }

      grossProfit = (grossProfit * annualGrossProfit) + grossProfit;
      int grossProfitInt = (int) grossProfit; // convert to be human readable
      netProfit = grossProfit - expenses;
      int netProfitInt = (int) netProfit;
      expenses = (expenses * annualExpense) + expenses;
      int expensesInt = (int) expenses;

      if(netProfit > 0 && positive) {
        System.out.println("*** netProfit is positive in year " + year + ".");
        positive = false;
      }

      System.out.println("Year " + year + " gross profit: " + grossProfitInt +
	". Expenses: " + expensesInt + ". Net Profit: " + netProfitInt + ".");
    }
  }
}
