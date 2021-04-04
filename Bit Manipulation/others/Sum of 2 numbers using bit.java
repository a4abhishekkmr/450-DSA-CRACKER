Sum of two numbers without using arithmetic operators 

Given two integers a and b. Find the sum of two numbers without using arithmetic operators.

Example 1:

Input:
a = 5, b = 3
Output: 8
Explanation :
5 + 3 = 8


class Solution
{
    int sum(int x , int y)
{
    if (y == 0)
        return x;
    else
        return sum( x ^ y, (x & y) << 1);
}
}

// Logic:
// 1. XOR is used to add two number without carry
// 2. AND then and left shift to perform carry without any further addition
// 3. Recurse until nothin to carry

Expected Time Complexity : O(max(number of bits in 'a', number of bits in 'b'))
Expected Auxiliary Space : O(1)