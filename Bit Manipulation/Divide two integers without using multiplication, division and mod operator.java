Divide two integers without using multiplication, division and mod operator

Given a two integers say a and b. Find the quotient after dividing a by b without using multiplication, division and mod operator.

Example: 

Input : a = 10, b = 3
Output : 3

Input : a = 43, b = -8
Output :  -5 


Approach one-
Keep subtracting the dividend from the divisor until dividend becomes less than divisor. The dividend becomes the remainder, and the number of times subtraction is done becomes the quotient. Below is the implementation of above approach :

class GFG 
{
     
    // Function to divide a by b and
    // return floor value it
    static int divide(int dividend, int divisor) 
    {
         
        // Calculate sign of divisor i.e.,
        // sign will be negative only iff
        // either one of them is negative
        // otherwise it will be positive
        int sign = ((dividend < 0) ^ 
                   (divisor < 0)) ? -1 : 1;
     
        // Update both divisor and
        // dividend positive
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
     
        // Initialize the quotient
        int quotient = 0;
         
        while (dividend >= divisor)
        {
            dividend -= divisor;
            ++quotient;
        }
     
        return sign * quotient;
    }    
     
    public static void main (String[] args) 
    {
        int a = 10;
        int b = 3;
         
        System.out.println(divide(a, b));
         
        a = 43;
        b = -8;
         
        System.out.println(divide(a, b));
    }
}

Time complexity : O(a) 
Auxiliary space : O(1)
Efficient Approach : Use bit manipulation in order to find the quotient. The divisor and dividend can be written as 


class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		
		Scanner sc = new Scanner(System.in);
		int D =  sc.nextInt();
		int d =  sc.nextInt();
		
		 int sign = ((D < 0) ^ 
                   (d < 0)) ? -1 : 1;
        int a  = Math.abs(D);
         int b  = Math.abs(d);
         int res  =  0;
         while( (a-b) >= 0)  // n/2
         {
             int x = 0 ;
             while( a - (b << 1 << x) >= 0)  // (n - n/2) /2
             {
                 x++;
             }
             res += 1<<x;
             a -= b<<x;
         }
         System.out.println(sign*res);
	}
}


Time complexity : O(log(a)) 
Auxiliary space : O(1)
