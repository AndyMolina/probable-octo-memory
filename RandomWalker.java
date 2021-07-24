//Author: Andy Molina
import java.util.*;
public class RandomWalker
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int x=0;
      int y=0;
      String cmd = "";
      int n=0;
      int w=0;
   
      System.out.println("Enter a number");
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
      
      for(int i=0;i<n;i++)
      {
         w = (int) (Math.random()*4+1);
         
         if(w == 1)
            y += 1;
      
         if(w == 2)
            x += 1;
      
         if(w == 3)
            y = y-1;
      
         if(w == 4)
            x = x-1;
            
         System.out.println("("+x+"), ("+y+")");    
      }
      System.out.println("Squared distance: "+((x*x)+(y*y)));
   
   }
}