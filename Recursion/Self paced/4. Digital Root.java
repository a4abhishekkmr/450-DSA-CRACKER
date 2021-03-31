4. Digital Root 

You are given a number n. You need to find the digital root of n. DigitalRoot of a number is the recursive sum of its digits until we get a single digit number.

Example 1:

Input:
n = 1
Output:  1
Explanation: Digital root of 1 is 1
Example 2:

Input:
n = 99999
Output: 9
Explanation: Sum of digits of 99999 is 45
which is not a single digit number, hence
sum of digit of 45 is 9 which is a single
digit number.

class Solution
{
    // complete the function
    public static int digitalRoot(int n)
    {
        // add your code here
        
        if(n<=9)
        return n;
        //use concept of sum and count of n.
        
        return digitalRoot(n%10 + n/10);
    }
}
 TC=O(log n)
AUX SPACE  = O(log n) recursive 