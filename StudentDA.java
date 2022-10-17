package student;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import student.Student;
import course.CourseDA;

public class StudentDA 
{
    public ArrayList<Student> studentList = new ArrayList<Student>();
    public StudentDA(String rowBlockSectionSpecific) throws FileNotFoundException
    {
        Scanner studentInfo = new Scanner(new FileReader("CSV\\studentInfo.csv\\"));
        while(studentInfo.hasNext())
        {
            String studentInfoRow = new String();
            studentInfoRow = studentInfo.nextLine();
            String[] rowStudentInfoSpecific = new String[4];
            rowStudentInfoSpecific = studentInfoRow.split(",");
            if(rowBlockSectionSpecific.equals(rowStudentInfoSpecific[0]))
            {
                CourseDA course;
                course = new CourseDA(rowStudentInfoSpecific[1]);              
                Student student = new Student(rowStudentInfoSpecific[0], rowStudentInfoSpecific[1], 
                rowStudentInfoSpecific[2], rowStudentInfoSpecific[3], course.courseList);
                studentList.add(student);   
            }          
        }
    }
}
