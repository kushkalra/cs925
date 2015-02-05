import java.util.ArrayList;
/**
 * A program with a sequence of numbers
 *@author (Kush Kalra) 
 * @version (December 2, 2014)
 */
public class Sequence
{
    private ArrayList<Fraction> fractions;  
    /** creates a Sequence with numerator of 1 and denominator of factorial of k++
     *@param int n where n represents the number of terms
     *
     */
    public Sequence(int n)
    {
        fractions = new ArrayList<Fraction>();
        for (int k= 0; k<n; k++)
        {
            Fraction f = new Fraction(1,MyMath.factorial(k));
            fractions.add(f);
        }
        
    }

    /** creates a String of the terms in the Sequence
     *@return the number of terms in the sequence or "[]" if there are no terms
     *
     */
    public String toString()
    {
        if (fractions.size()>0)
        {
        String output="";
        for (Fraction list : fractions)
        {
            output= output  + "," + " " + list;
        }
        return "[" + output.substring(2) + "]";
        }
        return "[]";

    }

    /** allows user to getTerm of Sequence at any point
     *@param int i is the requested term
     *@return term or null if the term requested is less than or equal to 0 or
     */
    public Fraction getTerm(int i)
    {
        if (fractions.size()<i)
        {
            return null;
        }
           if (i<=0)
        {
            return null;
        }
        return fractions.get(i-1);
    }

    /** allows user to get sum of the sequence
     *@return k the sum of the array in fraction form
     *
     */
    public Fraction sum()
    {
        Fraction k=new Fraction(0,1);
        for (Fraction fraction: fractions)
        {
            //k= k.add(fraction);
        }
        return k;
    }

    /** allows user to get sum of the sequence
     *@return k the sum of the array in decimal form
     *
     */
    public double approximateSum()
    {
        Fraction k=new Fraction(0,1);
        for (Fraction fraction: fractions)
        {
            k= k.add(fraction);
        }
        return k.getValue();
    }
}