package Sorting;

public class MergeSort {
	
	int[] array;
	int[] tempMergeArr;
	int length;
	public void sort(int input[])
	{
		this.array=input;
		this.length=input.length;
		this.tempMergeArr=new int[length];
		divideArray(0,length-1);
	}
	
	public void divideArray(int low,int high) {
		if(low<high)
		{
			int mid=low+(high-low)/2;
		
			//It will sort the left side of array
			divideArray(low,mid+1);
			
			//It will sort the right side of array
			divideArray(mid+1,high);
			
			mergeArray(low,mid,high);
		
		}
		
	}
	
	public void mergeArray(int low,int mid,int high)
	{
		for(int i=low;i<high;i++)
		{
			tempMergeArr[i]=array[i];
		}
		
		int i=low;
		int j=mid+1;
		int k=low;
		while(i<mid && j<high)
		{
			if(tempMergeArr[i]<=tempMergeArr[j])
			{
				array[k]=tempMergeArr[i];
				i++;
			}
			else
			{
				array[k]=tempMergeArr[j];
				j++;
			}
			k++;
		}
	}
	
	
	public static void main(String[] args) {
		int [] inputarr= {48,36,13,52,19,94,21};
		MergeSort ms=new MergeSort();
		ms.sort(inputarr);
	}

}
