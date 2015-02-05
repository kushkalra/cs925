
/**
 * Write a description of class Game here.
 * 
 * @author (Kush Kalra) 
 * @version (11-4-14)
 */
public class Game
{ 

    /** rolls the dice twice and compiles there sum
     * @return sum
     */
    private int rollTwoDice()
    {
        Die newGame = new Die();
        newGame.roll();
        int sum=newGame.getValue();
        sum=sum+newGame.getValue();
        return sum;
    }

    /** creates a player1 and player 2 and prints who the winner is based on the sum of the rolls
     * 
     */
    public void playGame()
    { 
        int player1Score=rollTwoDice();
        int player2Score=rollTwoDice();
        System.out.println(player1Score);
        System.out.println(player2Score);
        if (player1Score>player2Score)
        {
            System.out.println("Player 1 is the winner");
        }
        if (player1Score<player2Score)
        {
            System.out.println("Player 2 is the winner");
        }
        if (player1Score==player2Score)
        {
            System.out.println("the game is a tie!");
        }

    }

    /** creates a counter, which counts the number of attemps until the dice equals the random number
     * @return counter
     * @param int number an integer between 1 and 6
     */
    public int counter(int number)
    { 
        int counter=1;
        Die die=new Die();
        die.roll();
        int faceValue=die.getValue();
        while (faceValue!=number)
        {
            die.roll();
            faceValue=die.getValue();
            counter++;
        } 
        return counter;
    }

    /** creates a counter, which counts the number of attempts until the WeightedDie equals the random number
     * @return counter
     * @param int number an integer between 1 and 6
     */
    public int weightedCounter(int number)
    { 
        int counter=1;
        WeightedDie unfairDice= new WeightedDie();
        unfairDice.roll();
        int faceValue=unfairDice.getValue();
        while (faceValue!=number)
        {
            unfairDice.roll();
            faceValue=unfairDice.getValue();
            counter++;
        } 
        return counter;
    }

    /** creates a scenario where it will be a tie or player1 will win
     * 
     */
    public void playUnfairGame()
    { 
        int player1Score=rollTwoDice();
        int player2Score=rollTwoDice();
        while (player1Score<player2Score)
        {
            player1Score = rollTwoDice();
        }
        if (player1Score==player2Score)
        {
            System.out.println("We have a tie!");
        }
        if (player1Score > player2Score)
        {
            System.out.println("Player1 is the winner");
        }
    }
}

