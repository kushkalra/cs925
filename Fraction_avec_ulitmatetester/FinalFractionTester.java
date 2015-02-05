import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
* A JUnit 4 test suite for the Fraction class.
*
* @author  (Doug Vermes)
* @version (a version number or a date)
*/
@RunWith(JUnit4.class)
public class FinalFractionTester
{
    private Fraction f;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method. This sets up the preconditions.
     */
    @Before
    public void setUp()
    {
        f = new Fraction();
    }

    @Test
    public void testGetNumerator()
    {
        assertEquals("getNumerator method call failed on default fraction", f.getNumerator(), 1);
    }

    @Test
    public void testGetDenominator()
    {
        assertEquals("getDenominator method call failed", f.getDenominator(), 1);
    }

    @Test
    public void testSetNumerator()
    {
        f.setNumerator(355);
        assertEquals("setNumerator(355) method call failed", f.getNumerator(), 355);
        f = new Fraction(2,9);
        f.setNumerator(3);
        assertEquals("setNumerator(3) on existing fraction 2/9 failed (did you forget to reduce?)", f.getNumerator(), 1);
    }

    @Test
    public void testSetDenominator()
    {
        f.setNumerator(123);
        assertEquals("setDenominator(123) method call failed", f.getNumerator(), 123);
        f = new Fraction(2,9);
        f.setDenominator(4);
        assertEquals("setDenominator(4) on existing fraction 2/9 failed (did you forget to reduce?)", f.getDenominator(), 2);
    }

    @Test
    public void testTwoIntParamConstructor()
    {
        f = new Fraction(2,3);
        assertEquals("numerator incorrect after new Fraction(2,3)", f.getNumerator(), 2);        
        assertEquals("denominator incorrect after new Fraction(2,3)", f.getDenominator(), 3);
    }

    @Test
    public void testCopyConstructor()
    {
        f = new Fraction(2,3);
        Fraction result = new Fraction(f);
        assertEquals("numerator of copied object incorrect after calling copy constructor on 2/3", result.getNumerator(), 2);        
        assertEquals("denominator of copied object incorrect after calling copy constructor on 2/3", result.getDenominator(), 3);
        System.out.println("Changing numerator of copied object to 5...");
        result.setNumerator(5);
        System.out.println("Changing denominator of copied object to 7...");
        result.setDenominator(7);
        System.out.println("Verifying that the original Fraction object of 2/3 was NOT affected\nby changing the numerator and denominator of the copied object");
        assertEquals("numerator of original object changed after modifying copied object", f.getNumerator(), 2);        
        assertEquals("denominator of copied object changed after modifying copied object", f.getDenominator(), 3);     
    }
    
    @Test
    public void testToString()
    {
        assertEquals("toString method call failed on default fraction", f.toString(), "1/1");
    }


    @Test
    public void testGetValue()
    {
        assertEquals("getValue method called failed on default fraction", f.getValue(), 1.0, .001);
        f = new Fraction(3,5);
        assertEquals("getValue method called failed on fraction 3/5", f.getValue(), 3/5.0, .001);
        f = new Fraction(-1,2);
        assertEquals("getValue method called failed on fraction -1/2", f.getValue(), -1/2.0, .001);
        f = new Fraction(2,3);
        assertEquals("getValue method called failed on fraction 2/3", f.getValue(), 2/3.0, .001);

    }

    private void testReduceHelper(Fraction frac, int newNum, int newDenom, int reducedNum, int reducedDenom)
    {
        System.out.println("Testing new Fraction(" + newNum + "," + newDenom + ")");
        f = new Fraction(newNum,newDenom);
        assertEquals("reduced numerator incorrect after new Fraction(" + newNum + "," + newDenom + ")", f.getNumerator(), reducedNum);        
        assertEquals("reduced denominator incorrect after new Fraction(" + newNum + "," + newDenom + ")", f.getDenominator(), reducedDenom);

    }

    @Test(timeout = 3000)
    public void testReduce()
    {
        System.out.println("Testing default Fraction");
        assertEquals("reduced numerator incorrect after new default Fraction", f.getNumerator(), 1);        
        assertEquals("reduced denominator incorrect after new default Fraction", f.getDenominator(), 1);
        testReduceHelper(f,2,4,1,2);
        testReduceHelper(f,15,7,15,7);
        testReduceHelper(f,18,6,3,1);
        testReduceHelper(f,8,8,1,1);
        testReduceHelper(f,-2,4,-1,2);
        testReduceHelper(f,2,-4,1,-2);
        testReduceHelper(f,-2,-4,1,2);
        testReduceHelper(f,0,3,0,3);       
    }

    private void testOperationWithIntHelper(String op, Fraction frac, int origNum, int origDenom, int operand, int correctNum, int correctDenom)
    {
        testOperationWithIntHelper(op, frac, origNum, origDenom, operand, correctNum, correctDenom, false);
    }
    
    private void testOperationWithIntHelper(String op, Fraction frac, int origNum, int origDenom, int operand, int correctNum, int correctDenom, boolean ignoreDenom)
    {
        frac = new Fraction(origNum, origDenom);
        Fraction result;
        if (op.equals("+"))
            result = frac.add(operand);
        else if (op.equals("-"))
            result = frac.subtract(operand);
        else if (op.equals("*"))
            result = frac.multiply(operand);
        else
            result = frac.divide(operand);
        assertEquals(origNum + "/" + origDenom + " " + op + " " + operand + " yielded incorrect numerator", result.getNumerator(), correctNum);
        if (!ignoreDenom)
            assertEquals(origNum + "/" + origDenom + " " + op + " " + operand + " yielded incorrect denominator", result.getDenominator(), correctDenom);
        assertEquals("original fraction of " + origNum + "/" + origDenom + " has been changed by the " + op + " operation (but should not have been)", frac.toString(), origNum + "/" + origDenom);
        
    }

    private void testOperationWithFractionHelper(String op, Fraction frac, int origNum, int origDenom, int otherNum, int otherDenom, int correctNum, int correctDenom)
    {
        testOperationWithFractionHelper(op, frac, origNum, origDenom, otherNum, otherDenom, correctNum, correctDenom, false);
    }
    
    private void testOperationWithFractionHelper(String op, Fraction frac, int origNum, int origDenom, int otherNum, int otherDenom, int correctNum, int correctDenom, boolean ignoreDenom)
    {
        frac = new Fraction(origNum, origDenom);
        Fraction other = new Fraction(otherNum, otherDenom); 
        Fraction result;
        if (op.equals("+"))
            result = frac.add(other);
        else if (op.equals("-"))
            result = frac.subtract(other);
        else if (op.equals("*"))
            result = frac.multiply(other);
        else
            result = frac.divide(other);
        assertEquals("(" + origNum + "/" + origDenom + ") " + op + " (" + otherNum + "/" + otherDenom + ") yielded incorrect numerator", Math.abs(result.getNumerator()), Math.abs(correctNum));
        if (!ignoreDenom)
            assertEquals("(" + origNum + "/" + origDenom + ") " + op + " (" + otherNum + "/" + otherDenom + ") yielded incorrect denominator", Math.abs(result.getDenominator()), Math.abs(correctDenom));
        assertEquals("(" + origNum + "/" + origDenom + ") " + op + " (" + otherNum + "/" + otherDenom + ") yielded result with incorrect sign", Math.signum(result.getNumerator() / result.getDenominator()), Math.signum(correctNum / correctDenom), 0.001);    
        assertEquals("original fraction of " + origNum + "/" + origDenom + " has been changed by the " + op + " operation (but should not have been)", frac.toString(), origNum + "/" + origDenom);
        
    }
    
    
    @Test
    public void testMultiplyWithIntParameter()
    {
        testOperationWithIntHelper("*",f,3,8,7,21,8);
        testOperationWithIntHelper("*",f,3,8,2,3,4);
        testOperationWithIntHelper("*",f,3,8,-2,-3,4);
        testOperationWithIntHelper("*",f,3,8,0,0,8,true);
    }

    @Test
    public void testDivideWithIntParameter()
    {
        testOperationWithIntHelper("/",f,3,8,2,3,16);
        testOperationWithIntHelper("/",f,8,5,2,4,5);
        testOperationWithIntHelper("/",f,6,-5,-3,2,5);
        testOperationWithIntHelper("/",f,0,3,4,0,3,true);
    }

    @Test
    public void testAddWithIntParameter()
    {
        testOperationWithIntHelper("+",f,2,3,4,14,3);
        testOperationWithIntHelper("+",f,2,5,-1,-3,5);
        testOperationWithIntHelper("+",f,4,7,0,4,7);   
        testOperationWithIntHelper("+",f,4,7,-2,-10,7);   
    }
    @Test
    public void testSubtractWithIntParameter()
    {
        testOperationWithIntHelper("-",f,7,3,2,1,3);
        testOperationWithIntHelper("-",f,2,3,4,-10,3);
        testOperationWithIntHelper("-",f,4,7,0,4,7);   
        testOperationWithIntHelper("-",f,3,4,-1,7,4);   
        testOperationWithIntHelper("-",f,0,4,1,-1,1);   
    }
    @Test
    public void testMultiplyWithFractionParameter()
    {
        testOperationWithFractionHelper("*",f,3,8,7,12,7,32);
        testOperationWithFractionHelper("*",f,4,13,13,4,1,1);
        testOperationWithFractionHelper("*",f,4,13,0,5,0,65,true);
        testOperationWithFractionHelper("*",f,3,-2,-5,7,15,14);
    }
    @Test
    public void testDivideWithFractionParameter()
    {
        testOperationWithFractionHelper("/",f,3,8,7,12,9,14);
        testOperationWithFractionHelper("/",f,4,5,1,2,8,5);
        testOperationWithFractionHelper("/",f,4,5,-1,2,8,-5);
        testOperationWithFractionHelper("/",f,4,5,1,-2,-8,5);
        testOperationWithFractionHelper("/",f,4,5,1,3,12,5);        
    }
    
    @Test
    public void testAddWithFractionParameter()
    {
        testOperationWithFractionHelper("+",f,3,8,2,8,5,8);
        testOperationWithFractionHelper("+",f,3,8,1,8,1,2);
        testOperationWithFractionHelper("+",f,3,8,13,8,2,1);
        testOperationWithFractionHelper("+",f,3,-8,13,8,5,4);
        testOperationWithFractionHelper("+",f,3,8,0,8,3,8);
        testOperationWithFractionHelper("+",f,0,12,9,14,9,14);
        testOperationWithFractionHelper("+",f,3,8,5,7,61,56);
        testOperationWithFractionHelper("+",f,2,5,-3,4,-7,20);               
        testOperationWithFractionHelper("+",f,2,5,-2,5,0,5,true);               
    }

    @Test
    public void testSubtractWithFractionParameter()
    {
        testOperationWithFractionHelper("-",f,5,8,2,8,3,8);
        testOperationWithFractionHelper("-",f,5,8,1,8,1,2);
        testOperationWithFractionHelper("-",f,5,8,-1,8,3,4);
        testOperationWithFractionHelper("-",f,5,8,5,8,0,8,true);
        testOperationWithFractionHelper("-",f,5,8,0,4,5,8);
        testOperationWithFractionHelper("-",f,0,5,7,12,-7,12);
        testOperationWithFractionHelper("-",f,3,8,7,12,-5,24);
        testOperationWithFractionHelper("-",f,-3,7,2,3,-23,21);
    }
}



