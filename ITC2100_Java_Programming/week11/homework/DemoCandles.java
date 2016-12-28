import java.util.*;

public class DemoCandles {
  public static void main(String[] args) {
    String color;
    String height;
    int price;
    String scent; // for subclass

    Candle firstCandle = new Candle();
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Color of candle? ");
    color = keyboard.nextLine();
    firstCandle.setColor(color);

    System.out.print("Height of candle? ");
    height = keyboard.nextLine();
    firstCandle.setHeight(height);
    // the price per inch has been set by this setter for height

    System.out.print("\nColor of the candle is: " + firstCandle.getColor() +
      " and the height is " + firstCandle.getHeight() + " and its price is " +
      firstCandle.getPrice() + " per inch.");

    // use subclass scented candles
    ScentedCandle scentedCandle = new ScentedCandle();
    System.out.print("\nEnter the scent for this new candle: ");
    scent = keyboard.nextLine();
    scentedCandle.setScent(scent);

    System.out.print("Enter the height for the new scented candle: ");
    height = keyboard.nextLine();
    scentedCandle.setHeight(height);

    System.out.println("\nThe new candle has a scent of " + scentedCandle.getScent() +
      " and a height of " + scentedCandle.getHeight() + " with the price of " +
      scentedCandle.getPrice() + " per inch.");
  }
}
