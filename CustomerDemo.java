package in.ac.kletech.Customer;

public class CustomerDemo {

	public static void main(String[] args) {
	
     Customer cust[] =new PrivilagedCustomer[5];
     
				
				
	    cust[0]=new  PrivilagedCustomer(11,"ash",8184042733l,6000);
		cust[0].computeBillAmt();
		cust[1]=new  PrivilagedCustomer(111,"sha",8184048737l,5000);
		cust[1].computeBillAmt();
		cust[2]=new  PrivilagedCustomer(222,"sappi",9948404873l,4000);
		cust[2].computeBillAmt();
		 cust[3]=new  PrivilagedCustomer(333,"poo",9764042733l,10000);
			cust[3].computeBillAmt();
			 cust[4]=new  PrivilagedCustomer(444,"tina",9684042733l,3000);
				cust[4].computeBillAmt();

	}

}
