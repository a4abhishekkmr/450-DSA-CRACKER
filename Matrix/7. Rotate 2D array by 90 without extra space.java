You are given an N x N 2D matrix Arr representing an image. Rotate the image by 90 degrees (Anti clockwise). You need to do this in place. Note that if you end up using an additional array, you will only receive partial score.

Example 1:

Input:
N = 3
Arr[][] = {{1,  2,  3}
           {4,  5,  6}
           {7,  8,  9}}
Output:
 3  6  9 
 2  5  8 
 1  4  7 
Explanation: The given matrix is rotated
by 90 degree in anti-clockwise direction.





class Solution {
    void rotateMatrix(int arr[][], int n) {
        // code here
                    //now we need to do transpose
        for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++)
        {
            int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
        }
        }//)(n^2)
        
        for(int i=0;i<n;i++)
        {
            int low=0,high=n-1;
            while(low<high)
            {//Reversed the rows upper comes down and down comes up
                int temp=arr[low][i];
                arr[low][i]=arr[high][i];
                arr[high][i]=temp;
                low++;
                high--;
            }
        }   //nlogn
        

    }
}
Final time complexity-O(N*N)
 Auxiliary Space: O(1)
