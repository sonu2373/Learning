package TestPackage;

public class Factorial {
	
	static int factorial(int n)
	{
		if(n==0||n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(Math.pow(5, 2));
		
	}

}
