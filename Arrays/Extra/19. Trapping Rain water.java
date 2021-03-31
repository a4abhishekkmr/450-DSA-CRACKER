19. Trapping Rain Water 

Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 
 

Example 1:

Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10

class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trappingWater(int arr[], int n) { 
        
        int res=0;
        int[] lmax=new int[n];
        int[] rmax=new int[n];
        //these are the local heights of right and left for index i;
        
        lmax[0]=arr[0];
        for(int i=1;i<n;i++)
        lmax[i]=Math.max(arr[i],lmax[i-1]);
        
        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)//from second last to first we will move
        rmax[i]=Math.max(arr[i],rmax[i+1]);
        
        for(int i=n-2;i>=0;i--)
        rmax[i]=Math.max(arr[i],rmax[i+1]);
        
        for(int i=1;i<n-1;i++)
        res=res+(Math.min(lmax[i],rmax[i])-arr[i]);
        
        return res;
    } 
}
Time complexity-O(n+n+n)=O(n)
Aux space=O(n+n)=> O(n);