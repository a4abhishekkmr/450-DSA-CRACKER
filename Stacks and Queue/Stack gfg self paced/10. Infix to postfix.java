10. Infix to Postfix 
Easy Accuracy: 43.61% Submissions: 4851 Points: 2
Given an infix expression in the form of string str. Convert this infix expression to postfix expression.

Infix expression: The expression of the form a op b. When an operator is in-between every pair of operands.
Postfix expression: The expression of the form a b op. When an operator is followed for every pair of operands.
â€‹Note: The order of precedence is: ^ greater than * equals to / greater than + equals to -. 
Example 1:

Input: str = "a+b*(c^d-e)^(f+g*h)-i"
Output: abcd^e-fgh*+^*+i-
Explanation:
After converting the infix expression 
into postfix expression, the resultant 
expression will be abcd^e-fgh*+^*+i-





class Solution
{
    //Function to convert an infix expression to a postfix expression.
	public static String infixToPostfix(String exp) 
	{
		// Your code here
		String ans="";
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<exp.length();i++)
	    {
	        char c = exp.charAt(i);
	        
	        if (Character.isLetterOrDigit(c))
                ans += c;
                
            else if (c == '(')
                stack.push(c);
                
            else if (c == ')')
            {
                while (!stack.isEmpty() && 
                        stack.peek() != '(')
                    ans += stack.pop();
                
                    stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty() && prec(c) <= prec(stack.peek())){
                  
                    ans += stack.pop();
             }
                stack.push(c);
            }
	    }
            // pop all the operators from the stack
        while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            ans += stack.pop();
         }
        return ans;
	    }
	
	static int prec(char ch)
	{
	    switch(ch)
	    {
	        case '+':
	        case '-':
	            return 1;
	            
	        case '*':
	        case '/':
	            return 2;
	            
	        case '^':
	            return 3;
	    }
	    return -1;
	}
}
//Expected Time Complexity: O(|str|).
//Expected Auxiliary Space: O(|str|).