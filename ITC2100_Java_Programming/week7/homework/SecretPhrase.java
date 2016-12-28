import java.util.Scanner;

public class SecretPhrase {
  public static void main (String[] args) {
    String hiddenPhrase = "Black Cup";
    String guessPhrase = "B**** C**";
    String letter;
    int pos;

    // Display secret phrase to our user
    System.out.println("Secret Phrase: " + guessPhrase + "\n");

    // Prompt user to guess a letter
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your guess letter:");
    letter = input.nextLine();

    // Exit if user inputs more than 1 letter
    if(letter.length() > 1) {
      System.out.println("You entered more than 1 letter");
      System.exit(1);
    }

    // Work the logic
    while(hiddenPhrase.indexOf(letter) != -1) {
      pos = hiddenPhrase.indexOf(letter);
      System.out.println("Letter is in our secret phrase!\n");

      // Put phrase together
      guessPhrase = guessPhrase.substring(0, pos) + letter +
        guessPhrase.substring(pos + 1, guessPhrase.length());
      System.out.println("Secret Phrase: " + guessPhrase);
      if (guessPhrase.indexOf('*') == -1) {
        System.out.println("You guessed our phrase!");
        System.exit(0);
      }

      // Power on
      System.out.println("Enter your next guess letter:");
      letter = input.nextLine();

      while(hiddenPhrase.indexOf(letter) == -1) {
	System.out.println("The letter you guessed: '" + letter +
          "' is not part" + " of our secret phrase!");
	System.out.println("Enter your guess letter:");
	letter = input.nextLine();
      }
    }

    if(hiddenPhrase.indexOf(letter) == -1) {
      System.out.println("The letter you guessed: '" + letter + "' is not part" +
        " of our secret phrase!");
    }
  }
}
