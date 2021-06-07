USed char array
Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i







class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String str)
    {
        // code here 
        int n=str.length();
        char s[]=str.toCharArray();
        fn(s,n);
        
        String res=String.valueOf(s);
        return res;
    }
        
    void fn(char s[],int n)
       { int start=0;
        for(int end=0;end<n;end++)
        {
            if(s[end]=='.')
            {reverse(s,start,end-1);
            start=end+1;}
        }
        reverse(s,start,n-1);//for the last after which no . is there
        reverse(s,0,n-1);//whole rev
    }
    void reverse(char s[], int low,int high)
    {
        while(low<=high)
        {
            char temp=s[low];
            s[low]=s[high];
            s[high]=temp;
            low++;
            high--;
        }
    }
}
TC=O(n*n)
SC=O(n)
