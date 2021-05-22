The intersection of two arrays contains the elements common to both the arrays. The intersection should not count duplicate elements.
Given two sorted arrays arr1[] and arr2[] of sizes N and M respectively. Find their intersection

 

Example 1:

Input: 
N = 4, arr1[] = {1, 2, 3, 4}  
M = 5, arr2 [] = {2, 4, 6, 7, 8}
Output: 2 4
Explanation: 2 and 4 are only common 
elements in both the arrays.
  
  
  //User function Template for Java

class Solution
{
    //Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) 
    {
        // add your code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(i>0 && arr1[i]==arr1[i-1])
            {
                i++;continue;
            }
            else if(arr1[i]<arr2[j])
            {
                i++;
            }
            else if(arr1[i]>arr2[j])
            {
                j++;
            }
            else
            {
                al.add(arr1[i]);
                i++;j++;
            }
    }//while
    if(al.size()==0)
    al.add(-1);

return al;
}
}
TC-O(n,m)min Aux space-O(1)
