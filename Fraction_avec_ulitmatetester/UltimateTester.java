
/**
 * Write a description of class UltimateTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UltimateTester
{

    /**
     * Constructor for objects of class UltimateTester
     */
   public static void runTests()
    {
        System.out.println("Testing our Fraction!");
        // write code to test your Fraction class throughly
        // output the test and the result
        //be sure to acessor mthods havent changed the orignal fraction
     for (int i=0; i<90; i++)
     {
         System.out.print("-");
     }
     System.out.println("");
        
     Fraction f= new Fraction(3,5);
     System.out.println("The denominator is equal to " + f.getDenominator());
     System.out.println("The numerator is equal to " + f.getNumerator());
     System.out.println("f = " + f);
     System.out.println("The numerator divided by the denominator is " + f.getValue());
       
    for (int i=0; i<90; i++)
     {
         System.out.print("-");
     }
     System.out.println("");    
           
     Fraction f1 = new Fraction(2,3);
     Fraction f2 = new Fraction(4,5);
     System.out.println("2/3 * 4/5 ="  + (f1.multiply(f2)));
     System.out.println("2/3 / 4/5 ="  + (f1.divide(f2)));
     System.out.println("4/5-2/3=" + (f2.subtract(f1)));
     System.out.println("4/5+2/3=" + (f2.add(f1)));
  
    }
}


