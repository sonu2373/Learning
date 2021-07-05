
public class Hello {

	void text1()
	{
	int a=10,b=0,c;
	try
	{
	c=a/b;
	System.out.print(c);
	}
	catch(ArithmeticException ae)
	{
		System.out.print("HELLO");
	}

	}
	public static void main(String[] args) {
		Hello ob=new Hello();
		ob.text1();
	}
}

