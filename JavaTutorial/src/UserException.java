//import java.util.*;

class AgeException extends Exception
{
	String errormsg;
	public AgeException() {}
	public AgeException(String str)
	{
		errormsg=str;
	}
	public String toString()
	{
		return this.getClass()+": "+errormsg;
	}
		
}

public class UserException {
	String name;
	int age;
	UserException(String n,int a)
	{
		name=n;
		age=a;
	}
	public void createAccount() throws AgeException
	{
		if(age<18)
			throw new AgeException("Age is less than 18");
		else
			System.out.print("Account created successfully");
	}
	
	public static void main(String[] args) {
	UserException ob=new UserException("Mohit",23);
	UserException ob1=new UserException("Suresh",16);
	
	try {
		ob.createAccount();
		ob1.createAccount();
	} catch (Exception e) {
		e.printStackTrace();
	}
	

	}

}
