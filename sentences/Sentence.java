package sentences;

/**
 * @author Merry McDonald
 */
public class Sentence
{

   private String sentence;

   public Sentence(String sentence)
   {
      this.sentence = sentence;
   }

   public String getFirstWord()
   {
      String[] words = sentence.split(" ");
      return words[0];
   }
   
   public String getLastWord()
   {
	   String[] words = sentence.split(" ");
       //String lWord = new String(sentence.substring(sentence.lastIndexOf(" ")));
	   return words[words.length-1];
   } 
   
   public int getNumberOfWords()
   {
	   String[] words = sentence.split(" ");
	   return words.length;
   }

   @Override
   public String toString()
   {
      return sentence;
   }
}
