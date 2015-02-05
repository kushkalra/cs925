
/**
 * Represents a fraction.
 * 
 * @author (Kush Kalra) 
 * @version (09-18-2014)
 */
public class Fraction
{
    //  declare any fields
    private int numerator;  // declaring a field of type int
    // named numerator
    private int denominator;

    //  define any constructors

    /** creating a fraction with value of 1/1
     *@param new numerator for this fraction
     *@param new denominator for this fraction, and this must not be zero
     */
    public Fraction()
    {
        numerator = 1; // no need to know the fields for javadoc comments
        denominator = 1;
    }

    /** creating a fraction with inputing newnumerator and newdenominator
     * @param newnumerator 
     * @param newdenominator
     */
    public Fraction (int newnumerator, int newdenominator)
    {
        numerator= newnumerator;
        denominator=newdenominator;
    }

    //  define any methods
    /** gets Numerator that is an integer
     * @return an integer numerator
     */
    public int getNumerator()
    //                     ^^ no further information is needed for this method to operate
    //         ^^^^^^^^^^^^ name of this method
    //     ^^^ this method will return an integer
    {
        return numerator;
    }

    /** gets Deonimator that is an integer
     * @return a denominator
     */
    public int getDenominator()
    {
        return denominator;
    }

    /** the numerator does not return anything
     * @param newNumerator
     */
    public void setNumerator(int newNumerator)
    //                       ^^^^^^^^^^^^^^^^ 
    //                       formal parameter
    {
        numerator = newNumerator;
    }

    /** the denominator does nprot return anything
     * @param newDenominator 
     */
    public void setDenominator(int newDenominator)
    {
        denominator = newDenominator;
    }

    /** divdes the obtained numerator by the obtained denominator. the denominator can not be zero
     * @return Numerator/denominaotr
     */
    public double getValue()
    {
        return ((double) getNumerator() ) / getDenominator();
        //                                  ^^^^^^^^^^^^^^^^ internal method call
        //               ^^^^^^^^^^^^^^ internal method call
    }

    /** Returns the String representation of a fraction in the form numerator/denominator
    *@return numerator/denominator
    *form numerator
    */
   public String toString()
   {
       return numerator + "/" + denominator;
   }
   
   public Fraction multiply(int num)
   {
      Fraction result=new Fraction(numerator * num,denominator);
      return result;
   }
   public Fraction divide (int num)
   {
      Fraction result=new Fraction(numerator,denominator *num);
      return result;
   }
   /**
    *@Copy constructo that creates a copy of the given Fraction
    *@param other the fraction object to make a copy of
    */ 
   public Fraction(Fraction other)
    {
        numerator=other.numerator;
        denominator=other.denominator;
    }
    public Fraction add(int num)
    {
        Fraction result=new Fraction(numerator+num, denominator);
        return result;
    }
     public Fraction subtract(int num)
    {
        Fraction result=new Fraction(numerator-num, denominator);
        return result;
    }
}
   
