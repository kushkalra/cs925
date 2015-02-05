import java.util.Scanner;
/**
 * Provides name for player and moves.
 * 
 * @author (Kush Kalra) 
 * @version (January 12, 2015)
 */
public class Player
{
    private String name=" ";
    

   /**
     * Sets String s to name
     */
    public Player(String s)
    {
        name=s;
    }

    /**
     * Gets the move for player
     * 
     * @param scanner which is input by user
     * return move which user enters
     */
    public int getMove(Scanner scanner)
    {
        int move=scanner.nextInt();
        return move;
    }
    /**
     * Gets player to fill board
     * 
     * 
     * Returns name for either x or o
     */
     public String getName()
    {
        return name;
    }
}
