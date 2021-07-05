package TestPackage;

public class Class_1 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c2 = int.class; 
        Class c3 = void.class; 
		//System.out.print(c2.toString());
		
		int i=1;
		String str="hello";
		
		//Class ob=Class.forName("java.lang.String");
		//ob=(Class)str;
		//System.out.print(ob.isInstance(i));
		
		Character c4='a';
		Character c5=new Character('b');
		if(c4.equals(c5))
			System.out.print("heelo");
		else
			System.out.print("hi");
		
		

		
	}

}
