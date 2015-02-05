import java.util.Scanner;

/**
 * Tests the game.
 * 
 * @author (Kush Kalra) 
 * @version (January 12, 2015)
 */
public class Runner
{

    public Board board;
    public Player x;
    public Player o;

    // instance variables - replace the example below with your own

    /**
     * creates new board with with Player X and O
     */
    public Runner()
    {
        board=new Board();
        x=new Player("X");
        o=new Player("O");
    }

    /**
     * Method used to run Tic tac toe
     * 
     * @param String[] args
     * 
     */
    public static void main(String[] args)
    {
        Game g=new Game("X","O");
        Board board= g.getBoard();
        Player o= g.getPlayer(0);
        Player x= g.getPlayer(1);
        String winner=new String();
        int r=0;
        int c=0;
        boolean invalid=false;
        
        

        int move=0;
        
       Scanner scanner=new Scanner("00 10 01 11 02 12");
       scanner=new Scanner(System.in);
       System.out.println("Welcome to tic tac toe!");
       System.out.println("Each square has a number, and here are the ones you'll need");
       System.out.println(" 00 01 02\n 10 11 12\n 20 21 22");
       System.out.println("Only enter possible grid moves!!\nOther Moves will not be accessible!");
       System.out.println("Let's Play");
                             
        

        while (true)
        {
            if(board.isFull()) 
            {
                break;
            }
            System.out.println("Player X Enter your move");
            move=x.getMove(scanner);
            r=move/10;

            c=move%10;
            if(!board.isValid(-1,r,c))
            {
                System.out.println("Invalid move");
                invalid=true;
                break;
            }
            board.printBoard(x,o);
            if(board.isWinner()<0)
            {
                winner="X";
                break;
            }
            if(board.isFull()) 
            {
                break;
            }
            System.out.println("Player O Enter your move");
            move=o.getMove(scanner);
            r=move/10;
            c=move%10;

            if(!board.isValid(1,r,c))
            {
                System.out.println("Invalid move");
                invalid=true;
                break;
            }
            board.printBoard(x,o);
            if(board.isWinner()>0)
            {
                winner="O";
                break;
            }
        }
        board.printBoard(x,o);
        if(invalid)
        {
            System.out.println("Invalid Move" + " " + move);
        }
        
        else if (winner.length()==0)
        {
            System.out.println("It was a tie");
        }
        else 
        {
            System.out.println("Congratuations " + winner + " you won!");
        }
    }
}


