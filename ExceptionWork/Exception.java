import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class ExceptionDemo extends Exception

{

   public static void main(String[] args)
   {
      //Initialize various variables

      File file;
      Scanner inputFile;
      String fileName;

      fileName = JOptionPane.showInputDialog("Enter " + " the name of the file. ");

      //attempt to open file that the user has entered

      try
      {
         file = new File(fileName);   //First the Try block code is executed
         inputFile = new Scanner(file);
         JOptionPane.showMessageDialog(null,"The File was found");
      }
      catch (FileNotFoundException e) //System catches the Exception error if the File isn't found
      {
         JOptionPane.showMessageDialog(null,"File not found");
      }

      JOptionPane.showMessageDialog(null,"Done."); //Exit
      System.exit(0);


   }

}
