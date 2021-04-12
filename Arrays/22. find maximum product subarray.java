Maximum Product Subarray 

Given an array Arr that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

Example 1:

Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is  6, -3, -10 which gives product as 180.



class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        //here we have to deal with both Positive and negative products so take care of that
        //similar to kadane but here we used max and min as if one element is min then if
        //it is sum then the negative term wont impact is so much but here even a single negative
        //makes it maximum of negative and so for dealing that we have to take a temporary negative max
        //aslo as a max that help me to solve further.
        //time comp is O(n) and space is O(1)
        long max=arr[0];
        long min=arr[0];
        long res=arr[0];
        
        for(int i=1;i<n;i++)
        {
            //check if element comes is negative. then
            if(arr[i]<0)
            //then swap the min and max
            {
                long temp=min;
                min=max;
                max=temp;
            }
            //max stores the positve max and min stores the maximum with negative i.e minimum.
            max=Math.max(max*arr[i],arr[i]);
            min=Math.min(min*arr[i],arr[i]);
            
            res=Math.max(max,res);
        }  
        return res;
    }
}
