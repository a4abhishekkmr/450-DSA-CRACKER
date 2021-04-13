Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?

Example 1:

Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.


//using concept of if else if and else only one of these statements execute in a single loop and solve the iteration you will get that
class Solution
{
    ArrayList<Integer> commonElements(int a[], int b[], int c[], int n1, int n2, int n3) 
    {
        // code here 
        //iterate through the elements of each array and find the max element
        ArrayList<Integer> al=new ArrayList<Integer>();
        int i=0,j=0,k=0;
        while((i<n1)&&(j<n2)&&(k<n3))
        {
            //passing the equal elements 
            while( (i>0) && (i<n1) && (a[i-1]==a[i] ))
            {
                i++;
            }
            while( (j>0) && (j<n2) && (b[j-1]==b[j] ))
            {
                j++;
            }
            while( (k>0) && (k<n3) && (c[k-1]==c[k] ))
            {
                k++;
            }
            //taking benefit of sorted and making any one array as base and compare from them
            
            if((i < n1) &&( j < n2) &&( k < n3))
            {
            if((a[i]==b[j])&&(a[i]==c[k]))
            {al.add(a[i]);i++;j++;k++;}
            
            else if((a[i]<b[j]))
            i++;
            
            else if((b[j]<c[k]))
            j++;
            
            else 
            k++;
            }
        }
        return al;
    }
}