Given two Binary Search Trees. Find the nodes that are common in both of them, ie- find the intersection of the two BSTs.

Example 1:

Input:
BST1:
                  5
               /     \
             1        10
           /   \      /
          0     4    7
                      \
                       9
BST2:
                10 
              /    \
             7     20
           /   \ 
          4     9
Output: 4 7 9 10

Example 2:

Input:
BST1:
     10
    /  \
   2   11
  /  \
 1   3
BST2:
       2
     /  \
    1    3
Output: 1 2 3
  
  
  
  
  //User function Template for Java


class Solution
{
    //Function to find the nodes that are common in both BST.
	public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        //code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        if(root1==null ||root2==null )
        return al;
        
        HashSet<Integer> hs=new HashSet<Integer>();
        add(root1,hs);
        //added all elements of 1st BST into graph
        check(root2,hs,al);
        //Now checked for all the elements that are present on the hashset
        return al;
    }
    static void add(Node root1,HashSet<Integer>h){ 
    //HashSet<Integer> h=new HashSet<Integer>();
    if(root1==null) return;//bc
    add(root1.left,h);
    h.add(root1.data);
    add(root1.right,h);
    }
    
    static void check(Node root2,HashSet<Integer> hs,ArrayList<Integer> al){
        if(root2==null) return;//bc
        check(root2.left,hs,al);
        if(hs.contains(root2.data))
        al.add(root2.data);
        check(root2.right,hs,al);
}
}
//Expected Time Complexity: O(N1 + N2) where N1 and N2 are the sizes of the 2 BSTs.
//Expected Auxiliary Space: O(H1 + H2) where H1 and H2 are the heights of the 2 BSTs.
