package Geekforgeeks;
import java.util.*; 

public class Mithun { 
	public static void main(String[] arg) 
	{ 
		int n=10;
		// Creating object of ArrayList<Integer> 
		List<Integer> list = new ArrayList<Integer>(); 

		// Populating List 
		list.add(1); 
		list.add(5); 
		list.add(10); 
		list.add(5); 
//		list.add(5); 

		// print List 
		System.out.println("Before operation: "
						+ list); 

		// getting total size of list 
		// using size() method 
		int size = list.size(); 

		// print the size of list 
		System.out.println("Size of list = "
						+ size);
		
		Map< Integer,Integer> hm =  new HashMap< Integer,Integer>(); 
		for(int i=1;i<n+1;i++)
		{
			hm.put(i,0); 
		}
		
		
		for(int j=0;j<size;j++)
		{
			int p=list.get(j);
			for(int k=p-1;k<n+p-1;k++)
			{	
				System.out.println("k="+k);
				System.out.println("k%n= "+((k%n)+1)+"  j+1="+list.get(j+1));
				
				if((k%n)+1!=list.get(j+1))
				{
					System.out.println("conatinskey= "+ hm.containsKey((k%n)+1));
					
				if(hm.containsKey((k%n)+1))
				{
					hm.put((k%n)+1,hm.get((k%n)+1)+1);
					
					System.out.println("update key= "+((k%n)+1) +"Value="+hm.get((k%n)+1));
				}}
				else
				{
					
					hm.put((k%n)+1,hm.get((k%n)+1)+1);
					System.out.println("update key= "+((k%n)+1) +"Value="+hm.get((k%n)+1));
					break;
				}
				
				//if((k%n)+1>list.get(j+1))
					//break;
			}
			System.out.println("Next");
			if(j==(size-2))
				break;
		
		}
		
		
		Set< Map.Entry< Integer,Integer> > st = hm.entrySet();    
		  
	       for (Map.Entry< Integer,Integer> me:st) 
	       { 
	           System.out.print(me.getKey()+":"); 
	           System.out.println(me.getValue()); 
	       } 
	       
	       Map.Entry<Integer, Integer> maxEntry = null;
	       for (Map.Entry<Integer, Integer> entry : hm.entrySet())
	       {
	           if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
	           {
	               maxEntry = entry;
	              
	           }
	       }
	       
	       System.out.print(maxEntry.getKey()+":"); 
           System.out.println(maxEntry.getValue()); 
	}
} 
