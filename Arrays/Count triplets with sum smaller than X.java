Count triplets with sum smaller than X 

Given an array arr[] of distinct integers of size N and a sum value X, the task is to find count of triplets with the sum smaller than the given sum value X.

 

Example 1:

Input: N = 6, X = 2
arr[] = {-2, 0, 1, 3}
Output:  2
Explanation: Below are triplets with 
sum less than 2 (-2, 0, 1) and (-2, 0, 3). 
//solve it and check.



class Solution
{
    long countTriplets(long arr[], int n,int X)
    {
    Arrays.sort(arr);
    
    int low=0,high=0;
    long ans =0;
    
    for(int i=0;i<n-2;i++)
    {
    low=i+1;
    high=n-1;
    while(low<high)
    {
//  if(arr[i]+arr[low]+arr[high]<X)
//         {count++;low++;}
        
        if(arr[i]+arr[low]+arr[high]>=X)//else
        high--;
        
        else
        {
            ans+=(high-low);
            low++;
        }
    }
    }
    return ans;
    }

    }
//O(n^2) and O(1).
//  Hint 1
//  Full Solution
// 1) Sort the input array in increasing order.
// 2) Initialize result as 0.
// 3) Run a loop from i = 0 to n-2.  An iteration of this loop finds all
//   triplets with arr[i] as first element.
//      a) Initialize other two elements as corner elements of subarray
//         arr[i+1..n-1], i.e., j = i+1 and k = n-1
//      b) Move j and k toward each other until they meet, i.e., while (j = sum), then do k--

//             // Else for current i and j, there can (k-j) possible third elements
//             // that satisfy the constraint.
//             (ii) Else Do ans += (k - j) followed by j++ 
