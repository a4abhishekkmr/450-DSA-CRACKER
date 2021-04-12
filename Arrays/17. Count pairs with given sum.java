Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.


Example 1:

Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation: 
arr[0] + arr[1] = 1 + 5 = 6 
and arr[1] + arr[3] = 5 + 1 = 6.


NAive approach-
class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==k)
                count++;
            }
        }
        return count;
    }
}
TC=O(n^2)
Aux space=O(1)


Efficient way in O(n)

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
        // Store counts of all elements in map
        for(int i=0;i<n;i++)
        {// initializing value to 0, if key not found
            if(map.containsKey(arr[i]))
            {
               map.put(arr[i],map.get(arr[i])+1); 
            }
            else
            map.put(arr[i],1);
        }
        //System.out.print(map);
        
        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        int count_two=0;
        for(int i=0;i<n;i++)
        {
        if(map.containsKey(k-arr[i]))
        count_two+=map.get(k-arr[i]);
        
         // if (arr[i], arr[i]) pair satisfies the
            // condition, then we need to ensure that the
            // count is decreased by one such that the
            // (arr[i], arr[i]) pair is not considered
        if(arr[i]+arr[i]==k)
        count_two--;
        }
        
        // return the half of twice_count
        return count_two/2;
    }
}
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)