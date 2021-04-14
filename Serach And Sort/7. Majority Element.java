Majority Element 

Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.
 

Example 1:

Input:
N = 3 
A[] = {1,2,3} 
Output:
-1
Explanation:
Since, each element in 
{1,2,3} appears only once so there 
is no majority element.



class Solution
{
    static int majorityElement(int arr[], int n)
    {
        //this finds a candidate
        int res=0,count=1;
        for(int i=1;i<n;i++)
        {
            if(arr[res]==arr[i])
            count++;
            else
            count--;
        
            if(count==0) {
                res=i;count=1;
            }
        }
        //No of candidate
        count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[res]==arr[i])
            count++;
        }
            if(count<=n/2) {
                return -1;
                
            }
            return arr[res];
        }
}

//O(n)  with O(1) Aux space
        
        
        
    //Here is the naive solution which will help you to understand it clearly.    
        
        // your code here
//         if(n==1) return arr[0];
//         for(int i=0;i<n;i++)
//         {
//             int count=1;
//             for(int j=i+1;j<n;j++)
//             {
//                 if(arr[i]==arr[j])
//                 count++;
//                 if(count>n/2)
//                 return arr[i];
//             }
//         }
//         return -1;
//     }
// }
//O(n^2) with O(1) aux space.