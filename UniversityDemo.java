package in.ac.kletech.University;

public class UniversityDemo 
{

	public static void main(String[] args)
	{
		University KLETECH=new University();
		
		KLETECH.createSchool();
		KLETECH.calNoOfStud();
		System.out.println("--------------------");
		for(int i=0;i<KLETECH.noOfStud.length;i++)
		{
			if(KLETECH.noOfStud[i]!=0)
				System.out.println("No of students in" +KLETECH.s[i].getsprogramCode()+"are:" +KLETECH.noOfStud[i]);
		}
	}
}
