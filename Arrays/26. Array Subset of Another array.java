Array Subset of another array 

Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted. It may be assumed that elements in both array are distinct.
 

Example 1:

Input:
a1[] = {11, 1, 13, 21, 3, 7}
a2[] = {11, 3, 7, 1}
Output:
Yes
Explanation:
a2[] is a subset of a1[]


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        HashMap<Long, Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++)
        map.put(a1[i],1);
        
        for(int i=0;i<m;i++)
        {
            if(map.get(a2[i])==null)
            return "No";
        }
        return "Yes";
    }
}//O(n) using hash Map