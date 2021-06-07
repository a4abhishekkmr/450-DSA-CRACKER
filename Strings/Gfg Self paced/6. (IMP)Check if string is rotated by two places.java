Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating another string 'a' by exactly 2 places.

Example 1:

Input:
a = amazon
b = azonam
Output: 1
Explanation: amazon can be rotated anti
clockwise by two places, which will make
it as azonam.
Example 2:

Input:
a = geeksforgeeks
b = geeksgeeksfor
Output: 0
Explanation: If we rotate geeksforgeeks by
two place in any direction , we won't get
geeksgeeksfor.
  
  
  
  

class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String s1, String s2)
    {
        //handling test cases..
        if(s1.length()<2 && s1.charAt(0)==s2.charAt(0)) return true;
        if(s1.length()==2) return true;
        if(s1.equals(s2)) return false;
        if((fn(s1,s2))||(fn(s2,s1))==true)
        return true;
        else
        return false;
    }
    
    
    static boolean fn(String s1,String s2){
        s1=s1+(s1.charAt(0));
        s1=s1+(s1.charAt(1));
        return (s1.indexOf(s2)==2);
    } 
}//tc=O(n)
