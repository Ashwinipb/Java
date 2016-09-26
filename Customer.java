package in.ac.kletech.Customer;

abstract class Customer {
	int iCustID;
	String sCustName;
	long lPhoneNo;
	double dBillAmt;

	Customer(int iCustID,String sCustName,long lPhoneNo,double dBillAmt)
	{
		this.iCustID=iCustID;
		this.sCustName=sCustName;
		this.lPhoneNo=lPhoneNo;
		this.dBillAmt=dBillAmt;
	}
   void printCustInfo()
   {
	   System.out.println("Customer id is:" +iCustID);
	   System.out.println("Customer name is:" +sCustName);
	   System.out.println("Phone no is:" +lPhoneNo);
	   System.out.println("bill amount is:" +dBillAmt);
   }
   void computeBillAmt()
   {
	   System.out.println("bill amount is 10000rs");
   }
}
 class RegularCustomer extends Customer{
	 double dDiscount;
	 RegularCustomer(int iCustID,String sCustName,long lPhoneNo,double dBillAmt,double dDiscount)
	 {
		 super(iCustID,sCustName,lPhoneNo,dBillAmt);
		 this.dDiscount=dDiscount;
	 }
	 void computeBillAmt()
	 {
		
		System.out.println("bill amount is:" +dBillAmt);
	 }
 }
 class PrivilagedCustomer extends Customer{
	 String sMemberCardType;
	 PrivilagedCustomer(int iCustID,String sCustName,long lPhoneNo,double dBillAmt)
	 {
		 super(iCustID,sCustName,lPhoneNo,dBillAmt);
		 this.sMemberCardType=sMemberCardType;
	 }
	 void computeBillAmt()
	 {
		 if(sMemberCardType=="gold")
			 dBillAmt=dBillAmt-(0.15*dBillAmt);
		 System.out.println("bill amount is:" +dBillAmt);
		  if(sMemberCardType=="silver")
			 dBillAmt=dBillAmt-(0.1*dBillAmt);
		 System.out.println("bill amount is:" +dBillAmt);
		 if(sMemberCardType=="bronze")
			 dBillAmt=dBillAmt-(0.05*dBillAmt);
		 System.out.println("bill amount is:" +dBillAmt);
			 
	 }
 }
