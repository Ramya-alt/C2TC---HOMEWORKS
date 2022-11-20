package c2tc;
public class Account{
	
	int AccNo;
	String AccName;
	String BranchName;
	float Amount;
	
	//initialise data members
	public void insertdata(int A,String Name,String Bname,float Amt)
	{
		
		AccNo=A;
		AccName=Name;
		BranchName=Bname;
		Amount=Amt;
	}
	
	
	//deposit money
	public void deposit(float Amt)
	{
		Amount=Amount+Amt;
	}
	
	//display balance
	public void display()
	{
		System.out.println(AccName+ " " +Amount);
	}


	public static void main(String[] args) {
		
		Account obj1=new Account();
		obj1.insertdata(100070, "Ramya","Chennai", 50000);
		Account obj2=new Account();
		obj2.deposit(5000);
		
		obj1.display();
		obj2.display();
	}	
}
