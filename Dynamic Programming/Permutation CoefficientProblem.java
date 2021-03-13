Permutation Coefficient

nPr=

Approach 1
>>
// A O(n) solution that uses 
// table fact[] to calculate 
// the Permutation Coefficient 
import java .io.*; 

public class GFG { 
	
	// Returns value of Permutation 
	// Coefficient P(n, k) 
	static int permutationCoeff(int n, 
								int k) 
	{ 
		int []fact = new int[n+1]; 
	
		// base case 
		fact[0] = 1; 
	
		// Calculate value 
		// factorials up to n 
		for (int i = 1; i <= n; i++) 
			fact[i] = i * fact[i - 1]; 
	
		// P(n,k) = n! / (n - k)! 
		return fact[n] / fact[n - k]; 
	} 
	
	// Driver Code 
	static public void main (String[] args) 
	{ 
		int n = 10, k = 2; 
		System.out.println("Value of"
		+ " P( " + n + ", " + k + ") is "
		+ permutationCoeff(n, k) ); 
	} 
} 

// time-O(n)
space-O(n)

Apprach 2>>

// A O(n) time and O(1) extra 
// space solution to calculate 
// the Permutation Coefficient 
import java.io.*; 

class GFG 
{ 
	static int PermutationCoeff(int n, 
								int k) 
	{ 
		int Fn = 1, Fk = 1; 
	
		// Compute n! and (n-k)! 
		for (int i = 1; i <= n; i++) 
		{ 
			Fn *= i; 
			if (i == n - k) 
			Fk = Fn; 
		} 
		int coeff = Fn / Fk; 
		return coeff; 
	} 
	
	// Driver Code 
	public static void main(String args[]) 
	{ 
		int n = 10, k = 2; 
		System.out.println("Value of P( " + n + "," + 
										k +") is " + 
							PermutationCoeff(n, k) ); 
	} 
} 
	
// O(n) and O(1)

