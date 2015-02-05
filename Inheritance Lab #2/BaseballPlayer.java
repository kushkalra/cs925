
/**
 * Write a description of class BaseballPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BaseballPlayer extends Athlete
{
   private String position;
   private int stolenBases;
   public BaseballPlayer(String f, String l,String pos)
   {
       super(f,l,"Baseball");
       position=pos;
   }
   public void train(double hours)
   {
       System.out.println("Going to Spring Training for 0 hours");
       super.train(hours);
   }
   public void stealBase()
   {
         stolenBases++;
   }
}
