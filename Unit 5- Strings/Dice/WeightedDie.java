
/**
 * Write a description of class Die here.
 * 
 * @author (Kush Kalra) 
 * @version (11/4/14)
 */
public class WeightedDie
{
    private int faceValue;

    /** creating a WeightedDie with a faceValue of 1
     *
     *
     */
    public WeightedDie()
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

    /** rolls the Weighteddie and stores a number between 1 and 9 in faceValue, then stores 7 8 9 as even
     * 
     */
    public void roll()
    {
        faceValue=(int)(Math.random()*9+1);
        if (faceValue==7)
        {
            faceValue=2;
        }
        if (faceValue==8)
        {
            faceValue=4;
        }
        if (faceValue==9)
        {
            faceValue=6;
        }
    }

    /** provides a String of what the faceValue is
     * @return faceValue
     */
    public String toSting()
    {
        return faceValue + "";
    }

}