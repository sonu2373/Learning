package Sorting;

public class QuickSort {
	
	int partition(int[] arr,int low,int high)
	{
		int pivot=arr[(low+high)/2];
		while(low<=high)
		{
			if(arr[low]<pivot)
				low++;
			if(arr[high]>pivot)
				high--;
			if(low<=high)
			{
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;	
				low++;
				high--;
			}
		}
		return low;
	}
	
	void quicksortrecur(int arr[],int low,int high)
	{
		int pi=partition(arr,low,high);
		if(low<pi-1)
		{
			quicksortrecur(arr,low,pi-1);
		}
		if(pi<high)
			quicksortrecur(arr,pi,high);		
	}
	
	
public static void main(String args[])
{
	int[] arr= {15,9,7,13,12,16,4,18,11};
	int len=arr.length;
	QuickSort qsm=new QuickSort();
	qsm.quicksortrecur(arr,0,len-1);
	for(int i:arr)
		System.out.println(i);
	
}


}

