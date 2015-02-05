import java.util.ArrayList;
/**
 * Represents the schedule of a student.
 * 
 * @author (Kush Kalra) 
 * @version (1/6/2015)
 */
public class Schedule
{
    private String[][] sched;   // represents a week's schedule. rows represent periods (0-6)
    // and columns represent days of the week (0=Monday,1=Tuesday,...,4=Friday)
    private final int NUM_PERIODS = 7;
    private final int NUM_DAYS_IN_WEEK = 5;

    /**
     * Builds the schedule for a given student.
     * @param s the student whose schedule you wish to build
     */
    public Schedule(Student s)
    {
        sched=new String[NUM_PERIODS][NUM_DAYS_IN_WEEK];
        for (Course currentCourse: s.getCoursesTaken()) // your goal is to get the list of courses for the current student,
        {
            String block=currentCourse.getBlock();
            String name=currentCourse.getName();

            for (int i=0; i<block.length(); i++)
            {
                if (block.charAt(i)!=('x'))
                {

                    int period = Integer.parseInt(block.substring(i,i+1));
                    sched[period-1][i]=name;
                    // extract the schedule block from each course,
                    // and then populate the sched 2-D array with the NAME of the course at all its
                    // meeting times.
                    //
                    // Example: if Math 444 meets in the 123x2 block, then it meets Monday 1st period,
                    // Tuesday 2nd period, Wednesday 3rd period, not on Thursdays, and Friday 2nd period.
                    // After this constructor finishes running, sched should have been initialized such that:
                    // sched[0][0] == "Math 444"   // period 1 on Monday
                    // sched[1][1] == "Math 444"   // period 2 on Tuesday
                    // sched[2][2] == "Math 444"   // period 3 on Wednesday
                    // sched[1][4] == "Math 444"   // period 2 on Fridays
                }

            }
        }

    }

    // DO NOT MODIFY THE METHODS BELOW
    /**
     * Prints the schedule to the terminal window
     */
    public void printSchedule()
    {
        System.out.println("  #  |   MONDAY   |  TUESDAY   | WEDNESDAY  |  THURSDAY  |   FRIDAY   |");
        System.out.println("-----------------------------------------------------------------------");
        for (int p = 0; p < NUM_PERIODS; p++)
        {
            System.out.print("  " + (p+1) + "  |");
            for (int d = 0; d < NUM_DAYS_IN_WEEK; d++)
            {
                String curCourse = sched[p][d];
                if (curCourse == null)
                {
                    curCourse = "        ";
                }
                else
                {
                    curCourse += "        ";
                    curCourse = curCourse.substring(0,8);
                }
                System.out.print("  " + curCourse + "  |");
            }
            System.out.println();
            System.out.println("-----------------------------------------------------------------------");
        }
    }
}
