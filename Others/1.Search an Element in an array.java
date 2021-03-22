Search an Element in an array 

Given an integer array and another integer element. The task is to find if the given element is present in array or not.

Example 1:

Input:
n = 4
arr[] = {1,2,3,4}
x = 3
Output: 2
Explanation: There is one test case 
with array as {1, 2, 3 4} and element 
to be searched as 3.  Since 3 is 
present at index 2, output is 2.

Solution>>
class Solution{
        
    static int search(int arr[], int N, int X)
    {
        
        // Your code here
        int flag=0;
        int j=0;
        for(int i=0;i<N;i++){
            j++;
            if(arr[i]==X)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        return j-1;
        else
        return -1;
        
    }
    
}

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1). 

