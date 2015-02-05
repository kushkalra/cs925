
/**
 * finds gcf and factorial
 * 
 * @author (Kush Kalra) 
 * @version (December 2, 2014)
 */
public class MyMath
{
    /** method for Euclid's Algorithm
     * @param long a which is number , long  b which is a number
     * @return gcf
     */
    public static long  gcf(long  a, long  b)
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

    /** finding the factorial of a number
     * @param long n which is the number we want to find the factorial of
     * @return factorial
     */
    public static long factorial (long  n)
    { long factorial=1;
        for (long i=1; i<=n; i++)
        {
            factorial=factorial*i;
        }
        if (n<0)
        {
            return -1;
        }
        if (n==0)
        {
            return 1;
        }
        return factorial;
    }
}

