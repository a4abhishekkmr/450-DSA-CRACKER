Power Set 

Given a string S find all possible substrings of the string in lexicographically-sorted order.

Example 1:
For Input:
abc
your output is: 
a ab abc ac b bc c 

Algorithm:

Input: Set[], set_size
1. Get the size of power set
    powet_set_size = pow(2, set_size)
2  Loop for counter from 0 to pow_set_size
     (a) Loop for i = 0 to set_size
          (i) If ith bit in counter is set
               Print ith element from set for this subset
     (b) Print separator for subsets i.e., newline
Example:

Set  = [a,b,c]
power_set_size = pow(2, 3) = 8
Run for binary counter = 000 to 111

Value of Counter            Subset
    000                    -> Empty set
    001                    -> a
    010                    -> b
    011                    -> ab
    100                    -> c
    101                    -> ac
    110                    -> bc
    111                    -> abc

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
       
        
         List<String> a = new ArrayList<>();
         
        int l=s.length();
      
        int size=(int)Math.pow(2,l);
        
        for(int i=1;i<size;i++)
        {
            StringBuilder x= new StringBuilder();
            for(int j=0;j<l;j++)
            {
                if( (i & (1<<j)) > 0)
                {
                    x.append(s.charAt(j));
                }
            }a.add(x.toString());
        }
        Collections.sort(a);
        return a;
    }
}

