//author: Andy Molina
import java.util.*;
public class Ordered
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      boolean isOrdered = false;
      
      System.out.println("Enter Integer x: ");
      int x = input.nextInt();
      System.out.println("Enter Integer y: ");
      int y = input.nextInt();
      System.out.println("Enter Integer z: "); 
      int z = input.nextInt();
   
      System.out.println(x+" "+y+" "+z);
      if((x>y && y>z) || (x<y && y<z)){
         isOrdered = true;
         System.out.println(isOrdered);
      }
      else
         System.out.println(isOrdered);
         
   
   }
}