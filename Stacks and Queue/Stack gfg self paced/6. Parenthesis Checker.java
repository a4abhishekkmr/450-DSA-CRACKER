Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.

Example 1:

Input:
{([])}
Output: 
true
Explanation: 
{ ( [ ] ) }. Same colored brackets can form 
balaced pairs, with 0 number of 
unbalanced bracket.





class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String str)
    {
        // add your code here
        int n=str.length();
        ArrayDeque<Character> st=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)=='(' || str.charAt(i)=='['|| str.charAt(i)=='{' )
            st.push(str.charAt(i));
            
            else
            {if(st.isEmpty())
            return false;//this says means isntead of opening braclet we found closing bracket.
            
            else if ((str.charAt(i)==')' && st.peek()=='(') ||
            (str.charAt(i)==']' && st.peek()=='[') ||
            (str.charAt(i)=='}' && st.peek()=='{') )
            {
                st.pop();
            }
             else//this is to handle a case when str.charAt(i)==']' && st.peek()=='{'
             return false;
        }
        }
        return st.isEmpty();
        
    }
}
//Time comp is O(lenght of str) and Aux space is also same/