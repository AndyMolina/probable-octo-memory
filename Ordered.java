//author: Andy Molina
import java.util.*;
public class Ordered
{
   public static void main(String [] args)
   {
      //Initializing Variables
      Scanner input = new Scanner(System.in);
      boolean isOrdered = false;
      
      //Recieving Input for 3 Integers
      System.out.println("Enter Integer x: ");
      int x = input.nextInt();
      System.out.println("Enter Integer y: ");
      int y = input.nextInt();
      System.out.println("Enter Integer z: "); 
      int z = input.nextInt();
   
      //Prints out the 3 inputed integers
      System.out.println(x+" "+y+" "+z);
      
      //Compare the integers to each other and check if they are ordered in any way
      //Then print true or false
      if((x>y && y>z) || (x<y && y<z)){
         isOrdered = true;
         System.out.println(isOrdered);
      }
      else
         System.out.println(isOrdered);
         
   
   }
}
