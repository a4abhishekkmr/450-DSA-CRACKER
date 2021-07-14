Example 1:

Input:
N = 2
Arr[] = {2, 2}
Output: 2 1
Explanation: Repeating number is 2 and 
smallest positive missing number is 1.

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        // int ans[]=new int[2];
        // HashSet<Integer>h=new HashSet<>();
        // for(int i=0;i<n;i++)
        // {
        //     if(h.contains(arr[i]))
        //     ans[0]=arr[i];
        //     else
        //     h.add(arr[i]);
        // }
        // for(int i=1;i<=n;i++)
        // {
        //     if(!(h.contains(i)))
        //     ans[1]=i;
        // }
        // return ans;
        int ans[]=new int[2];
        for(int i=0;i<n;i++)
        {
            int absVal=Math.abs(arr[i]);
            if(arr[absVal-1]>0)
            arr[absVal-1]=-arr[absVal-1];
            else
            ans[0]=absVal;
        }
        for(int i=0;i<n;i++)
        if(arr[i]>0)
        ans[1]=i+1;
        
        return ans;
    }
}
