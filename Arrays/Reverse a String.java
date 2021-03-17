Reverse a String 

You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG
Example 2:

Input:
s = for
Output: rof

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).

Solution>>

class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        String h="";
        // Reverse the string str
        char c[]=str.toCharArray();
        for(int i=c.length-1;i>=0;i--)
        {
            h+=c[i];
        }
        return h;
        
    }
}