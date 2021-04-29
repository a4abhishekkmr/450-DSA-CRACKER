You are given a string S, the task is to reverse the string using stack.

 

Example 1:


Input: S="GeeksforGeeks"
Output: skeeGrofskeeG




class Solution {
    
    public void reverse(String str){
       your code here
       String store=;
       StackCharacter s=new Stack();
       for(int i=0;istr.length();i++)
       {
       s.push(str.charAt(i));}
       for(int i=0;istr.length();i++)
       {
       store=store+s.pop();}
       System.out.println(store);
    }

}
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(N)