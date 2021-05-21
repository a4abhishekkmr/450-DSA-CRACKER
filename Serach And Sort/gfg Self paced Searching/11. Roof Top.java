
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
