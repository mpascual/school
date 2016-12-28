import java.util.*;

public class DemoHorses {
  public static void main(String[] args) {
    String name;
    String color;
    int birthYear;
    int races; // for subclass inherting parent class

    // use parent class
    Horse firstHorse = new Horse();
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter horse name: ");
    name = keyboard.nextLine();
    firstHorse.setName(name);

    System.out.print("Enter horse color: ");
    color = keyboard.nextLine();
    firstHorse.setColor(color);

    System.out.print("Enter horse birth year: ");
    birthYear = keyboard.nextInt();
    firstHorse.setBirthYear(birthYear);

    System.out.println("\nRegular horse info: \n" + "Name: " + firstHorse.getName() +
      "\nColor: " + firstHorse.getColor() + "\nBirth Year: " +
      firstHorse.getBirthYear());

    // use subclass
    RaceHorse raceHorse = new RaceHorse();
    System.out.print("\nEnter number of races for " + firstHorse.getName() +
      " who is color " + firstHorse.getColor() + " and was born in year " +
      firstHorse.getBirthYear() + ": ");
    races = keyboard.nextInt();
    raceHorse.setRaces(races);
    System.out.println("Race horse number of races: " + raceHorse.getRaces());   
  }
}
