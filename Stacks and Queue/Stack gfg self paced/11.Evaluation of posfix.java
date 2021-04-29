11. Evaluation of Postfix Expression 
Easy Accuracy: 53.28% Submissions: 12591 Points: 2
Given string S representing a postfix expression, the task is to evaluate the expression and find the final value. Operators will only include the basic arithmetic operators like *, /, + and -.

 

Example 1:

Input: S = "231*+9-"
Output: -4
Explanation:
After solving the given expression, 
we have -4 as result.







class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String s)
    {
        // Your code here
        
        Stack<Integer> st=new Stack<>();
         
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c))
            {
                st.push(c-'0');
            }
            System.out.println()
            else
            {
                
                int n1=st.pop();
                int n2=st.pop();
                
                if((s.charAt(i))==('+'))
                {
                    st.push(n2+n1);
                }
                
                if((s.charAt(i))==('-'))
                {
                    st.push(n2-n1);
                }
                
                if((s.charAt(i))==('/'))
                {
                    st.push(n2/n1);
                }
                
                if((s.charAt(i))==('*'))
                {
                    st.push(n2*n1);
                }
            }
        }
        return st.peek();
    }
}

// Expected Time Complexity: O(|S|)
// Expected Auixilliary Space: O(|S|)