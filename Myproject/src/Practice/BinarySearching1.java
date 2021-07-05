package Practice;

//Search an element in one pass of Binary Search

//O(log n)

public class BinarySearching1 {

	static int search(int arr[],int l,int h,int key)
	{
		if(l>h)
			return -1;
		
		int mid=(l+h)/2;
		System.out.println("mid= "+mid+"   value="+arr[mid ]);
		
		if(arr[mid]==key)
		{
			return mid;
		}
		
		//if first half is sorted
		
		if(arr[l]<=arr[mid])
		{
			if(key>=arr[l] && key<=arr[mid])
			{
				return search(arr,l,mid-1,key);
			}
			
			return search(arr,mid+1,h,key);
		}
		
		//If first half is not sorted
		if(key>=arr[mid+1] &&key<=arr[h])
		{
			return search(arr,mid+1,h,key);
		}
		return search(arr,l,mid-1,key);
		
	}
	
	public static void main(String args[]) 
    { 
        int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3}; 
        int n = arr.length; 
        int key = 2; 
        int i = search(arr, 0, n-1, key); 
        if (i != -1)  
            System.out.println("Index: " + i); 
        else
            System.out.println("Key not found"); 
    } 
}
