
/**
 * Introduction to Two-Dimensional Arrays
 * 
 * @author (Doug Vermes) 
 * @version (12/04/2014)
 */
public class TwoDArray
{
    private final int ROWS = 2;
    private final int COLS = 3;

    private int[][] a;  // declares a two dimensional array
    
    public TwoDArray()
    {
            a = new int[ROWS][COLS];    // creates a two-dimensional array with 2 rows and
                                        // 3 columns. Since ints are defaulted to 0, every element
                                        // in this array is 0.
                                        //      0 0 0 
                                        //      0 0 0 
                                                        
            a[1][2] = 8;    // sets element in row 1, column 2 equal to 8. (recall that rows and columns
                                // are numbered beginning with 0).
                                //
                                //      0 0 0
                                //      0 0 8
    }
    
    public void printArray()
    {
        for (int r=0; r < a.length; r++)    // a.length is # of rows
        {                                   // a[r].length is # of cols in row r
            for (int c=0; c < a[r].length; c++)
            {
                    System.out.print(a[r][c] + "  ");
            }
            System.out.println();
        }
    }
}
