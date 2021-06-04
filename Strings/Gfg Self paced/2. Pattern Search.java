Given a string S and a pattern P consisting of lowercase characters. The task is to check if pattern P exists in the given string S or not.
 

Example 1:

Input:
S = abceabcdabceabcd
P = abcd
Output: Yes
Explanation: Given pattern abcd is
present at index 4.
  
  
  


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
                
                else
                i=(i+j);
            }
            return false;
    }
}
// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(1).
