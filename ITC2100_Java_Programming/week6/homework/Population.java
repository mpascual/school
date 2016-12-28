public class Population {
  public static void main(String[] args) {
    final double mexicoAnnualIncrease = 1.01;
    final double usAnnualDecrease = 0.15;
    double mexicoPopulation = 121000000;
    double usPopulation = 315000000;
    int years = 0;
    double mexicoPopulationIncrease;
    double usPopulationDecrease;

    while(mexicoPopulation < usPopulation) {
      years = years + 1;
      // do calculations to Mexico and US populations
      mexicoPopulationIncrease = mexicoPopulation * mexicoAnnualIncrease; 
      mexicoPopulation = mexicoPopulation + mexicoPopulationIncrease;
      int mexicoPopulationInt = (int) mexicoPopulation;
      System.out.println("New calculated population for Mexico in year " + years + " is " + mexicoPopulationInt + ".");

      usPopulationDecrease = usPopulation * usAnnualDecrease;
      usPopulation = usPopulation - usPopulationDecrease;
      int usPopulationInt = (int) usPopulation;
      System.out.println("New calculated population for United States in year " + years + " is " + usPopulationInt + ".");
      System.out.println("");

      // calculate if the population has finally reached our limit
      if(mexicoPopulation > usPopulation) {
        System.out.println("");
	System.out.println("Mexico's population has exceeded United States in " + years + " years.");
        System.out.println("Mexico's population after " + years + " years is " + mexicoPopulationInt + ".");
        System.out.println("US population after " + years + " years is " + usPopulationInt + ".");
      }
    }
  }
}
