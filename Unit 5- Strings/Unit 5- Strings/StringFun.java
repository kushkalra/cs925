/**
 * Fun With Strings
 * 
 * @author (Kush Kalra) 
 * @version (11/11/2013)
 */
public class StringFun
{
    // Your task is to successfully implement each method in this class. Work from the top of this class to the bottom.

    /**
     * Prints each letter of a given string (one per line).
     * @param myName A string to analyze
     */
    public static void printEachLetter(String myName)
    {
        for (int i=0; i<myName.length(); i++)
        {
            System.out.println( myName.charAt(i));
        }

    }

 
    /**
     * Determines if the given letter is a vowel.
     * @param ltr The letter to analyze
     * @return True if the letter is a vowel, false otherwise. Y will not be considered a vowel.
     */
    private static boolean isVowel(char ltr)
    { 
        char vowel='a';
        char vowel1='e';
        char vowel2='i';
        char vowel3='o';
        char vowel4='u';
        char vowel5='A';
        char vowel6='E';
        char vowel7='I';
        char vowel8='O';
        char vowel9='U';
       {
           if (ltr==vowel)
           {     
               return true;
           }
           if (ltr==vowel1)
           {     
               return true;
           }
           if (ltr==vowel2)
           {     
               return true;
           }
           if (ltr==vowel3)
           {     
               return true;
           }
           if (ltr==vowel4)
           {     
               return true;
           }
           if (ltr==vowel5)
           {     
               return true;
           }
           if (ltr==vowel6)
           {     
               return true;
           }
           if (ltr==vowel7)
           {     
               return true;
           }
           if (ltr==vowel8)
           {     
               return true;
           }
           if (ltr==vowel9)
           {     
               return true;
           }
           else
           {
                return false;
           }
       }
    }

    /**
     * Prints only the vowels in a given string (one per line).
     * @param myName The string to analyze
     */
    public static void printVowels(String myName)
    { 
       
        for (int i=0; i<myName.length(); i++)
        {
             myName = myName.toLowerCase();
            char vowel='a';
            if (myName.charAt(i)==(vowel))
                {     
                    System.out.println(vowel);
                }
            myName = myName.toLowerCase();
            char vowel1='e';
            if (myName.charAt(i)==(vowel1))
                {     
                    System.out.println(vowel1);
                }
            myName = myName.toLowerCase();
            char vowel2='i';
            if (myName.charAt(i)==(vowel2))
                {     
                    System.out.println(vowel2);
                }
            myName = myName.toLowerCase();
            char vowel3='o';
            if (myName.charAt(i)==(vowel3))
                {     
                    System.out.println(vowel3);
                }
            myName = myName.toLowerCase();
            char vowel4='u';
            if (myName.charAt(i)==(vowel4))
                {     
                    System.out.println(vowel4);
                }
        }
    }

    /*
     * Returns a backwards copy of the original string.
     * @param original The original string to analyze
     * @return A backwards copy of the original string
     */
    public static String backwardsString (String original)
    { 
        String newO = "";
        for (int i = (original.length()-1); i>=0;  i--)
        {
           newO = newO + (original.charAt(i));
        }
        return (newO);
    }
    /**
     *  Returns true if the given String is a palindrome (reads the same
     *   forwards and backwards (example: "racecar")
     **/
    public static boolean isPalindrome(String myName)
    { 
        if ((myName).equals(backwardsString(myName)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }      
    
    /**
     * Returns a copy of the given String with all the vowels removed. (NOTE: y is not considered a vowel)
     * @param s The original String to process
     * @return A copy of the given String with all the vowels removed. (NOTE: y is not considered a vowel)
     */
    public static String removeVowels(String s)
    { 
        s= s.toLowerCase();
        char vowel='a';
        char vowel1='e';
        char vowel2='i';
        char vowel3='o';
        char vowel4='u';
        String noVowels = "";
        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i)==(vowel))
               {     
                noVowels=s.replaceAll("['a''e''i''o''u']", " "); 
               }
            if (s.charAt(i)==(vowel1))
               {     
                noVowels=s.replaceAll("['a''e''i''o''u']", " "); 
               }
            if (s.charAt(i)==(vowel2))
               {     
                noVowels=s.replaceAll("['a''e''i''o''u']", " "); 
               }
            if (s.charAt(i)==(vowel3))
               {     
                noVowels=s.replaceAll("['a''e''i''o''u']", " "); 
               }
           if (s.charAt(i)==(vowel4))
               {     
                noVowels=s.replaceAll("['a''e''i''o''u']", " "); 
               }
        }    
        return (noVowels);
       
    } 
}
    

   
