//Author: Andy Molina
import java.util.*;
public class Checkerboard
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      String cmd;
      int n = 0;
      System.out.println("Enter an integer for the size of the checkerboard: ");
      cmd = input.nextLine();
      
      try 
      {
         n = Integer.parseInt(cmd);
      } 
      catch (NumberFormatException e) 
      {
         System.err.println("Argument '" + cmd + "' must be an integer.");
         System.exit(1);
      }
   
      String[][] board = new String[n][n*2];
   
      for(int i=0;i<board.length;i++)
      {
         for(int j=0;j<board[i].length;j++)
         {
            board[i][j] = "*";
            if((i+j) % 2 == 0)
               board[i][j] = "*";
            else
               board[i][j] = " ";
         }
      }
   
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