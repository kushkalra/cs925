
/**
 * Builds the game with the players and the board
 * 
 * @author (Kush Kalra) 
 * @version (January 12, 2015)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private Player o;
    private Player x;
    private Board board;

   /**
     * Creates a new instance of Board
     * 
     * @param String xname, String oname
     * 
     */
    public Game(String xname, String oname)
    {
        board=new Board();
        o=new Player(oname);
        x=new Player(xname);
        
    }

     /**
     * Gets the board
     * 
     * 
     * @return board
     */
    public Board getBoard( )
    {
        return board;
    }
    /**
     * Gets either an o or x
     * 
     * @param  int p 
     * @return o or x dependant upon value of p
     */
    public Player getPlayer(int p)
    {
        if (p==0)
        {
           return o;
        }
        else
        {
            return x;
        }
    }
}
