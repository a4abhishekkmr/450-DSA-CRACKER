Given a string S and a pattern P of lowercase characters. The task is to check if the pattern is present in string or not.

Example 1:

Input:
S = aabaacaadaabaaba
P = aaba
Output: Yes
Explanation: You can find the patter at
starting at index 12.
  
  
  
  //User function Template for Java

class match
{
    static int d= 256;
    //Function to check if the pattern is present in string or not.
    static boolean search(String pat, String txt, int q)
    {
        // Your code here
        int m=pat.length();
        int n=txt.length();
        int h=1;
        for(int i=1;i<m;i++)
        h=(h*d)%q;
        
        int p=0,t=0;
        for(int i=0;i<m;i++)
        {
            p=(p*d + pat.charAt(i))%q;//pattern
            t=(t*d + txt.charAt(i))%q;//first t
        }//of length m pat + window
        
        for(int i=0;i<=n-m;i++)
        {
            if(p==t)
            {boolean flag=true;
            for(int j=0;j<m;j++)
            if(txt.charAt(i+j)!=pat.charAt(j))
            {
                flag=false;
                break;
            }
            if(flag==true) return true;
            }
            if(i<n-m)
            {
                t=((d*(t-txt.charAt(i)*h)+txt.charAt(i+m))%q);
                if(t<0) t=t+q;
            }
        }
        return false;
    }
}

//Expected Time Complexity: O(N + M).
//Expected Auxiliary Space: O(1).
