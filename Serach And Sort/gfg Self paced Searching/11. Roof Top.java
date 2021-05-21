You are given heights of consecutive buildings. You can move from the roof of a building to the roof of next adjacent building. You need to find the maximum number of consecutive steps you can put forward such that you gain an increase in altitude with each step.

Example 1:

Input:
N = 5
A[] = {1,2,2,3,2}
Output: 1
Explanation: 1, 2 or 2, 3 are the only consecutive 
buildings with increasing heights.
  
  
  
  class Solution
{
    //Function to find maximum number of consecutive steps 
    //to gain an increase in altitude with each step.
    static int maxStep(int A[], int N)
    {
        // Your code here
        int count=0,res=0;
        for(int i=0;i<N-1;i++)
        {
            if(A[i]<A[i+1])
            {count++;
                res=Math.max(count,res);
            }
            
            else
            count=0;
        }
        return res;
    }
    
}
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(1). 
