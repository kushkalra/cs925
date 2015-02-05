
/**
 * Represents the general category of an athlete.
 * 
 * @author (Doug Vermes) 
 * @version (1.0)
 */
public class Athlete
{
    private String firstName;
    private String lastName;
    private String sport;
    private double hoursTraining;


    public Athlete(String myFirstName, String myLastName, String sportPlayed)
    {
        firstName = myFirstName;
        lastName = myLastName;
        sport = sportPlayed;
        hoursTraining = 0;
    }
    
    public void train(double hours) 
    {
        System.out.println("Athlete training for " + hours + "  hours.");
        hoursTraining+=hours;
    }
    
    public String getName()
    {
        return (firstName + " " + lastName);
    }

    public String getSport()
    {
        return sport;
    }

    public double getHoursTraining()
    {
        return hoursTraining;
    }
}
