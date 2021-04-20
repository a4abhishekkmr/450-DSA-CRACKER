Non-Repeating Element 

Find the first non-repeating element in a given array arr of N integers.
Note: Array consists of only positive and negative integers and not zero.

Example 1:

Input : arr[] = {-1, 2, -1, 3, 2}
Output : 3
Explanation:
-1 and 2 are repeating whereas 3 is 
the only number occuring once.
Hence, the output is 3. 


class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int x:arr)
        h.put(x,h.getOrDefault(x,0)+1);
        for(int i=0;i<n;i++)
        {
            if(h.get(arr[i])==1)
            return arr[i];
            
        }
        return 0;
    }
}
//tc=O(n)
//aux space=O(n)

