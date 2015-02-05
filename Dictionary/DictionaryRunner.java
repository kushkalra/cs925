import java.util.Scanner;

/**
 * This is a "driver" class to test our Dictionary class.
 * 
 * @author (Doug Vermes) 
 */
public class DictionaryRunner
{
    public static void main(String[] stuff)
    {
        Scanner kb = new Scanner(System.in);
        Dictionary d = new Dictionary("mixedcase.txt");
        int choice = 0;
        
        do
        {
            System.out.println("Welcome to my wonderful dictionary program!\n");
            System.out.println("If you are using BlueJ, remember to turn on the Unlimited Buffering option\nin the terminal window.\n");
            System.out.println("Your options are:");
            System.out.println("\t1. Print all words of a specified length.");
            System.out.println("\t2. Print all words contaning two adjacent E's");
            System.out.println("\t3. Print all words containing all 5 vowels (not counting Y).");
            System.out.println("\t4. Quit the program.\n");
            System.out.print("What is your selection? ");
            choice = kb.nextInt();
            if (choice == 1)
            {
                int x;
                
                System.out.print("Print words of what length? ");
                x = kb.nextInt();
                d.wordsOfSpecifiedLength(x);
            }
            else if (choice == 2)
            {
                d.wordsWithAdjacentEs();
            }
            else if (choice == 3)
            {
                d.wordsWithAllVowels();
            }
        }
        while (choice >=1 && choice <4);
        System.out.println("\nThank you, and have a nice day.");
    }
}
