package student;
import java.util.ArrayList;
import course.Course;
import course.CourseDA;

public class Student 
{
    String blockSectionCode;
    String studentNumber;
    String name;
    String program;
    ArrayList<Course> listOfCourse = new ArrayList<Course>();
    Student(String blockSectionCode,String studentNumber, String name, String program, ArrayList<Course> courseList)
    {
        setBlockSectionCode(blockSectionCode);
        setStudentNumber(studentNumber);
        setName(name);
        setProgram(program);
        setListOfCourse(courseList);
    }   
    public void setBlockSectionCode(String blockSectionCode)
    {
        this.blockSectionCode = blockSectionCode;
    }
    public String getBlockSectionCode()
    {
        return blockSectionCode;
    }
    public void setListOfCourse(ArrayList<Course> listOfCourse)
    {
        this.listOfCourse = listOfCourse;
    }
    public ArrayList<Course> getListOfCourse()
    {
        return listOfCourse;
    }
    public void setStudentNumber(String studentNumber)
    {
        this.studentNumber = studentNumber;
    }
    public String getStudentNumber()
    {
        return studentNumber;
    }
    public String getName()
    {
        return name;
    }        
    public void setName(String name)
    {
        this.name = name;
    }   
    public String getProgram()
    {
        return program;
    }
    public void setProgram(String program)
    {
        this.program = program;
    }   
}
