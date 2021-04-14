Given three integers  'A' denoting the first term of an arithmetic sequence , 'C' denoting the common difference of an arithmetic sequence and an integer 'B'. you need to tell whether 'B' exists in the arithmetic sequence or not.

Example 1:

Input: A = 1, B = 3, C = 2
Output: 1
Explaination: 3 is the second term of the 
sequence starting with 1 and having a common 
difference 2.


class Solution{
    static int inSequence(int A, int B, int C){
        // code here
        int ba=B-A;
        if(A==B)
        return 1;
        
        if(C!=0 && ba/C>0 && ba%C==0)
        return 1;
        
        if(C==0 && A==B)
        return 1;
        
        return 0;
    }
}
//Expected Time Complexity: O(1)
//Expected Auxiliary Space: O(1)