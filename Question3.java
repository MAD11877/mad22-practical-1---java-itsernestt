import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
    System.out.println("Enter a number to multiply by itself: "); 
    Scanner in = new Scanner(System.in);
    double number = in.nextInt();
    double calculatedNo = number * number;
    System.out.println("The calculated number is " + calculatedNo);
    
  }
}
