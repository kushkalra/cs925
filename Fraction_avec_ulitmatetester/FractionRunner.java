
/**
 * Write a description of class FractionRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FractionRunner
{
    public FractionRunner()
   {
        System.out.println ("Hello!!!");
        Fraction f1=new Fraction (2,7);
        Fraction f2= new Fraction (1,5);
        Fraction f3= new Fraction ();
        f1.setNumerator(7); // external method call
        f3.setNumerator(9); // dereferencing f3 directing this method call to that object

        //int x=4;
        //x.setnumerator(7); ^ can't be dereferenced
    }
    public void test1()
    {
        Fraction f1 = new Fraction (2,3);
        System.out.println(f1);
        Fraction result=f1.multiply(5);
        System.out.println(result);
        System.out.println(f1);
    }
   
}
