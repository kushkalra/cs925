public class Course
{
    private int grade;          // grade in this course
    private String name;        // name of this course
    private String block;       // course block when this course meets
    private int credits;        // number of credits this course is worth

    public Course(String myName, int myCredits, String myBlock)
    {
        // the line below uses the special 'this' keyword to invoke the four-parameter
        // constructor of this class
        this(0,myName, myCredits, myBlock);
    }
    
    public Course(int myGrade, String myName, int myCredits, String myBlock)
    {
        grade = myGrade; 
        name = myName;
        credits = myCredits;
        if (!validBlock(myBlock))
            throw new IllegalArgumentException("Specified block (" + myBlock + ") is not a valid schedule block.");
        block = myBlock;
    }

    public String getName()
    {
        return name;
    }
    
    public String getBlock()
    {
        return block;
    }
    
    /**
     *precondition: a student has a grade
     *postcondition: returns the numeric grade a student    
     * received in a course, between 0 < x < 100.
     */
    public int getGrade()
    {   return grade;    }

    /**
     *precondition: a course has a number of credits.
     *postcondition: returns the number of credits a course is 
     *  worth, between 0 < x < 6.
     */ 
    public int getNumberOfCredits()
    {   return credits;    }

    /**
     * Returns the string representation of this course,
     * which is of the format: Course name (# credits) - Final Grade: grade
     */
    public String toString()
    {
        return getName() + " (" + getNumberOfCredits() + " credits) - Final Grade: " + getGrade();
    }

    // DO NOT MODIFY THE METHODS BELOW
    /**
     * precondition: toCheck is not null
     * postcondition: returns true if toCheck is a valid schedule block, false otherwise.
     */
    private boolean validBlock(String toCheck)
    {
        String[] blocks = {"123x2","2144x","3x134","43x21","x4213","57x65","6567x","x6556"};
        for (String curBlock : blocks)
        {
            if (toCheck.equals(curBlock))
                return true;
        }
        return false;
    }
}
