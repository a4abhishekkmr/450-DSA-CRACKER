Given K sorted arrays arranged in the form of a matrix of size K*K. The task is to merge them into one sorted array.
Example 1:

Input:
K = 3
arr[][] = {{1,2,3},{4,5,6},{7,8,9}}
Output: 1 2 3 4 5 6 7 8 9
Explanation:Above test case has 3 sorted
arrays of size 3, 3, 3
arr[][] = [[1, 2, 3],[4, 5, 6], 
[7, 8, 9]]
The merged list will be 
[1, 2, 3, 4, 5, 6, 7, 8, 9].
Example 2:

Input:
K = 4
arr[][]={{1,2,3,4}{2,2,3,4},
         {5,5,6,6},{7,8,9,9}}
Output:
1 2 2 2 3 3 4 4 5 5 6 6 7 8 9 9 
Explanation: Above test case has 4 sorted
arrays of size 4, 4, 4, 4
arr[][] = [[1, 2, 2, 2], [3, 3, 4, 4],
[5, 5, 6, 6]  [7, 8, 9, 9 ]]
The merged list will be 
[1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 
6, 6, 7, 8, 9, 9 ].
Your Task:
You do not need to read input or print anything. Your task is to complete mergeKArrays() function which takes 2 arguments, an arr[K][K] 2D Matrix containing K sorted arrays and an integer K denoting the number of sorted arrays, as input and returns the merged sorted array ( as a pointer to the merged sorted arrays in cpp, as an ArrayList in java, and list in python)

Expected Time Complexity: O(K2*Log(K))
Expected Auxiliary Space: O(K)











//User function Template for Java
class Triplet implements Comparable<Triplet>
{
    int val,apos,vpos;
    Triplet(int v,int ap,int vp)
    {
        val=v;apos=ap;vpos=vp;
    }


public int compareTo(Triplet t)
{
    if(val<=t.val) return -1;
    else return 1;
}
}
class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        ArrayList<Integer> al=new ArrayList<Integer>();
        PriorityQueue<Triplet> pq=new PriorityQueue<Triplet>();
        for(int i=0;i<K;i++)
        pq.add(new Triplet(arr[i][0],i,0));
        
        while(pq.isEmpty()==false)
        {
            Triplet curr=pq.poll();
            al.add(curr.val);
            int ap=curr.apos, vp=curr.vpos;
            
            if(vp+1<K)
            {
                pq.add(new Triplet(arr[ap][vp+1],ap,vp+1));
            }
        }
        return al;
        
    }
}
