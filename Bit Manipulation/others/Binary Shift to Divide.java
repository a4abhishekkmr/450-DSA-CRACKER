Binary Shift to Divide 

A number N is given. Divide it in half by using the binary shift operator.
Use the floor value if the result is in decimal. If the number is 1, leave it as it is.


Example 1:

Input: N = 1
Output: 1

Example 2:

Input: N = 37
Output: 18
Explaination: 37/2 = 18.5 which is in 
decimal form and whose floor value is 18.


class Solution{
    static int half(int N){
        // code here
        if(N==1) return 1;
        else
        return N>>1;
    }
}
TC=O(1)
SC=O(1)
