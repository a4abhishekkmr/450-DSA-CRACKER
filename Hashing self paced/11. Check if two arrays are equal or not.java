Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.

Example 1:

Input:
N = 5
A[] = {1,2,5,4,0}
B[] = {2,4,5,0,1}
Output: 1
Explanation: Both the array can be 
rearranged to {0,1,2,4,5}




solution link:-
//User function Template for Java
//https://www.geeksforgeeks.org/check-if-two-arrays-are-equal-or-not/
class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long a[],long b[],int N)
    {
        //  //A. insert all elements in hash set
        // HashMap<Long,Long> m1=new HashMap<>();
        // for(long x:a)
        // m1.put(x, m1.getOrDefault(x,(long)0)+1);
        
        // HashMap<Long,Long> m2=new HashMap<>();
        // for(long x:b)
        // m2.put(x, m2.getOrDefault(x,(long)0)+1);
        
        // int len=m1.size();
        // int len2=m2.size();
        // if(len!=len2)
        // return false;
        
        // int res=0;
        
        // for(int i=0;i<N;i++)
        // {
        //     if(m1.get(a[i])==m2.get(b[i]))
        //     {
        //         if(m1.values(a[i])!=m2.values(b[i]))
        //         return false;
        //     }
        //     else
        //     return true;
        // }
        
        //Another approach
        int count = 0;
Arrays.sort(a);
Arrays.sort(b);
for(int i = 0; i < N; i++){
if(a[i] == b[i]){
count++;
}
}
if(count == N){
return true;
}else{
return false;
}
}
}
//Time comp is O(nlogn) for sorting
//and aux space is O(1)


//Another help can be of
// unordered_set <int> s1, s2;
// for(int i = 0; i < n; i++)
// s1.insert(arr[i]);
// for(int i = 0; i < n; i++)
// s2.insert(brr[i]);
// return (s1 == s2);