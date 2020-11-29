import java.util.Arrays; 
public class main {
    public static double getTotalSales(String filename)
    throws IOException
{
double total = 0.0;  // Accumulator
double sales;        // A daily sales amount

// Open the file.
File file = new File(filename);
Scanner inputFile = new Scanner(file);

// This loop processes the lines read from the file,
// until the end of the file is encountered.
while (inputFile.hasNext())
{
// Read a double from the file.
sales = inputFile.nextDouble();

// Add sales to the value already in total.
total += sales;
}

// Close the file.
inputFile.close();

// Return the total sales.
return total;
}

public static void main(String[] args){   
    
    int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456
         };
            
    String[] WoodType = {
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
    
    System.out.println("Original string array : "+Arrays.toString(WoodType));
    double costA = 300.0;
    double costC;
    double costD;
    double costE;
    double costF;
    double costG;
    double costH;
    double costI;
    double costJ;

        
    if (WoodType[1] == "A") {
        costA = 300;
      }
      else if(WoodType[1] == "B") {
       double  costB = costA + 0.3*costA;
      }
      else if(WoodType[1] == "C") {
        double costB;
      costC = costB + 0.3*costB;
      }
      else if(WoodType[1] == "D") {
         costD = costC + 0.3*(costC);
      }
      else if(WoodType[1] == "E") {
         costE = costD + 0.3*(costD);
      }
      else if(WoodType[1] == "F") {
         costF = costE + 0.3*(costE);
      }
      else if(WoodType[1] == "G") {
         costG = costF + 0.3*(costF);
      }
      else if(WoodType[1] == "H") {
        costH = costG + 0.3*(costG);
      }
      else if(WoodType[1] == "I") {
         costI = costH + 0.3*(costH);
      }
      else if(WoodType[1] == "J") {
        costJ = costI + 0.3*(costI);
      }
      // checks if number is less than 0
      
      
      // if both condition is false
      else {
        System.out.println("The number is 0.");
      }
      final int NUM_DAYS = 30; // Number of days of sales
      String filename;         // The name of the file to open
      double totalSales;       // Total sales for period
      double averageSales;     // Average daily sales
      
      // Get the name of the file.
      filename = getFileName();
      
      // Get the total sales from the file.
      totalSales = getTotalSales(filename);
      
      // Calculate the average.
      averageSales = totalSales / NUM_DAYS;
      
      // Display the total and average.
      displayResults(totalSales, averageSales);

      public static double getTotalSales(String filename)
      throws IOException
{
double total = 0.0;  // Accumulator
double sales;        // A daily sales amount

// Open the file.
File file = new File(filename);
Scanner inputFile = new Scanner(file);

// This loop processes the lines read from the file,
// until the end of the file is encountered.
while (inputFile.hasNext())
{
// Read a double from the file.
sales = inputFile.nextDouble();

// Add sales to the value already in total.
total += sales;
}

// Close the file.
inputFile.close();

// Return the total sales.
return total;
}
class constructor{
    //Default constructor
    Example(){
       System.out.println("Default constructor");
    }
    /* Parameterized constructor with 
     * two integer arguments
     */
    Example(int i, int j){
       System.out.println("constructor with Two parameters");
    }
    /* Parameterized constructor with 
     * three integer arguments
     */
    Example(int i, int j, int k){
       System.out.println("constructor with Three parameters");	      
    }
        
    /* Parameterized constructor with 
     * two arguments, int and String
     */
    Example(int i, String name){
       System.out.println("constructor with int and String param");
    }
    public static void main(String args[]){
       //This will invoke default constructor
       Example obj = new Example();
 
       /* This will invoke the constructor 
        * with two int parameters
        */
       Example obj2 = new Example(12, 12);
 
       /* This will invoke the constructor 
        * with three int parameters
        */
       Example obj3 = new Example(1, 2, 13);
     
       /* This will invoke the constructor 
        * with int and String parameters
        */
       Example obj4 = new Example(1,"BeginnersBook");
    }
 }
    }
}
