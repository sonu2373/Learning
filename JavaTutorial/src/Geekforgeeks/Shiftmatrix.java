package Geekforgeeks;
import java.io.*; 
import java.util.*;

public class Shiftmatrix {

	public static void main(String[] args) {

		       Scanner sc=new Scanner(System.in);
		       int n=sc.nextInt();
		       int shift=sc.nextInt();
		       int k=0,m=0;
		       int arr[][]=new int[n][n];
		       int temp1[][]=new int[n][n];
		       int temp2[][]=new int[n][n];
		       
		       for(int i=0;i<n;i++)
		       {
		           for(int j=0;j<n;j++)
		           {
		               arr[i][j]=sc.nextInt();
		           }
		       }
		       
		       int temp=n;
		       
		       for(int i=shift;i<temp;i++)
		       {
		    	   int l=0;
		    	   for(int j=0;j<n;j++)
		    	   {
		    		   
		    			   temp1[l][k]=arr[j][i];
		    			   l++;		    		   		    		 		    		   
		    	   }
		    	   
		    	   
		    	   if(i==n-1)
	    		   {
	    			   
	    			   i=-1;
	    			   temp=shift;
	    			   
	    		   }
		    	   k++;
		       }
		       
		       
		       
		       
		     
		      
		       for(int i=0;i<n;i++)
		       {
		           for(int j=0;j<n;j++)
		           {
		        	  if(shift!=n)
		              System.out.print(temp1[i][j]+" ");
		        	  else
		        		  
		        		  System.out.print(arr[i][j]+" ");
		        
		           }
		           System.out.println();
		       }
		       
		       
		       sc.close();
		   } 		
	
	}


