package Practice;
import java.util.*;
public class ArrayBasics1 {
			
/*
	* 
	* Rotation by Recurssion
	* Method 3
	* 
			
			static void leftshift(int arr[],int d)
		     {
		  	   int n=arr.length;
		  	   reversealgorithm(arr,0,d-1);
		  	   reversealgorithm(arr,d,n-1);
		  	   reversealgorithm(arr,0,n-1);
		     }
		     
		     static void reversealgorithm(int arr[],int start,int end)
		     {
		  	   int temp;
		  	   while(start<end)
		  	   {
		  		   temp=arr[start];
		  		   arr[start]=arr[end];
		  		   arr[end]=temp;
		  		   start++;
		  		   end--;
		  	   }
		     }
		     
	//End of Method 3
		     * 
		     * 
		     * 
		     * 
			
			
//Rotation by shifting one by one

	//Method 2
					 *
					 * 
					 * 
		    
		    static void liftshift(int arr[],int d,int n)
		     {
		    	 for(int i=0;i<d;i++)    
		    	 reverseonebyone(arr,n);
		    	 
		     }
		     
		    static  void reverseonebyone(int arr[],int n)
		     {    	 
		    	 int t = arr[0],i;
		    	 for(i=0;i<n-1;i++)
		    	 {
		    		arr[i] = arr[i+1];
		    	 }
		    	 arr[i] = t;
		     }
		     
			*/
			
			    public static void main(String args[] ) throws Exception {
			    		
			    	Scanner sc=new Scanner(System.in);
			        int n;
			        System.out.println("Enter the size of Array");
			        n=sc.nextInt();
			        
			        int array[]=new int[5];
			        
			        System.out.println("Enter the elements of Array: ");
			        
			        for(int i=0;i<n;i++)
			        {
			            array[i]=sc.nextInt();
			        }

			        System.out.println("Enter the rotation value: ");
			        
			        int d=sc.nextInt();
			        
			       // liftshift(array,d,n);
			        
			        
			        sc.close();
			        
			        //Print the array
			        
			        for(int i=0;i<n;i++)
			        {
			            System.out.println(array[i]);
			        }
			        
			        
			        
			       /*	Reverse
			        * 
			        * 
			        * 

			         for(int i=n-1;i>=0;i--)
			        {
			            System.out.println(array[i]);
			        }
			        
			        *End of Reverse
			        *
			        *
			        *
			         	
			         /**	Rotation of Array
			           	          
			        		*
			        		*Method 1
			        		*
			        		*
			        	 	        	 
			        int d=sc.nextInt();
			        int flag=0;
			        for(int i=d;i<n;i++)	        	
			        {
			        	System.out.println(array[i]);
			        	if(flag==0)
			        	{
			        	if(i==n-1)
			        	{
			        		i=-1;
			        		n=d;
			        		flag=1;
			        	}
			        	}
			        }
			        
			        *End of METHOD 1
			        *
			        *
			       */
			        
			        
			    } 			      	        	      	        	


	}


