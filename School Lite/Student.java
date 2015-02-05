import java.util.ArrayList;

public class Student
{ 
    private ArrayList<Course> coursesTaken; // list of courses this student has taken
    private String name;    // name of this Student
    
    public Student(String myName)
    {
        name = myName;
        coursesTaken = new ArrayList<Course>();
    }
    
    public void addCourse(Course myCourse)
    {
        coursesTaken.add(myCourse);
    }

    public String getName()
    {
        return name;
    }
    
    /**
     *Precondition: a student has taken at least one course.
     *Postcondition: returns an ArrayList of the Courses a  
     * student has taken.
     */
    public ArrayList<Course> getCoursesTaken()
    {   return coursesTaken;    }

    /**
     *Precondition: a student has taken at least one course.
     *Postcondition: returns the gpa of a student, between
     *  0 < x < 100. Courses are weighted by number of credits, so a student's
     *  grade in a 2-credit course counts twice as much as a grade in a 1-credit
     *  course, and so on.
     */
    public double computeGPA()
    { 
        // to be implemented in a later class, but not now.
        return -1;
    }

    /**
     *Precondition: a student has taken at least one course.
     *Postcondition: returns true if this student's total number of 
     *  credits is >125 and GPA is >=75, false otherwise.
     */
    public boolean isSenior()
    {
        // to be implemented in a later class, but not now.
        return false;
    }
    
    public int getTotalCredits()
    {
        // to be implemented in a later class, but not now.
        return 0;
    }
    
    /**
     * Compares two students by GPA.
     * @param other The other student to compare to this one
     * @return A positive number if this student has a higher GPA than the other student,
     *         A negative number if this student has a lower GPA than the other student,
     *         0 if the two students have the same GPA.
     */
    public int compareTo(Student other)
    {
        // to be implemented in a later class, but not now.
        return 0; // all students are equal by default. :)
    }
    
    public String toString()
    {
        // to be modified in a later class, but not now.
        return getName();
    }
}
