Union of two arrays 

Given two arrays a[] and b[] of size n and n respectively. The task is to find union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in union.

Example 1:

Input:
5 3
1 2 3 4 5
1 2 3

Output: 
5

Solution>>

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        
        //Used hashing to store distinct elements from both the arrays.
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        hs.add(a[i]);
        
        for(int i=0;i<m;i++)
        hs.add(b[i]);
        
        return hs.size();
    }
}
// Expected Time Complexity : O((n+m)log(n+m))
// Expected Auxilliary Space : O(n+m)

// Steps:-
// Insert all elements of first array in a Set or HashSet.
// Insert all elements of second array in the Set or HashSet.
// Remember Set or HashSet does not contain duplicate elements.
// Return the size of Set or HashSet which is total number of elements in them.