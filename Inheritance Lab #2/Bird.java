
/**
 * Models a bird.
 * 
 * @author (Doug Vermes) 
 * @version (1.0)
 */
public class Bird implements Flier
{
    public void fly()
    {
        System.out.println("Using my wings to fly.");   
    }
    
    public void findHome()
    {
        System.out.println("Finding my way home.");
    }
}
