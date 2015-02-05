
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public String s[][];
    public final int x=5;
    public final int  y=5;
    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
         s = new String[x][y];
        //s[0][0]="ayooo";
        
    }

    public void displayBoard()
    {
        
            for(String[] currentRow:s)
            {
                for (String currentCol:currentRow)
                {
                    System.out.print(currentCol + " ");
                }
                System.out.println();
            }
        
    }
        public void board()
        {
            for(int i=0; i<s.length; i++)
            {
                for (int j=0; j<s[i].length; j++)
                {
                   System.out.print(s[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
