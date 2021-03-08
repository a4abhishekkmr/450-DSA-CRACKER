Non Repeating Numbers

Input: 
N = 2
arr[] = {1, 2, 3, 2, 1, 4}
Output:
3 4 
Explanation:
3 and 4 occur exactly once.

Approach one:--  Using HashMap and updating solutions.

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) 
            {
                map.put(nums[i], 1);
            } 
            else 
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        int index = 0;
        for(Map.Entry<Integer, Integer> items:map.entrySet()) 
        {
            if(items.getValue()==1) 
            {
                result[index] = items.getKey();
                index++;
            }
        }
        Arrays.sort(result);
        return result;
        // Code here
    }
}

Second Approach by Bit manipulation
>>
class Solution
{
    public int[] singleNumber(int[] nums)
    {
        int all=0;
        //xor with each element
        //says n^n=0 and 0^n=n 
        for(int i=0;i<nums.length;i++)
        {
            all=all^nums[i];
        }
        //this is main
        
        int m= all & -all;
        
        int sum1=0;
        int sum2=0;
        //try to solve this you wwill get
        for(int i=0;i<nums.length;i++)
        {
            if((m&nums[i])==0)
            {
                sum1=sum1^nums[i];
            }
            else
            sum2=sum2^nums[i];
        }
        
        int result[]=new int[2];
        result[0]=sum1;
        result[1]=sum2;
        Arrays.sort(result);
        
        return result;
    }
}

Expected Time Complexity: O(N)
Expected Space Complexity: O(1)