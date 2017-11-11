import java.io.*;    // For File class and FileNotFoundException
import java.util.*;  // For Scanner and InputMismatchException
import javax.swing.JOptionPane; // For the JOptionPane class



public class SalesReport
{
   public static void main(String[] args)
   {
      String filename = "SalesData2.txt"; 
      int months = 0;                    
      double oneMonth;                   
      double totalSales = 0.0;           
      double averageSales;                
      try
      {
         // Open the file.
         File file = new File(filename);
         Scanner inputFile = new Scanner(file);
      
       
         while (inputFile.hasNext())
         {
            
            oneMonth = inputFile.nextDouble();
            
            
            totalSales += oneMonth;
            
            
            months++;
         }
      
         // Close the file.
         inputFile.close();
      
         // Calculate the average.
         averageSales = totalSales / months;
      
         // Display the results.
         JOptionPane.showMessageDialog(null,
            String.format("Number of months: %d\n" +
                          "Total Sales: $%,.2f\n" +
                          "Average Sales: $%,.2f",
                          months, totalSales, averageSales));
      }
      catch(FileNotFoundException e)
      {
         // Thrown by the Scanner constructor when
         // the file is not found.
         JOptionPane.showMessageDialog(null,
             "The file " + filename + " does not exist.");
      }
      catch(InputMismatchException e)
      {
         // Thrown by the Scanner class's nextDouble
         // method when a non-numeric value is found.
         JOptionPane.showMessageDialog(null,
             "Non-numeric data found in the file.");
      }
      
      System.exit(0);
   }
}