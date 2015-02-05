
/**
 * Write a description of class homework here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class homework
{
    public homework()
    {
       Fraction jonG=new Fraction(3,2);
       Fraction newJon=jonG.add(3);
       System.out.println(newJon);
       
       // setJonG equal to 2/3
       jonG=new Fraction(2,3);
       // subtract 1 from jonG
       newJon=jonG.subtract(1);
       //print the result from the previous step
       System.out.println(jonG + "-1==" + newJon);
       
    }
}

    
