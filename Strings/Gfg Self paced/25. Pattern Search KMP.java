Given a string S and a pattern P of all lowercase characters. The task is to check if the pattern exists in the string or not.

Example 1:

Input:
S = aabaacaadaabaaba
P = aaaab
Output: No
Explanation: Given pattern is not found
in the given string S.
  
  
  
  
//User function Template for Java


class match
{
    //Function to fill lps[] for given patttern pat[0..M-1]. 
    void computeLPSArray(String pat, int M, int lps[]) 
    { 
	    // Your code here
	    int n=M;
	    int len=0;
	    lps[0]=0;
	    int i=1;
	    while(i<n)
	    {
	        if(pat.charAt(i)==pat.charAt(len))
	        {
	            len++;
	            lps[i]=len;
	            i++;
	        }
	        else
	        {
	            if(len==0){lps[i]=0;i++;}
	            else{len=lps[len-1];}
	        }
	    }
    }//O(2n) worst so O(n)
    
    //Function to check if the pattern exists in the string or not.
    boolean KMPSearch(String pat, String txt)
    {
        // Your code here
        int n=txt.length();
        int m=pat.length();
        int lps[]=new int[m];
        computeLPSArray(pat,m,lps);
        int i=0,j=0;
        while(i<n)
        {
            if(pat.charAt(j)==txt.charAt(i))
            {i++;j++;}
            if(j==m)
            {
                //j=lps[j-1];for multipe ans
                return true;
            }
            else if(i<n && pat.charAt(j)!=txt.charAt(i))
            {
                if(j==0) {i++;}
                else {j=lps[j-1];}
            }
        }return false;
        //O(n) for this but calling that computeLPSArray makes it costly to O(n^2)
    }
}
