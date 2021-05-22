Given an array of integers. Check whether it contains a triplet that sums up to zero. 

Example 1:

Input: n = 5, arr[] = {0, -1, 2, -3, 1}
Output: true
Explanation: 0, -1 and 1 forms a triplet
with sum equal to 0.
  
  
  /*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        
        int l=0,h=0;
        for(int i=0;i<n;i++)
        {
            l=i+1;h=n-1;
            while(l<h)
            {
                if(arr[i]+arr[l]+arr[h]<0)
                l++;
                else if(arr[i]+arr[l]+arr[h]>0) 
                h--;
                else
                return true;
            }
        }
        return false;
    }
}
Expected Time Complexity: O(n2)
Expected Auxiliary Space: O(1)
// Sort the array in ascending order.
// Traverse the array from start to end.
// For every index i, create two variables l = i + 1 and r = n – 1
// Run a loop until l is less than r, if the sum of array[l], array[r] is equal to zero then print the triplet and break the loop
// If the sum is less than zero then increment value of l, by increasing value of l the sum will increase as the array is sorted, so array[l+1] > array [l]
// If the sum is greater than zero then decrement value of r, by increasing value of l the sum will decrease as the array is sorted, so array[r-1] < array [r].
