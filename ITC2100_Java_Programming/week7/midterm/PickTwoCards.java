public class PickTwoCards {
  public static void main(String[] args) {
    // Our Game Zone problem asks for 2 playing cards
    Card card1 = new Card();
    Card card2 = new Card();

    final int CARDS_IN_SUIT = 13;
    int myValue;
    int secondValue;

    // Generate random value
    myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
    secondValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);

    System.out.println("myValue: " + myValue);
    System.out.println("secondValue: " + secondValue + "\n");

    // Test
    card1.setNum(myValue); // set our random value
    card1.setSuit('s'); // set our suit

    card2.setNum(secondValue); // set our random value
    card2.setSuit('d'); // set our suit

    System.out.println("Value sent was: " + card1.getNum() + ". The suit is: " +
      card1.getSuit() + ".");

    System.out.println("Value sent was: " + card2.getNum() + ". The suit is: " +
      card2.getSuit() + ".");
  }
}
