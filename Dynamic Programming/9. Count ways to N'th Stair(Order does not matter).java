There are N stairs, and a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top (order does not matter).
Note: Order does not matter means for n=4 {1 2 1},{2 1 1},{1 1 2} are considered same.

Example 1:

Input:
N = 4
Output: 3
Explanation: You can reach 4th stair in
3 ways.
3 possible ways are:
1, 1, 1, 1
1, 1, 2
2, 2





class Solution
{
    //Function to count number of ways to reach the nth stair 
    //when order does not matter.
  //this means 1 2 1 cannot be used as 2 1 1 not 1 1 2
    Long countWays(int m)
    {
        // your code here
        return (long)1+m/2;
    }    
}
