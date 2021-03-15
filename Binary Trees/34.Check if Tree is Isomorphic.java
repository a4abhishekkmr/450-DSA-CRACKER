Input:
T1    1     T2:    1
    /  \         /   \
   2    3       3     2
  /                    \
  4                     4
Output: Yes

class BinaryTree  
{ 
    // Return True if the given trees are isomotphic. Else return False.
    boolean isIsomorphic(Node node1, Node node2)  
    { 
         // code here.
         //condition 1
         if(node1==null && node2==null)
         {
             return true;
         }
         //condition 2
         if(node1==null || node2==null)
         {
             return false;
         }
         if(node1.data!=node2.data)
         {
             return false;
         }
         
         return ((isIsomorphic(node1.left,node2.left) && isIsomorphic(node1.right,node2.right)) ||
         (isIsomorphic(node1.left,node2.right) && isIsomorphic(node1.right,node2.left)));
    }
    
}    

Expected Time Complexity: O(min(M,N)) where M and N are the sizes of the two trees.
Expected Auxiliary Space: O(min(H1,H2)) where H1 and H2 are the heights of the two trees.

1<=Number of nodes<=105