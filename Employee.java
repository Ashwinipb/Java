package in.ac.kletech.Employee;

public class Employee {
	int iEmpID;
	String sEmpName;
	float fEmpBasicSalary;
	float fAllowance;
	float fGrossSalary;
	float fTax;
	float fNetPay;
	
	Employee(int iEmpID,String sEmpName,float fEmpBasicSalary,float fAllowance){
		this.iEmpID=iEmpID;
		this.sEmpName=sEmpName;
		this.fEmpBasicSalary=fEmpBasicSalary;
		this.fAllowance=fAllowance;
		
	}
	void calNetSalary(){
		fAllowance=fEmpBasicSalary*46/100;
		fGrossSalary=fEmpBasicSalary+fAllowance;
		if(fGrossSalary<5000)
			fTax=fGrossSalary;
		else if(fGrossSalary>=5001  &&  fGrossSalary<=10000)
			fTax=fGrossSalary*10/100;
		else if(fGrossSalary>=10001  && fGrossSalary<=20000)
			fTax=fGrossSalary*20/100;
		else if(fGrossSalary>=20001)
			fTax=fGrossSalary*30/100;
		
		fNetPay=fGrossSalary+fTax;
		
		System.out.println("Employee ID=" +iEmpID);
		System.out.println("Basic salary=" +fEmpBasicSalary);
		System.out.println("Allowance=" +fAllowance);
		System.out.println("Gross Salary=" +fGrossSalary);
		System.out.println("income tax=" +fTax);
		System.out.println("Net Salary=" +fNetPay);

	}

}
