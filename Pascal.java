//Author: Andy Molina
import java.util.*;
public class Pascal 
{
   //Takes an input of rows, uses that input and sends it to the pascal method, prints out the according triangle size
   public static void print(int n) 
   {
      for (int i = 0; i < n; i++) 
      {
         for (int k = 0; k < n - i; k++) 
         {
            System.out.print(" "); 
         }
         for (int j = 0; j <= i; j++) 
         {
            System.out.print(pascal(i, j) + " ");
         }
         System.out.println();
      }
   }
    
   //Creates the pascal 
   public static int pascal(int i, int j)
   {
      if (j == 0 || j == i) 
      {
         return 1;
      } else 
      {
         return pascal(i - 1, j - 1) + pascal(i - 1, j); //calls on itself
      }
   }
   
   public static void main(String[] args) 
   {
      //Initialize Scanner object
      Scanner scanner = new Scanner(System.in);
      
      //Ask user how many rows
      System.out.print("Enter the number of rows to print: ");
      int rows = scanner.nextInt();
      
      //Print out triangle to user 
      System.out.println("Pascal Triangle:");
      print(rows);
      scanner.close();
   }
}
