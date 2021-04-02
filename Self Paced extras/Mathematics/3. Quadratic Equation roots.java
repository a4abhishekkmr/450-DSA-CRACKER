3. Quadratic Equation Roots 

Given a quadratic equation in the form ax2 + bx + c. Find its roots.

Example 1:

Input:
a = 1
b = -2
c = 1
Output: 1 1
Explanation:
Roots of equation x2-2x+1 are 1 and 1.


class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        
        ArrayList<Integer> al=new ArrayList<Integer>();
        //if(a==0) return al;
        double d=(b*b - 4*a*c);
        double sqrt_val = Math.sqrt(d);
        if(d<0)
        al.add(-1);
        else if(d==0)
        {
            double root=((-1*b)/(2*a));
            int r1=(int)Math.floor(root);
            al.add(r1);
            al.add(r1);
        }
        
        else
        {
        double r1=(((-1*b)+sqrt_val)/(2*a));
        int root1=(int)Math.floor(r1);
        al.add(root1);
        double r2=(((-1*b)-sqrt_val)/(2*a));
        int root2=(int)Math.floor(r2);
        al.add(root2);
        }
        
        Collections.sort(al, Collections.reverseOrder());
        return al;
        }
    }
    Time complexity-O(1)
Aux space-O(1) Arraylist with 2 space only.