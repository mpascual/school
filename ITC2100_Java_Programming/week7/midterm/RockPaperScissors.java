import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    String cardPlayer1;
    String cardPlayer2;
    int chosenCard;
    int chosenCard2;
    final int rock = 3;
    final int scissors = 2;
    final int paper = 1;
    final String rockString = "rock";
    final String scissorsString = "scissors";
    final String paperString = "paper";

    Scanner input = new Scanner(System.in);
    System.out.println("Player1: enter rock, paper or scissors (case sensitive)");
    cardPlayer1 = input.nextLine();
    // convert cardPlayer1 (string to int)
    
    System.out.println("Player2: rock, paper or scissors?");
    cardPlayer2 = input.nextLine();
 
    switch(cardPlayer1) {
      case(rockString):
        chosenCard = rock;
        break;
      case(scissorsString):
        chosenCard = scissors;
        break;
      case(paperString):
        chosenCard = paper;
        break;
      default:
        chosenCard = 0;
    }

    switch(cardPlayer2) {
      case(rockString):
        chosenCard2 = rock;
        break;
      case(scissorsString):
        chosenCard2 = scissors;
        break;
      case(paperString):
        chosenCard2 = paper;
        break;
      default:
        chosenCard2 = 0;
    }

    System.out.println("\nPlayer 1 entered " + cardPlayer1 + ".\nPlayer 2 chose: " +
      cardPlayer2 + ".");

    if (chosenCard == 0 || chosenCard2 == 0) {
      System.out.println("Player 1 or 2, did not chose rock, paper or scissors.");
      System.exit(0);
    }
    if (chosenCard > chosenCard2) { System.out.println("Player 1 wins."); }
    if (chosenCard < chosenCard2) { System.out.println("Player 2 wins."); }
    if (chosenCard == chosenCard2) { System.out.println("Draw."); }
  }
}
