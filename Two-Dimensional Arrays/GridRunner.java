import java.util.Scanner;

/**
 * Tests your FunGrid class
 * 
 */
public class GridRunner
{
    private static final String QUIT = "Q";   // letter that denotes QUIT

    public static void main(String[] args)
    {
            Scanner in = new Scanner(System.in);
            FunGrid g = new FunGrid();
            String response="";
            
            g.printGrid();
            do
            {
                System.out.print("Enter (U)p, (D)own, (L)eft, (R)ight, or " + QUIT + " to quit: ");
                response = in.nextLine();
                response = response.toUpperCase();  // convert the user's response to all uppercase
                if (response.length() > 0)
                    response = response.substring(0,1); // truncate everything except the first character
                if (response.equals("U"))
                    g.moveUp();
                else if (response.equals("D"))
                    g.moveDown();
                else if (response.equals("L"))
                    g.moveLeft();
                else if (response.equals("R"))
                    g.moveRight();
                g.printGrid();
            }
            while (!response.equals(QUIT));
            
    }
}
