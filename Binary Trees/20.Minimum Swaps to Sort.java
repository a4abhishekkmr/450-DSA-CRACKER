Minimum Swaps to Sort

Input:
nums = {10, 19, 6, 3, 5}
Output:
2
Explaination:
swap 10 with 3 and swap 19 with 5.

>>

class Solution
{
    public int minSwaps(int arr[])
    {
        // Code here
        int n=arr.length;
        int ans=0;
        
        int[] temp=Arrays.copyOfRange(arr,0,n);
        
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        
        Arrays.sort(temp);
        
        for(int i=0;i<n;i++)
        {
            hm.put(arr[i],i);
        }
        
        for(int i=0;i<n;i++)
        {
        
            if(arr[i]!=temp[i])
            {
                ans++;
                int a=arr[i];
                
                swap(arr,i,hm.get(temp[i]));
                
                //edit time
                hm.put(a,hm.get(temp[i]));
                hm.put(temp[i],i);
            }
        }return ans;
        
    }
    
    public void swap(int[] arr, int i, int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

Expected Time Complexity: O(nlogn)-- due to sorting -- and for hash -- n
Expected Auxiliary Space: O(n)  -- hash put