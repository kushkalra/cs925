import java.util.ArrayList;

/**
 * Chooses student to call on at random.
 * 
 * @author (Kush Kalra) 
 * @version (11/17/2014)
 */
public class StudentPicker
{
     ArrayList<String> students=new ArrayList<String>();
    /**
     * This constructor should read in a list of names from a file
     * called names.txt and store each name in a list.
     */
    public StudentPicker()
    {
         FileInput.loadWords("names.txt",students);
         System.out.print(students);
    }
    
    /**
     * Returns the name of a pseudo-randomly chosen student in our class.
     * @return the name of a student in our class.
     */
    public String chooseStudent()
    {
        int randomIndex= (int) (Math.random()*(students.size()));
        String randomStudent=students.get(randomIndex);
        return randomStudent;
    }
    
    /**
     * Returns the name of a pseudo-randomly chosen student in our class.
     * This method will never return the same student twice.
     * @return the name of a unique student in our class.
     */
    public String chooseUniqueStudent()
    {
        if (students.size()==0)
        {
            FileInput.loadWords("names.txt",students);
        }
        int randomIndex= (int) (Math.random()*(students.size()));
        String randomStudent=students.remove(randomIndex);
        return randomStudent;
    }
}
