package Practice;

public class count_of_Pairs_in_sortedarray_equal_to_sum {

	static int countPairs(int arr[],int n,int key)
	{
		int i;
		for(i=0;i<n-1;i++)
			if(arr[i]>arr[i+1])
				break;
		
		int l=(i+1)%n;
		
		int r=i;
		
		//System.out.println("l= "+l+"  r= "+r);
		int cnt=0;
		
		while(l!=r)
		{
			System.out.println("l= "+l+"  r= "+r);
			if(arr[l]+arr[r]==key)
			{
				cnt++;
				
				if(l==(r-1+n)%n)
					return cnt;
			
					l=(l+1)%n;
					r=(r-1+n)%n;
			}
			
			else if(arr[l]+arr[r]<key)
				l=(l+1)%n;
			else
				r=(r-1+n)%n;
			
		}
		
		return cnt;
	}
	
	
	public static void main (String[] args)  
	{ 
	    int arr[] = {11, 15, 6, 7, 9, 10}; 
	    int sum = 16; 
	    int n = arr.length; 
	  
	    System.out.println( 
	            countPairs(arr, n, sum)); 
	} 
}
