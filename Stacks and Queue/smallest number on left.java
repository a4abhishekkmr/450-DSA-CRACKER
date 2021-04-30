Given an array a of integers of length n, find the nearest smaller number for every element such that the smaller element is on left side.If no small element present on the left print -1.

Example 1:

Input: n = 3
a = {1, 6, 2}
Output: -1 1 1
Explaination: There is no number at the 
left of 1. Smaller number than 6 and 2 is 1.


//User function Template for Java
class Solution{
    static List<Integer> leftSmaller(int n, int arr[])
    {
        //code here
        ArrayList<Integer> al=new ArrayList<>();
        ArrayDeque<Integer> st=new ArrayDeque<>();
        
        al.add(-1);
        st.push(arr[0]);
        
        for(int i=1;i<n;i++)
        {
            while(!st.isEmpty() && st.peek()>=arr[i])//= needed if not done this will cause error fpr 19 19 19 19
            st.pop();
            
            int ans=(st.isEmpty())?-1:st.peek();
            al.add(ans);
            
            st.push(arr[i]);
        }
        
        return al;
    }
}
//Expected Time Complexity: O(n)
//Expected Auxiliary Space: O(n)