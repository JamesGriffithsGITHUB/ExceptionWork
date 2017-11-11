import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;


public class Finally extends Exception
{

   public static void main(String[] args)
   {
      File file;
      Scanner inputFile;
      String fileName;
   
   
      fileName = JOptionPane.showInputDialog(null,"Enter in a file Name");
   
   
   
      try
      {
         file = new File(fileName);
         inputFile = new Scanner(file);
      
      
         try
         {
         
            while(inputFile.hasNext())
            {
               System.out.println(inputFile.nextDouble());
            }
         }
         catch (InputMismatchException e)
         {
            System.out.println("Invalid data found");
         }
         finally
         {
            inputFile.close();
         }
      
      }
      catch (FileNotFoundException e)
      {
         System.out.println("File not found");
      }
   }
   
      
   
}
   
   
   
   
   
   
   



