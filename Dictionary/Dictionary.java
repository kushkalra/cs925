import java.util.ArrayList;

/**
 * Write a description of class Dictionary here.
 * 
 * @author (Kush Kalra) 
 */
public class Dictionary
{
    private ArrayList<String> words;    // will store all the words that we read in
    // above declares a field called words. Recall that fields exist throughout the entire class. 
    
    public Dictionary(String filename)
    {
        // this is the constructor of the Dictionary class. The purpose of a constructor is to
        // properly initialize all fields of the class. 
        
        // constructors are always automatically called when the class is instantiated (e.g. when an
        // object of this class is created).
        
        words = new ArrayList<String>();    // initializes the words ArrayList
        
        FileInput.loadWords(filename, words); // loads in a pre-created list of English words from
                                                    // the specified file, that ought to be located
                                                    // in the project folder.
    }

    /**
     * Prints out all the words whose length is the specified number of characters. The words
     * printed out must retain their ORIGINAL case.
     * @param len The word length you are searching for.
     */
    public void wordsOfSpecifiedLength(int len)
    {
        for (String word :words)
        {
            if (word.length()== len)
            {
                System.out.println(word);
            }
        }
    }
  
    /**
     * Prints out all the words that contain at least two adjacent e's. The adjacent e's do
     * NOT need to be of the same case (e.g. Ee counts as two adjacent e's). The words printed
     * out must ren their ORIGINAL case.
     */
    public void wordsWithAdjacentEs()
    {
        for (String word :words)
        {
            String upperCaseWord=word.toUpperCase();
            int i= upperCaseWord.indexOf("E");
            if (i>=0 && i <upperCaseWord.length()-1 && upperCaseWord.charAt(i+1) == 'E')
            {
               System.out.println(word); 
            }
        }
    }
   
    /**
     * Prints out all the words that contain every vowel (a, e, i, o, and u). Y doesn't count.
     * Uppercase vowels should also be considered vowels. The words printed out must retain
     * their ORIGINAL case.
     */
    public void wordsWithAllVowels()
    {
       for (String word :words)
        {
            String upperCaseWord=word.toUpperCase();
            int a= upperCaseWord.indexOf("A");
            int b= upperCaseWord.indexOf("E");
            int c= upperCaseWord.indexOf("I");
            int d= upperCaseWord.indexOf("O");
            int e= upperCaseWord.indexOf("U");
            if (a>=0 && b>=0 && c>=0 && d>=0 && e>=0 )
            {
               System.out.println(word); 
            }
        }
    }
}
