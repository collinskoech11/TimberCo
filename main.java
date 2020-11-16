
import java.util.Scanner;

public class main{
   public static void main(String args[]) {
      
      int length = 9;
      int [] categoryName = new int[length];
      int [] categoryDimension = new int[length];
      

      for(int i=0; i<9; i++ ) {
         System.out.println("Enter the Category Title:");
         Scanner s = new Scanner(System.in);
         categoryName[i] = s.nextInt();
         s.close();
      }
      for(int i=0; i<9; i++ ) {
         Scanner N = new Scanner(System.in);
         System.out.println("Enter Category dimension for"+categoryName[i]);
         categoryDimension[i] = N.nextInt();
         N.close();
      }

      System.out.println("Category:Dimension");
      for(int f=0; f<9; f++){
         System.out.println(categoryName[f]+"         "+categoryDimension[f]);
      }
     
      
      
   }
}