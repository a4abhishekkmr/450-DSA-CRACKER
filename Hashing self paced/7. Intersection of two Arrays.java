https://practice.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1/?track=DSASP-Hashing&batchId=154

Given two arrays a[] and b[] respectively of size n and m, the task is to print the count of elements in the intersection (or common elements) of the two arrays.

For this question, the intersection of two arrays can be defined as the set containing distinct common elements between the two arrays. 

Example 1:

Input:
5 3
89 24 75 11 23
89 2 4

Output: 
1

Explanation: 
89 is the only element 
in the intersection of two arrays.


class Solution{
    //Function to return the count of the number of elements in
    //the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[],int b[],int n,int m)
    {
        //A. insert all elements in hash set
        Set<Integer> s=new HashSet<>();
        for(int x:a)
        s.add(x);
        
        int res=0;
        //traverse through b, search for every element b in hash a. if present increment res
        //and remove element of b from hash a;
        for(int x:b)
        if(s.contains(x))
        {
            res++;
            s.remove(x);
        }
        return res;
    }
};

//tc=O(n)
//aux space=O(n)