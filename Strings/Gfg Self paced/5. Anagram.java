Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, “act” and “tac” are an anagram of each other.

Example 1:

Input:
a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have same
characters with same frequency. So, 
both are anagrams.
  




class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        if(a.length()!=b.length())
        return false;
        
        int count[]=new int[256];
        
        for(int i=0;i<a.length();i++)
        {
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }
        
        //now check time for 0
        for(int i=0;i<256;i++)
        {
            if(count[i]!=0)
            return false;
        }
        return true;
    }
}
//TC=O(n) where n is length of any string(equal both) and space is O(256).
