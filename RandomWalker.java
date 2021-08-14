//Author: Andy Molina
import java.util.*;

//Randomly walks a specified number of steps in a random direction in one of 4 directions: North, East, South, West.
public class RandomWalker
{
   public static void main(String[] args)
   {
      //Initialize variables
      Scanner input = new Scanner(System.in);
      int x=0; //x coordinate
      int y=0; //y coordinate
      String cmd = ""; //input String variable
      int n=0; //input int variable
      int w=0; //direction
   
      //Asks user for an integer for the walker 
      System.out.println("Enter a number");
      cmd = input.nextLine();
      //Error checking user input
      try 
      {
         n = Integer.parseInt(cmd);
      } 
      catch (NumberFormatException e) 
      {
         System.err.println("Argument '" + cmd + "' must be an integer.");
         System.exit(1);
      }
      
      for(int i=0;i<n;i++)
      {
         w = (int) (Math.random()*4+1); //picks a random number 1-4
         
         if(w == 1) //if number is 1, move walker north 1 step
            y += 1;
      
         if(w == 2) //if number is 2, move walker east 1 step
            x += 1;
      
         if(w == 3) //if number is 3, move walker south 1 step
            y = y-1;
      
         if(w == 4) //if number is 4, move walker west 1 step
            x = x-1;
            
         System.out.println("("+x+"), ("+y+")");  //print the step coordinates
      }
      System.out.println("Squared distance: "+((x*x)+(y*y))); //prints the total squared distance
   
   }
}
