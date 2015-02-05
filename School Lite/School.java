import java.util.ArrayList;

public class School
{ 
    private String name;        // name of this school
    private ArrayList<Student> students;    // list of all students in the school
    
    
    /**
     * Creates a new school with the specified name.
     * @param myName The name of this school.
     */
    public School(String myName)
    {
        name = myName;
        students = new ArrayList<Student>();
    }
    
    /**
     * Adds a new student to this school.
     * @param s The student to add.
     */
    public void addStudent(Student s)
    {
        students.add(s);    
    }
    
    /**
     *Precondition: there is at least one student in the school.
     *Postcondition: returns an ArrayList of all the students in     
     *  the school.
     */
    public ArrayList<Student> getAllStudentsInSchool()
    {  return students;    }

    /**
     *Precondition: there is at least one student in the school.
     *Postcondition: returns an ArrayList of all the seniors in
     *   the school
     */
    public ArrayList<Student> getSeniors()
    {
       // to be implemented in a later class, but not now.
       return null;
    }

    /**
     * @return The Student with the highest GPA
     */
    public Student getLargest()
    {
        // to be implemented in a later class, but not now.
        return null;
    }

    public String toString()
    {
        String toReturn = "List of students in the school:\n\n";
        for (Student current : students)
        {
            toReturn += current.toString() + "\n";
        }
        
        return toReturn;
    }
    
}
