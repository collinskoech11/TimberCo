import java.util.Arrays;
import java.util.Scanner;

public class main{
   public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      int length = 9;
      int [] categoryName = new int[length];
      
      System.out.println("Enter the Category Titles:");

      for(int i=0; i<length; i++ ) {
         categoryName[i] = s.nextInt();
      }
      int [] categoryDimension = new int[length];
    
      System.out.println("Enter Category dimensions:");

      for(int i=0; i<length; i++ ) {
         categoryDimension[i] = s.nextInt();
      }

      System.out.println("Category    Dimension");
      for(int f=0; f<length; f++){
         System.out.println(categoryName[f]+"  "+categoryDimension[f]);
      }
     
      s.close();
      System.out.println(Arrays.toString(categoryName));
   }
}