package c2tc;

public class LMS {
	string name;
	int phoneNumber;
	int institute_id;
	string bookName;
	string authorName;
public void login(string n,int ph,int id)
{
	name=n;
	phoneNumber=ph;
	institute_id=id;
	System.out.println('The login is succesfull + ' name)
}
public void searchBook(string bn,string an)
{
	bookName=bn;
	authorName=an;
	system.out.pintln('The book is found')
}
}
public class check extends LMS
{

	public static void main(String[] args) {
		LMS.student=new LMS;
		LMS.staff=new LMS;
		LMS.librarian=new LMS;
		student.login(Ramya,8899776655,012413);
		staff.login(Nayna,9988776655,123456);
		librarian.login(Aarthi,7788996655,098765)
		student.searchBook(Ant,Jagan);
		staff.searchBook(Juli in wonderland,Pushpa);
	}

}
