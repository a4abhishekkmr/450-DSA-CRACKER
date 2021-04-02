7. Josephus problem 

Given the total number of persons n and a number k which indicates that k-1 persons are skipped and kth person is killed in circle in a fixed direction.

The task is to choose the safe place in the circle so that when you perform these operations starting from 1st place in the circle, you are the last one remaining and survive.

Example 1:

Input:
n = 3 k = 2
Output: 3
Explanation: There are 3 persons so 
skipping 1 person i.e 1st person 2nd 
person will be killed. Thus the safe 
position is 3.


class Solution
{
   public int josephus(int n, int k)
    {
        //Your code here
        if(n==1) return 1;
        
        else
        return (josephus(n-1,k)+k-1)%n+1;
    }

}
TC=theta(n)

Hint :-
The problem has the following recursive structure.

  josephus(n, k) = (josephus(n - 1, k) + k-1) % n + 1
  josephus(1, k) = 1
After the first person (kth from the beginning) is killed, n-1 persons are left. So we call josephus(n – 1, k) to get the position with n-1 persons. But the position returned by josephus(n – 1, k) will consider the position starting from k%n + 1. So, we must make adjustments to the position returned by josephus(n – 1, k).