
/**
 * Write a description of class MyMath here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyMath
{
     /** method for Euclid's Algorithm
     * @param inta, int b
     * @return gcf
     */
 public static int gcf(int a, int b)
{   a=Math.abs(a);
    b=Math.abs(b);
     while (a!=b)
{
    if (a>b) 
    {
            a=a-b;
    }
    
    else if (a<b)
    {
            b=b-a;
    } 
}
    return(a);
}
}

