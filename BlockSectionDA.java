package blockSecPack;
import java.util.ArrayList;
import java.util.Scanner;
import student.StudentDA;
import java.io.FileNotFoundException;
import java.io.FileReader;
//changesss
public class BlockSectionDA 
{//changes
    ArrayList<BlockSection> blockSectionList;
	public BlockSectionDA() throws FileNotFoundException
	{
		Scanner blockSectionInfo = new Scanner(new FileReader("CSV\\blockSectionInfo.csv\\"));
			
		//empty list of blockSection
		blockSectionList = new ArrayList<>();
		int i = 0;
		while(blockSectionInfo.hasNext())
		{
			System.out.println("-----------------------------------");
			String output="";
			String output1="";
			String rowBlockSection = new String();
			rowBlockSection = blockSectionInfo.nextLine();
			String[] rowBlockSectionSpecific = new String[3];
			rowBlockSectionSpecific = rowBlockSection.split(",");
			//BlockSection object
			StudentDA studentDA = new StudentDA(rowBlockSectionSpecific[0]);		
						
			blockSectionList.add(new BlockSection(rowBlockSectionSpecific[0],rowBlockSectionSpecific[1],
			rowBlockSectionSpecific[2], studentDA.studentList));
			for(int j=0; j<blockSectionList.get(0).listOfStudent.size();j++)
			{
				output += "Block Section: "+blockSectionList.get(i).blockCode+"\t\t\t"
				+"Block Section Description: "+blockSectionList.get(i).description+"\n"
				+"Class Adviser: "+blockSectionList.get(i).adviser+"\n\n"
				+"Student Number: "+blockSectionList.get(i).listOfStudent.get(j).getStudentNumber()+"\t\t\t"
				+"Student Name: "+blockSectionList.get(i).listOfStudent.get(j).getName()
				+"  Program: "+blockSectionList.get(i).listOfStudent.get(j).getProgram()+"\n\n"
				+"Schedule\n"+
				"Course code\t\tDescription\t  Unit\tDay\tTime\n";
				for(int k=0;k<blockSectionList.get(i).listOfStudent.get(j).getListOfCourse().size();k++)
				{
					output1+= blockSectionList.get(i).listOfStudent.get(j).getListOfCourse().get(k).getCourseCode()+"\t       "
					+blockSectionList.get(i).listOfStudent.get(j).getListOfCourse().get(k).getDescription()+"\t            "
					+blockSectionList.get(i).listOfStudent.get(j).getListOfCourse().get(k).getUnit()+"\t"
					+blockSectionList.get(i).listOfStudent.get(j).getListOfCourse().get(k).getDay()+"\t"
					+blockSectionList.get(i).listOfStudent.get(j).getListOfCourse().get(k).getTime()+"\n";
				}				
				System.out.println(output+output1); 
				output="";
				output1="";
				System.out.println("-----------------------------------");
			}			
			i++;
		}		
	}
}