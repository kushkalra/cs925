import java.util.*;

public class Tester
{
    public static void runTests()
    {
         //UNCOMMENT BELOW WHEN YOU ARE DIRECTED TO DO SO
         BaseballPlayer player1 = new BaseballPlayer("Victor","Avram","1B");
         Athlete athlete1 = new BaseballPlayer("Kush","Kalra","CF");

        System.out.println("Player 1");
         player1.train(4);      // what is printed?
        System.out.println("athlete1");
         athlete1.train(3);  // which train method is invoked here? what is printed?
         player1.stealBase();   // does this work?
        // athlete1.stealBase();   // does this work?

        SkiJumper skier1= new SkiJumper("Adam","Young");
        // player1 = skier1;        // does this work?
        //player1 = (BaseballPlayer)skier1; // does this work?

        Athlete athlete2 = new Athlete("Kim","Zou","Ultimate");
        athlete2.train(6);  // which train method is invoked here? what is printed?



    }
    public static void runTests2()
    // before you run it on a computer, predict what the output of this method will be.
    // UNCOMMENT BELOW WHEN YOU ARE DIRECTED TO DO SO
    {
         SkiJumper skier1 = new SkiJumper("Caroline","Kristof");
       System.out.println("skier1 info: " + skier1.getName());
         System.out.println("skier1 info: " + skier1.getSport());
        skier1.train(12);
        skier1.fly();
         skier1.fly();
       System.out.println(skier1.getJumps()); 
        System.out.println(skier1.getHoursTraining());

       Athlete player1 = new Athlete("Maya","Subbakrishna","Golf");
        System.out.println("\nplayer1 info: " + player1.getName());
        System.out.println("player1 info: " + player1.getSport());
       player1.train(3);
        player1.train(5);
        System.out.println(player1.getHoursTraining());       
  
      

    }
}
