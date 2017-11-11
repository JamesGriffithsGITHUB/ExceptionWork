import java.io.*;
import java.util.Scanner;

public class RandomAccess2

{
   public static void main(String[] args)throws IOException 
   
   {
      char[] letters = {'a','b','c','d'};
      StringBuilder str = new StringBuilder();
      char ch;
      int index = 0;
      System.out.println("opening the file...");
      
   
      RandomAccessFile randomFile = new RandomAccessFile("Numbers.dat","rw");
      
      for(int i =0;i<letters.length;i++)
         randomFile.writeChar(letters[i]);
         
      
      
      System.out.println("Done");
      
      System.out.println("Checking file...");
      for(int i=0;i<letters.length;i++)
      {str.insert(index,letters[i]);
         index++;
      }
      /*for(int i=0;i<str.length();i++)
      {
      
      */
      for(int i =0;i<8;i+=2)
      {randomFile.seek(i);
         ch = randomFile.readChar();
         System.out.println(ch);
      }    
          
      System.out.println("Done");
   
      
      
      randomFile.close();
   }
  
}