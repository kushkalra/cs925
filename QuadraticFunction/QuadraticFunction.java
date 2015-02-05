
/**
 * Pg 408 problem 4a,4b,4c class QuadraticFunction here.
 * 
 * @author (Kush Kalra) 
 * @version (January 12, 2015)
 */
public class QuadraticFunction implements Comparable <QuadraticFunction>
{
    // instance variables - replace the example below with your own
    public int d;
    public int e;
    public int f;

    /** equates the variables of one fraction to another
     *@param int a, int b, int c
     *
     */
    public QuadraticFunction(int a, int b, int c)
    {
        d=a;
        e=b;
        f=c;
    }

    /** Returns the quadratic function in a String form
     *
     *@return the quadratic function
     */
    public String toString()
    {
        if (e<0 && f<0)
        {
            return d+"x^2"+ e + "x"+f;
        }
        if(e<0)
        {
            return d+"x^2"+  + e + "x"+ "+" +f;
        }
        if(f<0)
        {
            return d+"x^2"+ "+" + e + "x"+ f;
        }
        return d+"x^2"+ "+" + e + "x"+ "+" +f;
    }

    /** passes a certain x through a quadratic unction
     *@param double x
     *@return result of the function
     */
    public double valueAt (double x)
    {
        return x*x*d+x*e+f;
    }

    /** Sees if two functions are equal
     *@param QuadraticFunction other, another function to compare to 
     *@return true if they are equal, else false
     */
    public boolean equals(QuadraticFunction other )
    {
        if(d==other.d && e==other.e && f==other.f)
        {
            return true;
        }
        return false;
    }

    /** Returns the function that is greater, 
     *@param QuadraticFunction other, another function to compare to 
     *@return 1 if the orignal function is bigger, -1 if other is bigger, and 0 if equal
     */
    public int compareTo(QuadraticFunction other )
    {

        if (d>(other.d))
        {        
            return 1;
        }
        if (d<(other.d))
        {
            return -1;
        }
        if (d==(other.d))
        {
            if (e>(other.e))
            {        
                return 1;
            }
            if (e<(other.e))
            {
                return -1;
            }
            if (e==(other.e))
            {
                if (f>(other.f))
                {        
                    return 1;
                }
                if (f<(other.f))
                {
                    return -1;
                } 
            }

        }
        return 0;

    }
    public int compareTo(Person other)
    {
        if(this.getLastName().equals(other.getLastName()))
        {
            if (this.getFirstName().compareTo(other.getFirstName())>0)
            {
                return 1;
            }
            if (this.getFirstName().compareTo(other.getFirstName())<0)
            {
                return -1;
            }
            if (this.getFirstName().compareTo(other.getFirstName())==0)
            {
                return 0;
            }
        }
        else if (this.getLastName().compareTo(other.getLastName())>0)
        {
            return 1;
        }
        return -1;
    }

}
