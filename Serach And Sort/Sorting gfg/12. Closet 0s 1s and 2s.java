Given an array of 0s, 1s, and 2s. Arrange the array elements such that all 0s come first, followed by all the 1s and then, all the 2s.

Note: Do not use the inbuilt sort function.
 

Example 1:

Input: N = 5, arr[] = {0, 2, 1, 2, 0}
Output: 0 0 1 2 2
  
  
  
  //User function Template for Java

class Solution
{
    // The function should do the stated modifications in the given array arr[]
    // Do not return anything.
    
    // arr[]: Input Array
    // N: Size of the Array arr[]
    //Function to segregate 0s, 1s and 2s in sorted increasing order.
    public static void segragate012(int arr[], int n){
        // Your Code Here
        int zero =0,one=0,two=0;
        for(int i: arr)
        {
        if(i==0)
            zero++;
        else if(i==1)
            one++;
        else
            two++;
        }
        for(int j=0;j<zero;j++)
        {
            arr[j]=0;
        }
        for(int j=zero;j<zero+one;j++)
        {
            arr[j]=1;
        }
        for(int j=zero+one;j<zero+one+two;j++)
        {
            arr[j]=2;
        }
}
}
  tc-O(n) and O(1).      
        
//         int l=0,h=n-1;
//         int temp=0;
//         while(l<h)
//         {
//             if(arr[l]<=arr[l+1])
//             l++;
//             else if(arr[l]>arr[h])
//             //swap(arr[l],arr[h]);
//             {
//                 temp=arr[l];
//                 arr[l]=arr[h];
//                 arr[h]=temp;
//                 l++;h--;
//             }
//             else if(arr[h]>=arr[h-1])
//             h--;
            
//         }
//     }
    
// }
// //0, 1, 0, 2, 0
