1. Print 1 To N Without Loop 

Print numbers from 1 to N without the help of loops.

Example 1:

Input:
N = 10
Output: 1 2 3 4 5 6 7 8 9 10


class Solution
{
    
  public void printNos(int N)
    {
        //Your code here
        fn(N);
    }
    void fn(int n)
    {
        if(n==0)
        return;
        fn(n-1);
        System.out.print(n+" ");
    }
}

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N) (Recursive).
