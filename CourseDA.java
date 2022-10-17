package course;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseDA 
{
    public ArrayList<Course> courseList= new ArrayList<Course>();
    public CourseDA(String rowStudentInfoSpecific) throws FileNotFoundException
    {
        Scanner scheduleInfo = new Scanner(new FileReader("CSV\\scheduleInfo.csv\\"));
        
        while(scheduleInfo.hasNext())
        {           
            String scheduleInfoRow = new String();
            scheduleInfoRow = scheduleInfo.nextLine();
            String[] scheduleInfoSpecific = new String[6];
            scheduleInfoSpecific = scheduleInfoRow.split(",");         
            int unit = Integer.parseInt(scheduleInfoSpecific[3]);
            if(scheduleInfoSpecific[0].equals(rowStudentInfoSpecific))
            {
                courseList.add(new Course(scheduleInfoSpecific[0], scheduleInfoSpecific[1], 
                unit,scheduleInfoSpecific[2], scheduleInfoSpecific[4], scheduleInfoSpecific[5]));
            }        
        }
    }
}
