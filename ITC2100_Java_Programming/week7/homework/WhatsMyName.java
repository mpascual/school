// 1)  Write a class to manipulate a string made up of a person's first name, middle initial, and last name. The entire name has to be created as one field and not three separate fields. The entire name must also been created as a mixture of uppercase and lowercase letters which simply is not proper. Your goal is to output the three components of the name as separate fields with proper uppercase and lowercase letters.
import java.util.Scanner;

public class WhatsMyName {
  public static void main(String[] args) {
    //String fullName = "marinobpascual"; // my full name in lowercase
    String fullName;
    String originalName;

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your first name, middle initial and last name");
    fullName = input.nextLine();
    originalName = fullName;
    fullName = originalName.toLowerCase();

    // convert names to proper way
    int fullNameLength = fullName.length();
    int x;

    for(x = 0; x < fullNameLength; x++) {
      char c = fullName.charAt(x);
      if(x == 0) {
	// change first name
        c = Character.toUpperCase(c);
	fullName = c + fullName.substring(1, fullNameLength);
      }
      else {
        if(fullName.charAt(x) == ' ') {
	  ++x;
	  c = fullName.charAt(x);
	  c = Character.toUpperCase(c);
	  fullName = fullName.substring(0, x) + c + fullName.substring(x + 1, fullNameLength);
        }
      }
    }
    System.out.println("\nOriginal name was " + originalName + "\nRepaired name is " + fullName);
  }
}
