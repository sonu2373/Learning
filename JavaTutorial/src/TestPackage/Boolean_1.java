package TestPackage;
public class Boolean_1 {
	
	public static void main(String args[])
	{
		
	boolean b1 = Boolean.parseBoolean("True"); 
    boolean b2 = Boolean.parseBoolean("TruE"); 
    boolean b3 = Boolean.parseBoolean("False"); 
    boolean b4 = Boolean.parseBoolean("FALSE"); 
    boolean b5 = Boolean.parseBoolean("GeeksForGeeks");
    
    Boolean b6=new Boolean("True");
    Boolean b8=new Boolean("False");
    //boolean b7=b6.booleanValue(); 
    
    boolean b=true;
    Boolean ob=Boolean.valueOf(b1);
    
    String str="true";
    String c=Boolean.toString(b);
      
    System.out.println(b8.compareTo(b6));
    
    
   /* System.out.println(b2); 
    * 
    
    System.out.println(b3); 
    System.out.println(b4); 
    System.out.println(b5); */
}}
