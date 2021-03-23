Edit Distance 
Medium Accuracy: 49.98% Submissions: 12097 Points: 4
Given two strings s and t. Find the minimum number of operations that need to be performed on str1 to convert it to str2. The possible operations are:

Insert
Remove
Replace
 

Example 1:

Input: 
s = "geek", t = "gesek"
Output: 1
Explanation: One operation is required inserting 's' between two 'e's of str1.

Solution>>
class Solution {
    public int editDistance(String s, String t) {
        // Code here
        int m=s.length();
        int n=t.length();
        int dp[][] = new int[m+1][n+1];
        //initializing a 2d array
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                //initializing first row
                if(i==0)
                dp[i][j]=j;
                
                //now first column
                else if(j==0)
                dp[i][j]=i;
                
                //for checking elements to be same
                else if(s.charAt(i-1)==t.charAt(j-1))
                dp[i][j]=dp[i-1][j-1];
                
                //if not same then min of three conditions +1
                else{//top=delete//left=insert//diagonal=replace
                dp[i][j]=1+ Math.min(dp[i][j-1],Math.min(dp[i-1][j], dp[i-1][j-1]));  
                }
            }
        }return dp[m][n];
    }
}

time complexity-O(n*m);
space complexity-O(n*m);