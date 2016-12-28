public class TestAutomobiles {
  public static void main(String[] args) {
    Automobile car1 = new Automobile();
    Automobile car2 = new Automobile();
    Automobile car3 = new Automobile();
    Automobile car4 = new Automobile();

    // Example 1 shows all of the set and gets all work with proper values.
    car1.setidNumber(1);
    car1.setMake("Ford");
    car1.setModel("Focus");
    car1.setYear(2010);
    car1.setMpg(30);
    car1.setColor("White");

    System.out.println("Car ID " + car1.getIdNumber() + " is a " + car1.getMake() +
      " " + car1.getModel() + ". Its color is " + car1.getColor() +
      " and was made in the year " + car1.getYear() + ". Its gas mileage is " +
      car1.getMpg() + "mpg.");


    // Example 2 shows if we go over the thresholds set in the book.
    car2.setidNumber(10000); // Purposely set over 9999 to return 0.
    car2.setMake("Honda");
    car2.setModel("Accord");
    car2.setYear(2018); // This is purposely set below year 2000 to return 0.
    car2.setMpg(61); // Purposely set over 60 to return 0.
    car2.setColor("Gray");
    System.out.println("Car ID " + car2.getIdNumber() + " is a " + car2.getMake() +
      " " + car2.getModel() + ". Its color is " + car2.getColor() +
      " and was made in the year " + car2.getYear() + ". Its gas mileage is " +
      car2.getMpg() + "mpg.");

    // Example 3 shows if we go under the thresholds set in the book.
    car3.setidNumber(-1); // Purposely set under 0 to return 0.
    car3.setMake("Porsche");
    car3.setModel("Carrera S");
    car3.setYear(1999); // This is purposely set over year 2017 to return 0.
    car3.setMpg(9); // Purposely set under 10 to return 0.
    car3.setColor("Black");
    System.out.println("Car ID " + car3.getIdNumber() + " is a " + car3.getMake() +
      " " + car3.getModel() + ". Its color is " + car3.getColor() +
      " and was made in the year " + car3.getYear() + ". Its gas mileage is " +
      car4.getMpg() + "mpg.");

    // Example 4 shows a proper example
    car4.setidNumber(4);
    car4.setMake("Toyota");
    car4.setModel("Prius");
    car4.setYear(2012);
    car4.setMpg(50);
    car4.setColor("Blue");
    System.out.println("Car ID " + car4.getIdNumber() + " is a " + car4.getMake() +
      " " + car4.getModel() + ". Its color is " + car4.getColor() +
      " and was made in the year " + car4.getYear() + ". Its gas mileage is " +
      car4.getMpg() + "mpg.");
  }
}
