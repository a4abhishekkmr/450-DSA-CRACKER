Print Non-Repeated Elements 

Hashing is very useful to keep track of the frequency of the elements in a list.

You are given an array of integers. You need to print the non-repeated elements as they appear in the array.

Example 1

Input
n = 10
arr[] = {1,1,2,2,3,3,4,5,6,7}
Output 4 5 6 7
Explanation 4, 5, 6 and 7 are the only 
elements which is having only 1 
frequency and hence, Non-repeating.



class Solution
{
    //Function to return non-repeated elements in the array.
    static ArrayList<Integer> printNonRepeated(int arr[], int n)
    {
        // add your code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int x:arr)
        h.put(x,h.getOrDefault(x,0)+1);
        
        for(int i=0;i<n;i++)
        {
            if(h.get(arr[i])==1)
            al.add(arr[i]);
        }
        //as i need in same order so i am traversing through array elements and checking for its frequencies.
        
        return al;
    }
}
//tc=O(n)
//aux space=O(n)

