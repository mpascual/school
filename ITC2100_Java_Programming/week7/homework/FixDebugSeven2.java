// Program prompts user to enter a series of integers
// separated by spaces
// Program converts them to numbers and sums them
import java.util.*;
public class FixDebugSeven2
{
   public static void main(String[] args)
   {
      String str;
      int x;
      int length;
      int start = 0;
      int num;
      int lastSpace = -1;
      int sum = 0;
      String partStr;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a series of integers separated by spaces >> ");
      str = in.nextLine();
      length = str.length();
      for(x = 0; x < length; ++x)
      {
         lastSpace++;
         if(str.charAt(x) == ' ')
         {
             lastSpace++;
             partStr = str.substring(x + 1, lastSpace + 1);
             num = Integer.parseInt(partStr);
             System.out.println("                " + num);
             sum = sum + num;
             lastSpace = x;
          } 
      }
      partStr = str.substring(0, 1);
      num = Integer.parseInt(partStr);
      System.out.println("                " + num);
      sum = sum + num;
      System.out.println("         -------------------" +
         "\nThe sum of the integers is " + sum);
   }
}
