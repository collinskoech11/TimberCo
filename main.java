import java.util.Arrays; 
public class main {
public static void main(String[] args){   
    
    int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456
         };
            
    String[] my_array2 = {
           "A-1X1",
	   "B-1X2",
	   "C-2X2",
	   "D-2X3",
	   "E-3X3",
	   "F-3X4",
	   "G-4X4",
	   "H-1X6",
	   "I-2X6",
	   "J-3X6"
        };        
    System.out.println("Original numeric array : "+Arrays.toString(my_array1));
    
    System.out.println("Original string array : "+Arrays.toString(my_array2));
    }
}
