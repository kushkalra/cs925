public class FunGrid
{
    private final int ROWS = 5;
    private final int COLS = 5;

    private char[][] grid;
    private int curRow; // current row the X is in
    private int curCol; // current column the X is in

    public FunGrid()
    {
        grid = new char[ROWS][COLS];// create a 2-D array of chars
        for (int r=0; r < grid.length; r++)    // a.length is # of rows
        {                                   // a[r].length is # of cols in row r
            for (int c=0; c < grid[r].length; c++)
            {
                grid[r][c]='-';
            }
        }
        grid[0][0]='X';
        curRow=0;
        curCol=0;
        // initialize every element of the 2-D array to '-'
        // place an X in the top-left corner of the array
        // store the location of the current row and column that the X is in.

    }

    public void moveRight()
    { 
        if(curCol!=grid[curRow].length-1)
        {
            grid[curRow][curCol]='-';
            grid[curRow][curCol+1]='X';
            curCol++;

        }
    }

    public void moveLeft()
    {
        if(curCol!=0)
        {
            grid[curRow][curCol]='-';
            grid[curRow][curCol-1]='X';
            curCol--;

        } // if we are not in the first column, move the X left one column
    }
    public void moveUp()
    {
        if(curRow!=0) 
        {
            grid[curRow][curCol]='-';
            grid[curRow-1][curCol]='X';
            curRow--;
        } // if we are not in the fi// if we are not in the first row, move the X up one row

    }

    public void moveDown()
    {
        if(curRow!=grid[curCol].length-1)
        {
            grid[curRow][curCol]='-';
            grid[curRow+1][curCol]='X';
            curRow++;

        } // if we are not in the first column, move the X left one column// if we are not in the last row, move the X down one row
    }
    public void printGrid()
    {

        for (int r=0; r < ROWS; r++)    // a.length is # of rows
        {                                   // a[r].length is # of cols in row r
            for (int c=0; c < COLS; c++)
            {
                System.out.print(grid[r][c] + " ");
            }
            System.out.println();
        }// print out the grid to the terminal window (one row per line) with spaces between each element in a row

    }    
}

