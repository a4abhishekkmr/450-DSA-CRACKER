Search in a Rotated Array 

Given a sorted and rotated array A of N distinct elements which is rotated at some point, and given an element key. The task is to find the index of the given element key in the array A.

Example 1:

Input:
N = 9
A[] = {5 ,6 ,7 ,8 ,9 ,10 ,1 ,2 ,3}
key = 10
Output:
5
Explanation: 10 is found at index 5.

class Solution
{
    int search(int arr[], int low, int high, int target)
    {
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            
            if(arr[mid]==target) return mid;
            
            //till here binary search
            //now needed left half sorted;
            if(arr[low]<=arr[mid])
            {
                if(target>=arr[low] && target<arr[mid])
                    high=mid-1;
                
                else
                    low=mid+1;
            }
            //now need to check right half sorted
            else
            {
                if(target>arr[mid]&& target<=arr[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }return -1;    
}
}// Expected Time Complexity: O(log N).
// Expected Auxiliary Space: O(1).