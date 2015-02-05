
/**
 * Write a description of class WildLoopsLesson here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WildLoopsLesson
{
    /**
     * Constructor for objects of class WildLoopsLesson
     */
    public static int findsum(int n)
    {
       // input n (done via parameter
       int sum=0; // summ<--0
       int k=5;  // k<--5
       while (k<=n) // while k<=n no ; needed
       {
           sum=sum +k*k +5;
           k=k+1; // change
       }
       return sum;
    }
    
    public static void multiplesOfThree(int x)
    {
        int k=3;
        while (k<=x)
        { System.out.println(k);
          k=k+3;
        }
    }
}
