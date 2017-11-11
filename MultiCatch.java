import java.io.*;    // For File class and FileNotFoundException
import java.util.*;  // For Scanner and InputMismatchException

/**
   This program demonstrates how multiple exceptions can
   be caught with a single catch clause.
*/

public class MultiCatch
{
   public static void main(String[] args)
   {
      int number;    // To hold a number from the file
      
      try
      {
         // Open the file.
         File file = new File("Numbers.txt");
         Scanner inputFile = new Scanner(file);
      
         // Process the contents of the file.
         while (inputFile.hasNext())
         {
            // Get a number from the file.
            number = inputFile.nextInt();
            
            // Display the number.
            System.out.println(number);
         }
      
         // Close the file.
         inputFile.close();
      }
      /*
      The below catch statement replaces the two shown here:
      try
      {
      
      }
      catch(NumberFormatException ex)
      {
         respondToError();
      }
      catch(IOException e)
      {
         respondToError();
      }
      */
      catch(FileNotFoundException | InputMismatchException ex) //Groups the two together
      {
         // Display an error message.
         System.out.println("Error processing the file.");
      }
   }
}