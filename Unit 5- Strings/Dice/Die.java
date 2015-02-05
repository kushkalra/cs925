
/**
 * Write a description of class Die here.
 * 
 * @author (Kush Kalra) 
 * @version (11-4-14)
 */
public class Die
{ 
    private int faceValue;
    /** creating a Die with a faceValue of 1
     *
     *
     */
    public Die()
    {
        faceValue=1;
    }

    /** Gets the Value from roll method
     * @return faceValue;
     */
    public int getValue()
    {
        return faceValue;
    }

    /** rolls the dice and stores a number between 1 and 6 in faceValue
     * 
     */
    public void roll()
    {
        faceValue=(int)(Math.random()*6+1);
    }

    /** provides a String of what the faceValue is
     * @return faceValue
     */
    public String toSting()
    {
        return faceValue + "";
    }

}
