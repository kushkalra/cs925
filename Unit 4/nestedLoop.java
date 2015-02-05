
/**
 * Write a description of class nestedLoop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nestedLoop
{
   
    public static void nestedLoop()
    {
        for (int i =0; i<4; i++) // row number
        {
            for (int j=0; j<(i+1); j++) // column number
            {
                System.out.print("* ");
            }
            System.out.println("");
        }   
    }
}
