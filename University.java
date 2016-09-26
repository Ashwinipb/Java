package in.ac.kletech.University;

public class University {
	final static String code1="E30";
	final static String code2="E241";
	int noOfStud[]=new int[8];
	School[] s=new School[8];
	static
	{
		System.out.println("KLE tech's CET codes: " +code1+"and" +code2);
	}
	class School{
		private String sprogramCode;
		private String sSchoolCoOrdinator;
		private int iNoOfStud;
		private int iNoOfStaff;
		public String getsprogramCode() {
			return sprogramCode;
		}
		public String getSchoolCoOrdinator() {
			return sSchoolCoOrdinator;
		}
		public int getiNoOfStud() {
			return iNoOfStud;
		}
		public int getiNoOfStaff() {
			return iNoOfStaff;
		}
		public School(String sprogramCode,String sSchoolCoOrdinator,int iNoOfStud,int iNoOfStaff)
		{
			super();
			this.sprogramCode=sprogramCode;
			this.sSchoolCoOrdinator=sSchoolCoOrdinator;
			if(iNoOfStud>120)
				System.out.println("intake exceeded in:" +this.sprogramCode);
			else
				iNoOfStud=iNoOfStud;
		}
	}
 void createSchool()
 {
	 s[0]=new School("CS","AA",60,60);
	 s[1]=new School("EC","BB",120,70);
	 s[2]=new School("EEE","CC",80,50);
	 s[3]=new School("ME","DD",120,100);
	 s[4]=new School("CIVIL","EE",100,90);
	 s[5]=new School("Automation","FF",30,20);
	 s[6]=new School("Biotech","GG",40,20);
	 s[7]=new School("IT","HH",60,40);
	 
 }
 void calNoOfStud()
 {
	 for(int i=0;i<noOfStud.length;i++)
	 {
		 noOfStud[i]=s[i].getiNoOfStud();
	 }
 }
}
