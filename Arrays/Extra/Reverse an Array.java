Reverse an Array 

Given an array A of size N, print the reverse of it.

Example:
Input:
1
4
1 2 3 4
Output:
4 3 2 1

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int []arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		         arr[i]=sc.nextInt();
		    }
		    reverse(arr,n);
		    
		    for(int i=0;i<n;i++)
		    {
		        System.out.print(arr[i]+" ");
		    }System.out.println();
		}
	}
	
 static void reverse(int arr[], int n)
	{
	    int low=0, high=n-1;
	    while(low<high)
	    {
	        int temp=arr[low];
	        arr[low]=arr[high];
	        arr[high]=temp;
	        low++;
	        high--;
	    }
	}
}
Time complexity of reverse=O(n/2) or O(n) and spce is O(1).