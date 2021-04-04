Mrs. S is very intelligent and very curious to learn new things. She was learning few Bit-algorithms but stuck somewhere and wants your help. The task is to count the set-bits and non set-bits of an integer N. Help her doing the same.

Input:
First line consists of T testcases. Only line of every testcase consists of an integer N.

Output:
For each testcase in new line, print the count of set-bits and non set-bits separated by space.

Constraints:
1 <= T <= 100
1 <= N <=1018

Example:
Input:
2
8
7

Output:
1 3
3 0

Explanation:
Testcase 1: Binary representation of the given number 8 is: 1 0 0 0. In this representation number of set-bits and non set-bits is 1 and 3.

class GfG{
    public void count(long n){
        // your code here.
        int count1=0,count2=0;
        while(n>0){
        if((n&1)==1)
        count1++;
        else
        count2++;
        
        n=n/2;
    }
    System.out.println(count1+" "+count2);
    }
}

TC=O(logN)
SC=O(1)