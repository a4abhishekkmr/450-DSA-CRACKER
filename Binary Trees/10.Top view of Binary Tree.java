/*class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
// class Node{
//     int height;
// }

class View
{
    static class Pair 
    {
    Node data;
    int val;
    Pair(Node n,int a)
    {
        data=n;
        val=a;
    }}
    
    // function should print the topView of the binary tree
    static ArrayList<Integer> topView(Node node)
    {
        // add your code
        ArrayList<Integer> b=new ArrayList<Integer>();
        if (node == null) {
      return b;
    }

    TreeMap<Integer, Integer> m = new TreeMap<Integer, Integer>();

    Queue<Pair> q = new LinkedList<Pair>();
    q.add(new Pair(node,0));

    while (!q.isEmpty()) {
      Node temp = q.peek().data;
       int height = q.peek().val;
      q.remove();
      
      if (m.get(height) == null) {
        m.put(height,temp.data);
      }

      if (temp.left != null) {
        // temp.left.height = height - 1;
        q.add(new Pair(temp.left,height-1));
      }

      if (temp.right != null) {
        // temp.right.height = height + 1;
        q.add(new Pair(temp.right,height+1));
      }
    }
    // System.out.println(m.values());
    for(Integer data:m.values())
        {
            System.out.print( data + " ");
        }
    return b;
  }
  
}