//Author: Andy Molina
import java.util.*;
public class Checkerboard
{
   // Main Method
   public static void main(String args[])
   {
      // Initializing variables and Scanner object 
      Scanner input = new Scanner(System.in);
      String cmd;
      int n = 0;
      
      // Asking for Input for the size of the checkerboard
      System.out.println("Enter an integer for the size of the checkerboard: ");
      cmd = input.nextLine();
      
      // Error checking user input
      try 
      {
         n = Integer.parseInt(cmd);
      } 
      catch (NumberFormatException e) 
      {
         System.err.println("Argument '" + cmd + "' must be an integer.");
         System.exit(1);
      }
   
      // Initializing Empty Checkerboard 
      String[][] board = new String[n][n*2];
   
      // Fills out checkerboard accordingly in a checkerboard pattern
      for(int i=0;i<board.length;i++)
      {
         for(int j=0;j<board[i].length;j++)
         {
            board[i][j] = "*"; // put a star in every odd positition
            if((i+j) % 2 == 0) // for every other row reverse pattern to create the pattern
               board[i][j] = "*"; 
            else
               board[i][j] = " "; // put a space in every even posistion
         }
      }
   
      //Print Checkerboard out
      for(int i=0;i<board.length;i++)
      {
         for(int j=0;j<board[i].length;j++)
         {
            System.out.print(board[i][j]);
         }
         System.out.println("");
      }
   }
}
