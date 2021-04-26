You are given string str. You need to remove the consecutive duplicates from the given string using a Stack.
 

Example 1:

Input: 
aaaaaabaabccccccc

Output: 
ababc

Explanation: 
Removing all consecutive duplicates, 
we have no duplicates consecutively.


class Solution
{
    //Function to remove consecutive duplicates from given string using Stack.
    public static String removeConsecutiveDuplicates(String str)
    {
        // Your code here
        String ans="";
        Stack<Character> s = new Stack<Character> ();
        int n=str.length();
        //s.push(str.charAt(0));
        for(int i=0;i<n-1;i++)
        {
            if(str.charAt(i)!=str.charAt(i+1))
            {s.push(str.charAt(i));
            ans=ans+str.charAt(i);}
        }
        s.push(str.charAt(n-1));
         ans=ans+str.charAt(n-1);
         
        return ans;
    }
    
//time comp is O(n) ans aux spaace is O(n)
}