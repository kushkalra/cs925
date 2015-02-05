
/**
 * The board for tic tac toe.
 * 
 * @author (Kush Kalra) 
 * @version (January 12, 2015)
 */
public class Board
{
    private int[][] board;   
    private final int n=3;
    private final int c=3;
    // instance variables - replace the example below with your own

    /** Sets a new Board with n rows and c columns
     */
    public Board()
    {
        board=new int[n][c];

    }

    /** Displays Board
     *@Player x, Player o used later to set players state in board
     *
     */
    public void printBoard(Player x, Player o)
    {
        int cell=0;
        String s=" ";
        System.out.println(" ");

        for(int r=0; r < board.length; r++)
        {
            for (int c=0; c < board.length; c++)
            {
                cell=board[r][c];
                if(cell<0)
                {
                    s=x.getName();
                }
                else if (cell==0)
                {
                    s="_";
                }
                else
                {
                    s=o.getName();
                }
                System.out.print(" " + s +" ");
            }
            System.out.println();
        }
    }

    /**
     * Tests if cell is empty
     * 
     * @param int r rows, int c colums
     * return cell[r][c] if cell is empty, false otherwise
     */
    public boolean isEmpty (int r, int c)
    {
        return board[r][c]==0;
    }

    /**
     * Trys to fill an empty space, fails if already occupied
     * 
     * @param int player represents int value of player, int r rows, int c columns
     * return cell[r][c] if cell is empty, false otherwise
     */
    public boolean isValid (int player, int r, int c)
    {
        if(board[r][c]==0)
        {
            board[r][c]=player;
            return true;
        }
        else
        {
            return false;
        }
    }

    /** solutions for how to win a game if either an X or O
     *
     *@return winner in given scenario
     */
    public int isWinner()
    {
        if(board[0][0]!=0 && board[0][0]<0 && board[0][1]<0 && board[0][2]<0)
        {
            return board[0][0];// straight down 1st column one piece
        }
        if(board[0][0]!=0 && board[0][0]>0 && board[0][1]>0 && board[0][2]>0)
        {
            return board[0][0];// straight down 1st column one piece
        }
        if(board[0][0]!=0 && board[1][0]<0 && board[1][1]<0 && board[1][2]<0)
        {
            return board[1][0];// straight down 2nd column one piece
        }
        if(board[0][0]!=0 && board[1][0]>0 && board[1][1]>0 && board[1][2]>0)
        {
            return board[1][0];// straight down 2nd column one piece
        }
        if(board[0][0]!=0 && board[2][0]<0 && board[2][1]<0 && board[2][2]<0)
        {
            return board[2][0];// straight down 3rd column one piece
        }
        if(board[0][0]!=0 && board[2][0]>0 && board[2][1]>0 && board[2][2]>0)
        {
            return board[2][0];// straight down 3rd column one piece
        }
        if(board[0][0]!=0 && board[0][0]<0 && board[1][0]<0 && board[2][0]<0)
        {
            return board[0][0];// straight through 1st row one piece
        }
        if(board[0][0]!=0 && board[0][0]>0 && board[1][0]>0 && board[2][0]>0)
        {
            return board[0][0];// straight through 1st row one piece
        }
        if(board[0][0]!=0 && board[0][1]<0 && board[1][1]<0 && board[2][1]<0)
        {
            return board[0][1];// straight through 2nd row one piece
        }
        if(board[0][0]!=0 && board[0][1]>0 && board[1][1]>0 && board[2][1]>0)
        {
            return board[0][1];// straight through 2nd row one piece
        }
        if(board[0][0]!=0 && board[0][2]<0 && board[1][2]<0 && board[2][2]<0)
        {
            return board[0][2];// straight through 3rd row one piece
        }
        if(board[0][0]!=0 && board[0][2]>0 && board[1][2]>0 && board[2][2]>0)
        {
            return board[0][2];// straight through 3rd row one piece
        }
        if(board[0][0]!=0 && board[0][0]<0 && board[1][1]<0 && board[2][2]<0)
        {
            return board[0][0];// straight through left-diagnol one piece
        }
        if(board[0][0]!=0 && board[0][0]>0 && board[1][1]>0 && board[2][2]>0)
        {
            return board[0][0];// straight through left-diagnol one piece
        }
        if(board[0][0]!=0 && board[2][0]<0 && board[1][1]<0 && board[0][2]<0)
        {
            return board[2][0];// straight through right-diagnol one piece
        }
        if(board[0][0]!=0 && board[2][0]>0 && board[1][1]>0 && board[0][2]>0)
        {
            return board[2][0];// straight through right-diagnol one piece
        }
        return 0;// no winner yet
    }

     /**
     * Finds an empty space of the board is full
     * 
     * 
     * @return true if board is full, false if empty space
     */
    public boolean isFull()
    {
        for (int r=0; r<n; r++)
        {
            for (int c=0; c<n; c++)
            {
                if(board[r][c]==0)
                {
                    return false; //found empty space
                }
            }
        }   
        return true; // board is full
    }
}

