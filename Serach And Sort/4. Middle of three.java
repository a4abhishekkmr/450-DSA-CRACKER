Middle of Three 

Given three distinct numbers A, B and C. Find the number with value in middle (Try to do it with minimum comparisons).


Example 1:

Input:
A = 978, B = 518, C = 300
Output:
518
Explanation:
Since 518>300 and 518<978, so 
518 is the middle element.


class Solution{
    int middle(int A, int B, int C){
        //code here
        int x,n;
        //the concept is
        //Sum of three -max -min =middle
        
        x=Math.max((Math.max(A,B)),C);
        n=Math.min((Math.min(A,B)),C);
        return (A+B+C)-x-n;
    }
}