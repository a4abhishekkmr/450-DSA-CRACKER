Calculate square of a number without using *, / and pow()

Given an integer n, calculate the square of a number without using *, / and pow(). 

Examples : 

Input: n = 5
Output: 25

Input: 7
Output: 49

Input: n = 12
Output: 144

package BitManupulations;
//import java.util.Scanner;
public class Power {
	static int square(int n)
	{
		//bc
		if(n==0) return 0;
		//handling negatives
		if(n<0) n=-n;
		
		int x=n>>1;//getting flour value with n/2
		
		if(n%2!=0)
			{return ((square (x)<<2) + (x<<2) + 1);}
			
		else
			{return (square(x)<<2);}
	}
	public static void main(String args[])
    {
	 System.out.println(square(15));

}
}


output- 225
The time complexity of the above solution is O(Logn).