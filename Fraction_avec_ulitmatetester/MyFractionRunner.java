/**
 * Tester for student's Fraction class
 * 
 * @author (Doug Vermes) 
 */
public class MyFractionRunner
{
    private static int numCorrect=0;
    private static int numIncorrect=0;
    
    public static void testFractionClass() // recall that will automatically invoke the toString method of your class, so if this does not work, check your toString method()
    {
        numCorrect = 0;
        numIncorrect = 0;
        Fraction x; // declares a variable of type Fraction named x
        
        
        System.out.print("Creating a new default fraction... ");
        x = new Fraction(); // creates a Fraction object,
        // invoke the default constructor of the Fraction class
        // assign x to refer to the newly created object
        System.out.println("done!");

        // now we have a Fraction object that we can refer to as x.

        System.out.print("Invoking getNumerator... Your method returned: ");
        System.out.println(x.getNumerator() + "\t(should be 1)");

        // object.method
        // The above is an EXTERNAL method call.

        // Fraction.getNumerator(); // doesn't make sense because all
        // fractions do NOT have the same
        // numerator! We need to find out
        // the numerator of an INSTANCE of
        // the Fraction class.

        // (also: getNumerator is not a static method)

        System.out.println("Executing system.out.println(x);");
        System.out.println(" // recall that passing an object as the parameter to println will");
        System.out.println(" // automatically invoke the toString method of your class, so if");
        System.out.println(" // this does not work, check your toString method.");
        System.out.print  ("Your program returned: ");
        System.out.print(x);  // looks for the toString method in the Fraction class
        // but there isn't one (yet)! 
        // since Fraction is a subclass of Object, Java
        // next looks for the toString method in the
        // Object class.

        System.out.println("\t(should be 1/1)");                                
        System.out.println("\nIf your toString method is broken, you MUST fix it before any of");
        System.out.println("the following tests will work properly!\n");

        // testing various add methods
        Fraction f1 = new Fraction(2,3);
        System.out.print(f1 + " + 4    = ");
        Fraction result = f1.add(4);
        System.out.print(result);
        System.out.println("\t (should be 14/3)");
        checkAnswer(result,14,3);
        
        System.out.println("\nHas f1 remained unchanged after calling the add method?");
        System.out.println("Before, f1 = 2/3\nAfter, f1 = " + f1 + "\t(should still be 2/3)\n");
        checkAnswer(f1,2,3);
        
        Fraction f2 = new Fraction(3,5);
        f1 = new Fraction(2,3);
        System.out.print(f1 + " + " + f2 + "  = ");
        result = f1.add(f2);
        System.out.print(result);
        System.out.println("\t (should be 19/15)");
        checkAnswer(result,19,15);
        
        System.out.println("\nHas f1 remained unchanged after calling the add method?");
        System.out.println("Before, f1 = 2/3\nAfter, f1 = " + f1 + "\t(should still be 2/3)\n");
        checkAnswer(f1,2,3);
        
        System.out.println("\nHas f2 remained unchanged after calling the add method?");
        System.out.println("Before, f2 = 3/5\nAfter, f2 = " + f2 + "\t(should still be 3/5)\n");
        checkAnswer(f2,3,5);
        
        f1 = new Fraction(3,8);
        f2 = new Fraction(7,12);
        System.out.print(f1 + " + " + f2 + " = ");
        result = f1.add(f2);
        System.out.print(result);
        System.out.println("\t (should be 23/24)");
        checkAnswer(result,23,24);
        System.out.println();

        // testing various subtract methods
        f1 = new Fraction(7,3);
        System.out.print(f1 + " - 2    = ");
        result = f1.subtract(2);
        System.out.print(result);
        System.out.println("\t (should be 1/3)");
        checkAnswer(result,1,3);
        
        System.out.println(" // if your program doesn't handle negative fractions properly,");
        System.out.println(" // make sure your gcf method works properly with negative inputs");
        f1 = new Fraction(2,3);
        System.out.print(f1 + " - 4    = ");
        result = f1.subtract(4);
        System.out.print(result);
        System.out.println("\t (should be -10/3)");
        checkAnswer(result,-10,3);
        System.out.println();

        System.out.println("\nHas f1 remained unchanged after calling the subtract method?");
        System.out.println("Before, f1 = 2/3\nAfter, f1 = " + f1 + "\t(should still be 2/3)\n");
        checkAnswer(f1,2,3);
        
        f2 = new Fraction(3,5);
        System.out.print(f1 + " - " + f2 + "  = ");
        result = f1.subtract(f2);
        System.out.print(result);
        System.out.println("\t (should be 1/15)");
        checkAnswer(result,1,15);
        
        System.out.println("\nHas f1 remained unchanged after calling the subtract method?");
        System.out.println("Before, f1 = 2/3\nAfter, f1 = " + f1 + "\t(should still be 2/3)\n");
        checkAnswer(f1,2,3);
        System.out.println("\nHas f2 remained unchanged after calling the subtract method?");
        System.out.println("Before, f2 = 3/5\nAfter, f2 = " + f2 + "\t(should still be 3/5)\n");
        checkAnswer(f2,3,5);
        
        f1 = new Fraction(3,8);
        f2 = new Fraction(7,12);
        System.out.print(f1 + " - " + f2 + " = ");
        result = f1.subtract(f2);
        System.out.print(result);
        System.out.println("\t (should be -5/24)");
        checkAnswer(result,-5,24);
        System.out.println();

        System.out.println("\nHas f1 remained unchanged after calling the subtract method?");
        System.out.println("Before, f1 = 3/8\nAfter, f1 = " + f1 + "\t(should still be 3/8)\n");
        checkAnswer(f1,3,8);
        System.out.println("\nHas f2 remained unchanged after calling the subtract method?");
        System.out.println("Before, f2 = 7/12\nAfter, f2 = " + f2 + "\t(should still be 7/12)\n");
        checkAnswer(f2,7,12);
        
        // test various multiply methods
        System.out.print(f1 + " * 2    = ");           
        result = f1.multiply(2);
        System.out.print(result);           
        System.out.println("\t (should be 3/4)");
        checkAnswer(result,3,4);
        
        System.out.println("\nHas f1 remained unchanged after calling the multiply method?");
        System.out.println("Before, f1 = 3/8\nAfter, f1 = " + f1 + "\t(should still be 3/8)\n");
        checkAnswer(f1,3,8);
        
        System.out.print(f1 + " * 0    = ");           
        result = f1.multiply(0);
        System.out.print(result);           
        System.out.println("\t (should be 0/#) (denominator can be any non-zero #)");
        checkAnswer(result,0);
        
        System.out.print(f1 + " * " + f2 + " = ");           
        result = f1.multiply(f2);
        System.out.print(result);           
        System.out.println("\t (should be 7/32)");
        checkAnswer(result,7,32);
        
        System.out.println("\nHas f1 remained unchanged after calling the multiply method?");
        System.out.println("Before, f1 = 3/8\nAfter, f1 = " + f1 + "\t(should still be 3/8)\n");
        checkAnswer(f1,3,8);
        System.out.println("\nHas f2 remained unchanged after calling the multiply method?");
        System.out.println("Before, f2 = 7/12\nAfter, f2 = " + f2 + "\t(should still be 7/12)\n");
        checkAnswer(f2,7,12);
        
        // test various divide methods
        System.out.print(f1 + " / 2    = ");           
        result = f1.divide(2);
        System.out.print(result);           
        System.out.println("\t (should be 3/16)");
        checkAnswer(result,3,16);
        
        System.out.println("\nHas f1 remained unchanged after calling the divide method?");
        System.out.println("Before, f1 = 3/8\nAfter, f1 = " + f1 + "\t(should still be 3/8)\n");
        checkAnswer(f1,3,8);        
        
        System.out.print(f1 + " / " + f2 + " = ");           
        result = f1.divide(f2);
        System.out.print(result);           
        System.out.println("\t (should be 9/14)");
        checkAnswer(result,9,14);
        
        System.out.println("\nHas f1 remained unchanged after calling the divide method?");
        System.out.println("Before, f1 = 3/8\nAfter, f1 = " + f1 + "\t(should still be 3/8)\n");
        checkAnswer(f1,3,8);
        System.out.println("\nHas f2 remained unchanged after calling the divide method?");
        System.out.println("Before, f2 = 7/12\nAfter, f2 = " + f2 + "\t(should still be 7/12)\n");
        checkAnswer(f2,7,12);        
        
        //             System.out.println("\nFinally, let's test if you remembered to throw an IllegalArgumentException");
        //             System.out.println("when your divide method is called with a dividend of 0...\n");
        //             System.out.print(f1 + " / 0    = ");           
        //             try
        //             {
        //                 result = f1.divide(0);
        //             }
        //             catch (IllegalArgumentException ex)
        //             {
        //                 System.out.println("(your program correctly threw an IllegalArgumentException)");
        //             }
        //             System.out.println("\nIf you did not see a message above about your program correctly throwing");
        //             System.out.println("an IllegalArgumentException, then you didn't properly handle dividing by 0.");

        System.out.println("TOTALS: Correct: " + numCorrect + "\tIncorrect: " + numIncorrect);
    }
    
    // preconditions: getNumerator and getDenominator methods of Fraction class must work properly
    private static void checkAnswer(Fraction f, int num, int denom)
    {
        if (f.getNumerator()==num && f.getDenominator()==denom)
        {
            numCorrect++;
            System.out.println("CORRECT");
        }
        else
        {
            numIncorrect++;
            System.out.println("INCORRECT");
        }
    }

    // preconditions: getNumerator and getDenominator methods of Fraction class must work properly
    private static void checkAnswer(Fraction f, int num)
    {
        if (f.getNumerator()==num && f.getDenominator()!=0)
        {
            numCorrect++;
            System.out.println("CORRECT");
        }
        else
        {
            numIncorrect++;
            System.out.println("INCORRECT");
        }
    }
}
