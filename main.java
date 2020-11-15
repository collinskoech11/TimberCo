import java.util.Arrays;
import java.util.Scanner;

public class main{
   public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      int length = 9;
      int [] categoryName = new int[length];
      s.close();
      System.out.println("Enter the Category Titles:");

      for(int i=0; i<length; i++ ) {
         categoryName[i] = s.nextInt();
      }

      System.out.println(Arrays.toString(categoryName));
   }
}