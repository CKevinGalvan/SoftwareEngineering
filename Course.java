package course;
public class Course 
{
    String studentNumber;
    String courseCode;
    String description;
    int unit;
    String day;
    String time; 
    public Course(String studentNumber, String courseCode, int unit, String description, String day,String time)
    {
        setStudentNumber(studentNumber);
        setCourseCode(courseCode);
        setDescription(description);
        setUnit(unit);
        setDay(day);
        setTime(time);
    }
    public Course() {
    }
    public void setStudentNumber(String studentNumber)
    {
        this.studentNumber = studentNumber;
    }
    public String getStudentNumber()
    {
        return studentNumber;
    }
    public void setCourseCode(String courseCode)
    {
        this.courseCode = courseCode;
    }   
    public String getCourseCode()
    {
        return courseCode;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public String getDescription()
    {
        return description;
    }
    public void setUnit(int unit)
    {
        this.unit = unit;      
    }
    public int getUnit()
    {
        return unit;
    }
    public void setDay(String day)
    {
        this.day = day;
    }
    public String getDay()
    {
        return day;
    }
    public void setTime(String time)
    {
        this.time = time;
    }
    public String getTime()
    {
        return time;
    }
}

