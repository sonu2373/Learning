package TestPackage;

public class Char_1 {
	public static void main(String args[])
	{
	int codepoint1 = 12;
	int codepoint2 = 1231212;

	// check the number of char values needed to represent the specified
	// character
	int result1 = Character.charCount(codepoint1);
	int result2 = Character.charCount(codepoint2);

	// print the result
	System.out.println("Codepoint " + codepoint1 + " can be respresented by "+ result1 + " char values");
	System.out.println("Codepoint " + codepoint2 + " can be respresented by " + result2 + " char values");
	
	
	CharSequence cs="This is a sentence";
	char[] arary="myname is sonu".toCharArray();
	for(int i=0;i<10;i++)
	{
		System.out.println(Character.codePointAt(arary,i));
	}
	
	int result=Character.codePointAt(arary,3,5);
	System.out.println("Result-"+result);
	
	int count=Character.codePointCount(cs,0,cs.length());
	System.out.println("Count="+count);
	
	int com=Character.compare('x', 'y');
	System.out.print(com);
	
	Character ob=new Character('z');
	Character ob1=Character.valueOf('y');
	
	int com1=ob.compareTo(ob1);
	System.out.print("Com1="+com1);
	
	
	
	
	}
}
