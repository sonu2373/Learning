package Book;

public class Array_1 {

	public static void swap(int[] a,int i,int j)
	{
		int ai=a[i],aj=a[j];
		if(a[i]==a[j])return;
		a[i]=a[j];
		a[j]=ai;
	}
			
	static int search(int[] a,int n)
	{
		int p=0,q=a.length-1;
		while(p<=q)
		{
			int i=(p+q)/2;
			System.out.println("i= "+i);
			if(a[i]==n) return i;
			if(a[i]<n)
				p=i+1;
			else
				q=i-1;
			System.out.println("p= "+p+" q="+q);
		}
		System.out.println("OUTER"+"  p="+p+" q="+q);
		return p;
	}
			public static void main(String[] args)
			{
				/*
				int[] arr= {2, 3, 5, 7, 11, 13, 17};

				for(int j:arr)
					System.out.print(j+"  ");
				System.out.print("\n");
				
				swap(arr,2,5);
				for(int i:arr)
					System.out.print(i+"  ");
				
				String s="Mercury";
				Float x= (float)1.12;
				int a[]= {1,23,4,5};
				Object[] obj= {s,x,a};
				System.out.print(((int [])obj[2])[0]);
				*/
				int[] a= {22,33,44,55,66,77,88,99};
				System.out.print(search(a,50));
				
						java.util.Arrays.parallelSort(a);
			}

		

	}


