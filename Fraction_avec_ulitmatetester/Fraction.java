
/**
 * Represents a fraction.
 * 
 * @author (Kush Kalra) 
 * @version (10-28-2014)
 */
public class Fraction
{
    //  declare any fields
    private int numerator;  // declaring a field of type int
    // named numerator
    private int denominator;

    //  define any constructors

    /** creating a fraction with value of 1/1
     *
     *
     */
    public Fraction()
    {
        numerator = 1; // no need to know the fields for javadoc comments
        denominator = 1;
    }

    /** creating a reduced fraction with inputing newNumerator and newDenominator
     * @param newNumerator 
     * @param newDenominator
     */
    public Fraction (int newNumerator, int newDenominator)
    {
        numerator= newNumerator;
        denominator=newDenominator;
        reduce();
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

    /** gets Denominator that is an integer
     * @return an integer denominator
     */
    public int getDenominator()
    {
        return denominator;
    }

    /** the numerator is set, but it does not return anything
     * @param newNumerator
     */
    public void setNumerator(int newNumerator)
    //                       ^^^^^^^^^^^^^^^^ 
    //                       formal parameter
    {
        numerator = newNumerator;
        reduce();
    }

    /** the denominator is set, but it does not return anything
     * @param newDenominator 
     */
    public void setDenominator(int newDenominator)
    {
        denominator = newDenominator;
        reduce();
    }

    /** divides the obtained numerator by the obtained denominator. the denominator can not be zero
     * @return getNumerator/getDenominator
     */
    public double getValue()
    {
        return ((double) getNumerator() ) / getDenominator();
        //                                  ^^^^^^^^^^^^^^^^ internal method call
        //               ^^^^^^^^^^^^^^ internal method call
    }

    /** Returns the String representation of a fraction in the form numerator/denominator
     *@return numerator/denominator
     *
     */
    public String toString()
    {
        return numerator + "/" + denominator;
    }

    /** Returns the fraction multiplied by an integer in its reduced form
     *@param int num
     *@return result
     */
    public Fraction multiply(int num)
    {
        Fraction result=new Fraction(numerator * num,denominator);
        return result;
    }

    /** Returns the Fraction divided by an integer in its reduced form
     *@param int num
     *@return result
     */
    public Fraction divide(int num)
    {
        Fraction result=new Fraction(numerator, denominator * num);
        return result;
    }

    /** Divides Fraction by another Fraction
     *@param Fraction other is the copy of the Fraction object
     *@return reduced result
     */ 
    public Fraction divide(Fraction other)
    {
        Fraction result=new Fraction(numerator*other.denominator,denominator*other.numerator);
        return result;
    }

    /** Multiplies Fraction by another Fraction
     *@param Fraction other is the copy of the Fraction object
     *@return reduced result
     */ 
    public Fraction multiply(Fraction other)
    {
        Fraction result=new Fraction(numerator*other.numerator,denominator*other.denominator);
        return result;
    }

    /**Copy constructor that creates a copy of the given Fraction
     *@param Fraction other is the copy of the Fraction object
     *
     */ 
    public Fraction(Fraction other)
    {
        numerator=other.numerator;
        denominator=other.denominator;
    }

    /** Returns the Fraction added to an integer in its reduced form
     *@param int num
     *@return result
     */
    public Fraction add(int num)
    {
        Fraction result=new Fraction (numerator +(num*denominator), denominator);
        return result;
    }

    /** adds Fraction to another Fraction
     *@param Fraction other is the copy of the Fraction object
     *@return reduced result
     */ 
    public Fraction add(Fraction other)
    {
        Fraction result=new Fraction (numerator*other.denominator+other.numerator*denominator, denominator*other.denominator);
        return result;
    }

    /** subtracts Fraction to another Fraction
     *@param Fraction other is the copy of the Fraction object
     *@return reduced result
     */ 
    public Fraction subtract(int num)
    {
        Fraction result=new Fraction (numerator -(num*denominator), denominator);
        return result;
    }

    /** subtracts Fraction from another Fraction
     *@param Fraction other is the copy of the Fraction object
     *@return reduced result
     */ 
    public Fraction subtract(Fraction other)
    {
        Fraction result=new Fraction (numerator*other.denominator-other.numerator*denominator, denominator*other.denominator);
        return result;
    }

    /** reduce method does not return anything, but it reduces the Fraction
     *
     *
     */ 
    private void reduce()
    { if (numerator!=0 && denominator!=0)
        {
            int gcf=MyMath.gcf(numerator, denominator);
            numerator= (numerator/gcf);
            denominator=(denominator/gcf);
            if (numerator<0 && denominator<0)
            {
                numerator=numerator * -1;
                denominator=denominator *-1;
            }
        }

    }
}
