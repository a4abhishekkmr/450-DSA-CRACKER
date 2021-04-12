Longest consecutive subsequence 

Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
 

Example 1:

Input:
N = 7
a[] = {2,6,1,9,4,5,3}
Output:
6
Explanation:
The consecutive numbers here
are 1, 2, 3, 4, 5, 6. These 6 
numbers form the longest consecutive
subsquence.

NAive Approach-

class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int n)
	{
	    int count=1,res=0;
	   // add your code here
	   Arrays.sort(arr);
	   for(int i=0;i<n-1;i++)
	   {
	       if(arr[i]==arr[i+1])
	       continue;
	       if(arr[i+1]-arr[i]==1)
	       count++;
	       else
	       count=1;
	       res=Math.max(count,res);
	   }
	   if(res<=1)
	   return 1;
	   else
	   return res;
	}
}
Time complexity=O(nlogn)
aux space=O(1).