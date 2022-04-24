import java.util.Scanner;
import java.util.*;

//NOT WORKING
public class Question5
{
  public static void main(String[] args)
  {
  
    Scanner in = new Scanner(System.in);
    int firstnum = in.nextInt();
    List<Integer> list = new ArrayList<Integer>();
    List<Integer> countlist = new ArrayList<Integer>();
    int count = 0;
    for (int i = firstnum - 1; i >= 0; i--)
      {
        int secondnum = in.nextInt();
        list.add(secondnum);
      }
    Collections.sort(list);
    System.out.print("Your list is " + list);
    for (int x = 0; x >= list.size(); x++)
      {
        if (x > 0)
        {
          if (list.get(x) == list.get(x-1))
          {
            count = count + 1;
            countlist.add(count);
          }
          else
          {
            count = 0;
          }
        }
        
        else
        {
          count = 0;
        }
        
    }
    System.out.print("\nCountlist: " + countlist);
  }
}
