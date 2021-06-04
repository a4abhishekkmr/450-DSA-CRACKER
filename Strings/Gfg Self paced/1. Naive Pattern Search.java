Given a string S and a pattern P both of lowercase characters. The task is to check if the given pattern exists in the given string or not.

Example 1:

Input:
S = aabaacaadaabaaabaa
P = aaba
Output: Yes
Explanation: Given pattern aaba is found
in the string at index 0.
  
  
  
class Solution
{
    //Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt)
    {
            // Your code here
            int m=pat.length();
            int n=txt.length();
            for(int i=0;i<=n-m;i++)
            {
                int j;
                for(j=0;j<m;j++)
                if(pat.charAt(j)!=txt.charAt(i+j))
                break;
                
                if(j==m) return true;
            }
            return false;
    }
    
}
//TC=O(n-m+1)*m
//SC=O(1)
