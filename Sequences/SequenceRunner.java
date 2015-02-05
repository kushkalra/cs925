
/**
 * Tests the Sequences Class
 * 
 * @author (Kush Kalra) 
 * @version (December 2, 2014)
 */
public class SequenceRunner
{ 

    /** Tests methods in Sequences class
     *
     *
     */
    public static void main(String[] args)
    {
        Sequence s1=new Sequence(4);
        System.out.println(s1.toString());
        System.out.println(s1.sum());
        System.out.println(s1.approximateSum());
        System.out.println(s1.getTerm(2));
        System.out.println(s1.getTerm(3));
        System.out.println(s1.getTerm(1));
        System.out.println(s1.getTerm(5));
        System.out.println(s1.getTerm(0));
        s1=new Sequence(11);
        System.out.println(s1.sum());
        System.out.println(s1.approximateSum());
        Sequence s2=new Sequence(0);
        s2=new Sequence(-3);
    }
}
