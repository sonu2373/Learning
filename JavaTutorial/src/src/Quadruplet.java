package src;

public class Quadruplet {
	    /* Function to find a maximum product of a  
	    quadruple in array of integers of size n */
	    static int maxProduct(int arr[], int n)  
	    { 
	        // if size is less than 4, no quadruple exists 
	        if (n < 4) { 
	            System.out.println();
	        } 
	          
	        // Initialize Maximum, second maximum, third 
	        // maximum and fourth maximum element 
	        int maxA = Integer.MIN_VALUE,  
	            maxB = Integer.MIN_VALUE, 
	            maxC = Integer.MIN_VALUE,  
	            maxD = Integer.MIN_VALUE; 
	  
	        // Initialize Minimum, second minimum, third 
	        // minimum and fourth minimum element 
	        int minA = Integer.MAX_VALUE,  
	            minB = Integer.MAX_VALUE, 
	            minC = Integer.MAX_VALUE,  
	            minD = Integer.MAX_VALUE; 
	  
	        for (int i = 0; i < n; i++)  
	        { 
	  
	            // Update Maximum, second maximum, third 
	            // maximum and fourth maximum element 
	            if (arr[i] > maxA) { 
	                maxD = maxC; 
	                maxC = maxB; 
	                maxB = maxA; 
	                maxA = arr[i]; 
	            }  
	              
	            // Update second maximum, third maximum 
	            // and fourth maximum element 
	            else if (arr[i] > maxB) { 
	                maxD = maxC; 
	                maxC = maxB; 
	                maxB = arr[i]; 
	            }  
	              
	            // Update third maximum and 
	            // fourth maximum element 
	            else if (arr[i] > maxC) { 
	                maxD = maxC; 
	                maxC = arr[i]; 
	            }  
	              
	            // Update fourth maximum element 
	            else if (arr[i] > maxD) { 
	                maxD = arr[i]; 
	            } 
	  
	            // Update Minimum, second minimum 
	            // third minimum and fourth minimum element 
	            if (arr[i] < minA) { 
	                minD = minC; 
	                minC = minB; 
	                minB = minA; 
	                minA = arr[i]; 
	            }  
	              
	            // Update second minimum, third 
	            // minimum and fourth minimum element 
	            else if (arr[i] < minB) { 
	                minD = minC; 
	                minC = minB; 
	                minB = arr[i]; 
	            }  
	              
	            // Update third minimum and 
	            // fourth minimum element 
	            else if (arr[i] < minC) { 
	                minD = minC; 
	                minC = arr[i]; 
	            }  
	              
	            // Update fourth minimum element 
	            else if (arr[i] < minD) { 
	                minD = arr[i]; 
	            } 
	        } 
	  
	        int x = maxA * maxB * maxC * maxD; 
	        int y = minA * minB * minC * minD; 
	        int z = minA * minB * maxA * maxB; 
	          
	        // Return the maximum of x, y and z 
	        return Math.max(x, Math.max(y, z)); 
	    } 
	  
	    // Driver Code 
	    public static void main(String[] args)  
	    { 
	        int arr[] = { 1, -4, 3, -6, 7, 0 }; 
	        int n = arr.length; 
	        int max = maxProduct(arr, n); 
	        if (max == -1) 
	            System.out.println("No Quadruple Exists"); 
	        else
	            System.out.println("Maximum product is " + max); 
	    } 
	} 

