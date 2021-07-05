Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.

Example 1:

Input:
N = 5
Output: 1 1 2 3 5
Example 2:

Input:
N = 7
Output: 1 1 2 3 5 8 13
  
  
  class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int number) 
    {
        //Your code here
        long f[]=new long[number];
        //preset
        if(number==0) return f;
        f[0]=1;
        if(number==1) return f;
        f[1]=1;
        if(number==2) return f;
        for(int i=2;i<number;i++)
        f[i]=f[i-1]+f[i-2];
        
        return f;
    }
}
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
