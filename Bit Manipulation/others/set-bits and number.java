Given a number N. Find the product of the number of setbits and the number itself.


Example 1:

Input: N = 2
Output: 2
Explaination: 2 has one setbit. So, 2*1 = 2.


class Solution{
    static int bitMultiply(int n){
        // coe here
        int m=n;
        int count=0;
        while(n>0)
        {
            n=(n&(n-1));
            count++;
        }
        return count*m;
    }
}

TC=Theta(set bit count).