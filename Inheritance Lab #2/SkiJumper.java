
/**
 * Represents a ski jumper.
 * 
 * @author (Doug Vermes) 
 * @version (03/14/2006)
 */
public class SkiJumper extends Athlete implements Flier
{
    private int numberOfJumps;
    
    /**
     * Create a ski jumper with the specified first name and last name.
     */
    public SkiJumper(String myF, String myL)
    {
        super(myF, myL, "Ski Jumping"); // invokes the constructor of the superclass (Athlete)
        numberOfJumps = 0;
    }
    
    public void fly()
    {
        System.out.println("Using skis to take " + getName() + " into the air!");
        numberOfJumps++;
    }

    public void train(double hours) // overriding superclass train
    {
        System.out.println("I am on the slopes " + hours + " hours today.");
        super.train(hours);    
    }

    public int getJumps()
    {
        return numberOfJumps;
    }
}
