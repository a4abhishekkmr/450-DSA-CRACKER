Given an array arr[ ] of N positive integers, the task is to find the greatest element on the left of every element in the array which is strictly smaller than itself, if this element does not exist for an index print "-1".

Example 1:

â€‹Input:
N = 5
arr[] = {2, 3, 4, 5, 1}
Output: 
-1 2 3 4 -1
Explanation:
Greatest element on the left of 3 smaller 
than itself is 2, for 4 it is 3 and for 5 
it is 1. Since 2 is the first element and 
no element on its left is present, so it's 
greatest smaller element will be -1 and for 
1 no element smaller than itself is present 
on its left, so it's greatest smaller element 
is -1.
â€‹Example 2:

Input:
N = 3
arr[] = {1, 2, 3} 
Output:
-1 1 2 
  
  
  
  
  //User function Template for Java



class Complete{
    
   
    // Function for finding maximum and value pair
    public static int[] Smallestonleft (int arr[], int n) {
        // Complete the function
        int ans[]=new int[n];
        ans[0]=-1;
        TreeSet<Integer>s=new TreeSet<>();
        s.add(arr[0]);
        for(int i=1;i<n;i++)
        {
            if(s.lower(arr[i])!=null)
            ans[i]=s.lower(arr[i]);
            else
            ans[i]=-1;
            s.add(arr[i]);
        }
        return ans;
    }
    //Expected Time Complexity: O(N*Log(N))-> N times loop and logN for Lower to search in a[i].
//Auxiliary Space: O(N) for TreeSet.
    
}
