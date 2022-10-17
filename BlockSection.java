package blockSecPack;
import java.util.ArrayList;
import student.Student;
public class BlockSection 
//changessss
{//changes
	String blockCode;
	String description;
	String adviser;
	ArrayList<Student> listOfStudent = new ArrayList<Student>();
    public BlockSection(String blockCode, String description, String adviser, ArrayList<Student> listOfStudent)
    {
        setBlockCode(blockCode);
        setDescription(description);
        setAdviser(adviser);
		setListOfStudent(listOfStudent);
    }
	public String getBlockCode() {
		return blockCode;
	}
	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAdviser() {
		return adviser;
	}
	public void setAdviser(String adviser) {
		this.adviser = adviser;
	}
	public void setListOfStudent(ArrayList<Student> student)
	{
		this.listOfStudent = student;
	}
	public ArrayList<Student> getListOfStudent()
	{
		return listOfStudent;
	}
}
