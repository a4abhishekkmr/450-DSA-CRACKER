2. Convert Celsius To Fahrenheit 

Given a temperature in celsius C. You need to convert the given temperature to Fahrenheit.

Example 1:

Input:
C = 32
Output: 89
Explanation: Using the conversion 
formula of celsius to farhenheit , it
can be calculated that, for 32 degree
C, the temperature in Fahrenheit = 89.


class Solution
{
    public double cToF(int C)
    {
        //Your code here
        return (C*9/5)+32;
    }
}

Time Complexity: O(1)
Auxiliary Space : O(1)