import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {   
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    for (int i = number - 1; i >= 0; i--)
         {
           for (int x = 0; x <= i; x++)
             {
               System.out.print("*");
               ;
             }
           System.out.println("");
         }
    
  }
}
