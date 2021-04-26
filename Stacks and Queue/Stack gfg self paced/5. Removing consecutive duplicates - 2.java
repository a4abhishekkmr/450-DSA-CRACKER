You are given string str. You need to remove the pair of duplicates.
Note: The pair should be of adjacent elements and after removing a pair the remaining string is joined together. 

Example 1:

Input:
aaabbaaccd

Output: 
ad

Explanation: 
Remove (aa)abbaaccd =>abbaaccd
Remove a(bb)aaccd => aaaccd
Remove (aa)accd => accd
Remove a(cc)d => ad



class Solution
{
    //Function to remove pair of duplicates from given string using Stack.
    public static String removePair(String str)
    {
        // your code here
        String ans1="";
        Stack<Character> s = new Stack<Character> ();
        Stack<Character> ans = new Stack<Character> ();
        int n=str.length();
        s.push(str.charAt(0));
        for(int i=1;i<n;i++)
        {
            if(!s.isEmpty() && str.charAt(i)==s.peek())
            {s.pop();
            }
            else
            s.push(str.charAt(i));
        }
        
        
        while(!s.isEmpty())
        ans.push(s.pop());
        
        while(!ans.isEmpty())
        ans1+=ans.pop();
        
        return ans1;
    }
}
// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(N).