class A{  
	       A get()
	       {
	    	   	return this;
	       }  
	}  

public class ObjectInputOutput extends A{
	
	ObjectInputOutput  get(){
	return this;
				}
	
	public static void main(String[] args) {
	    
		ObjectInputOutput ob=new ObjectInputOutput();
		System.out.print(ob.get());
	          
	       
	          
		

	}

}
