Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.

Input:
The first line of input contains an integer denoting the no of test cases. Then T test cases follow. Each test case contains two lines. The first line of input contains an integer n denoting the size of the arrays. In the second line are N space separated values of the array A[].

Output:
For each test case in a new line print the required result.

Constraints:
1 <=T<= 50
1 <=n<= 20
1 <=A[]<= 10000

Example:
Input:
2
5
111 222 333 444 555
3
121 131 20

Output:
1
0


class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                   for(int i=0;i<n;i++)
                  if((palindrome(a[i]))==false)
                  return 0;
                  
                  return 1;
           }
           static boolean palindrome(int n)
           {
               int rev=0;
               int temp=0;
               temp=n;
                   while(temp>0)
                   {
                       rev=rev*10+temp%10;
                       temp/=10;
                   }
                   if(rev==n)
                   return true;
                   
                   return false;
               }
           }