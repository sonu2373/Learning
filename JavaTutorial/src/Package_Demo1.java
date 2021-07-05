import static java.lang.System.*;
import java.util.*;

public class Package_Demo1 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int total=0,sum=0;
		for(int j=0;j<arr.length;j++)
		{
			for(int i=j;i<arr.length;i++)
			{
			sum+=arr[i]/arr[j];
			}
			total+=sum;
		}
			
		System.out.print(total);
		

	}

}

