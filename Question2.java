
import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    System.out.println("Enter height in 'cm' followed by weight in 'kg'"); 
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
    double weight = in.nextDouble();
    System.out.println("Your height is " + height + "cm");
    System.out.println("Your weight is " + weight + "kg");
    double bmi = height / ((weight/100)**2);
    System.out.println("Your BMI is " + bmi);
  }
}
