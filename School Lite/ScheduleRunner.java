/**
 * Tester class for Schedule
 * 
 * @author (Doug Vermes) 
 * @version (01/06/2014)
 */
public class ScheduleRunner
{
    public static void testSchedule()
    {
        Comparable[] arr = new Comparable[3];

        Student s1 = new Student("Peter Capaldi");
        s1.addCourse(new Course(90,"Math 444",3,"123x2"));
        s1.addCourse(new Course(95,"AT Computer Science",6,"6567x"));
        s1.addCourse(new Course(84,"Art History",1,"3x134"));
        s1.addCourse(new Course(89,"English 232",2,"43x21"));
        s1.addCourse(new Course(82,"Physics 513",1,"2144x"));
        s1.addCourse(new Course(99,"French 343",1,"57x65"));
        
        Schedule mySchedule = new Schedule(s1);
        mySchedule.printSchedule();
    }
    
}
