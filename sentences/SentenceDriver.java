package sentences;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Merry McDonald
 */
public class SentenceDriver 
{
   public static void main(String[] args) throws FileNotFoundException 
   {
      Scanner in = new Scanner(new File("sentences.txt"));
      Sentence mySentence;
      
      while(in.hasNext())
      {
         mySentence = new Sentence(in.nextLine());
         System.out.println(mySentence);
         System.out.println("First word: " + 
            mySentence.getFirstWord());
         System.out.println("Last word: " + 
            mySentence.getLastWord());
         System.out.println("Number of words: " + 
            mySentence.getNumberOfWords());
         System.out.println();
      }
   }
}
