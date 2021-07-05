package Practice;

import java.util.*;

import java.lang.Object;

public class TCSNQT {
	
	public static void main(String args[])
	{
		String[] aArray=new String[5];
		String[] bArray= {"a","b","c","d","e"};
		String[] cArray=new String[] {"a","b","c","d"};
		//System.out.print(bArray[0]);
		
		int[] intArray= {1,2,3,4,5};
		String intArrayString=Arrays.toString(intArray);
		//System.out.println(intArrayString);
		
		String[] stringArray= {"a","b","c","d","e"};
		
		ArrayList<String> arrayList=new ArrayList<String>(Arrays.asList(stringArray));
		//System.out.println(arrayList);

		String[] stringArray1= {"a","b","c","d","e"};
		boolean b=Arrays.asList(stringArray1).contains("x");
		//System.out.println(b);
		
		int[] intArray1= {1,2,3,4,5};
		int[] intArray2= {6,7,8,9,0};
		//int[] combined=ArrayUtils.addAll(intArray, intArray2);
		//System.out.print(combined);
		
		String[] stringArray2= {"a","b","b","b","c","d","e"};
		Set<String> set=new HashSet<String>(Arrays.asList(stringArray2));
		//System.out.println(set);
		
		
		//GEEKFORGEEKS
		
		int[] intArray3= {1,2,3,4,5,6};
		//int[] temp=new temp[10];
		//temp=Arrays.copyOf(intArray3,10);

		//System.out.print(Arrays.binarySearch(intArray3, 4));
		//System.out.println(Arrays.compare(intArray1, intArray2));
		//System.out.println(Arrays.compareUnsigned(intArray1, intArray3));
		  //System.out.println(temp);		
		
//		HashMap<String,String> capital=new
		String str="1";
		int x=Integer.parseInt(str);
		System.out.print(x);
				
	}
	
}
