package in.ac.kletech.Employee;

public class Library {
	private int iVisitingTime;
	private String sSection;
	private int iPenalty;
	private int iBookLendingTime;
	
	public Library(int iVisitingTime,int iBookLendingTime,String sSection){
		this.iVisitingTime=iVisitingTime;
		this.iBookLendingTime=iBookLendingTime;
		this.sSection=sSection;
		
	}

	public int getiVisitingTime() {
		return iVisitingTime;
	}

	public String getsSection() {
		return sSection;
	}

	public int getiPenalty() {
		return iPenalty;
	}

	public int getiBookLendingTime() {
		return iBookLendingTime;
	}
	boolean ReferenceSection(){
		if (iVisitingTime>4)
			return false;
		else
			return true;
	}
	
	void LendingSection(){
		
		if (iBookLendingTime>0  && iBookLendingTime<=7 )
			iPenalty=20;
		else if(iBookLendingTime>7  &&  iBookLendingTime<=14)
			iPenalty=50;
		else if(iBookLendingTime>14 && iBookLendingTime<=21)
			iPenalty=150;
		else
			iPenalty=300;
		System.out.println("Penalty=" +iPenalty);
			
	
	}
    void Digitallibrary(){
    	System.out.println("Timings of digital library is 2 hours from 4:00PM to 6:00PM");
    
}  
    void QuestionPaper(){
	String department=null,year=null;
	if (sSection==department)
		System.out.println("question paper set1");
	else if(sSection==year)
		System.out.println("question paper set 2");
	
}
}