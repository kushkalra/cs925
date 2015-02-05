
/**
 * Write a description of class FractionTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FractionTester
{

    /**
     * Constructor for objects of class FractionTester
     */
    public FractionTester()
    {
       Fraction f=new Fraction(3,5);
       System.out.println("F=" + f);
       //Fractiong=f
       Fraction g= new Fraction (f);// Fraction class  and passes f as the actual parameter. This means that when
       // constructor is invoked, other will point to f
       System.out.println("g=" +g);
       g.setNumerator(7); // external method call
       System.out.println ("g=" +g);
       System.out.println("F=" + f);
    }
}
     