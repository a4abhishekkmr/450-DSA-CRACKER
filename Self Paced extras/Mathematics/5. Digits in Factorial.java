5. Digits In Factorial 

Given an integer N. Find the number of digits that appear in its factorial. 
Factorial is defined as, factorial(n) = 1*2*3*4……..*N and factorial(0) = 1.
 

Example 1:

Input: N = 5
Output: 3
Explanation: Factorial of 5 is 120.
Number of digits in 120 is 3 (1, 2, and 0)

class Solution{
    public int digitsInFactorial(int n){
        // code here

double a=0;double temp=0;
for(int i=1;i<=n;i++)
{
    temp=Math.log10(i);//directly gives Digits In Factorial 
    a=a+temp;
}
int res=(int)a;
        return res+1;
    }
}
Time Complexity : O(N)
Auxilliary Space : O(1)
