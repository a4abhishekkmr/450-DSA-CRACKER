BigInteger Multiply 

Given two BigIntegers X and Y. You have to multiply X and Y.

 

Example 1:

Input:
X = 3, Y = 4
Output:
12
Explanation:
Multiplication of X and Y is 12


class MathematicalOperation{
    
    static BigInteger mul(BigInteger x, BigInteger y){
    
        // Your code here
        BigInteger ans;
        
        ans=x.multiply(y);
         return ans;    
    }
    
}
//TC=O(1)
https://www.geeksforgeeks.org/biginteger-multiply-method-in-java-with-examples/