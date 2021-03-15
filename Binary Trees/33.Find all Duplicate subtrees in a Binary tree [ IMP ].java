Duplicate Subtrees 

3
5
10 20 L 20 25 L 10 30 R 30 20 L 20 25 L
6
1 2 L 1 3 R 2 4 L 3 2 L 2 4 L 3 4 R
6
10 8 L 8 3 L 10 2 R 2 9 L 9 4 R 2 6 R


class Solution {
    static LinkedHashMap<String, Integer> m;
    static ArrayList<Integer> arr;
    public void printDup(Node root){
        //Write your code here
        m = new LinkedHashMap<>();
        arr = new ArrayList<>();
        inOrder(root);
        Collections.sort(arr);
        if(arr.size()==0)
            System.out.print(-1);
        else
        {
            for(int i : arr)
                System.out.print(i+" ");
        }
        System.out.println();
    }
    public String inOrder(Node root)
    {
        if(root==null)
            return "";
        String str = "(";
        str += inOrder(root.left);
        str += String.valueOf(root.data);
        str += inOrder(root.right);
        str += ")";
        if (m.get(str)!=null && m.get(str)==1) 
            arr.add(root.data); 

        if (m.containsKey(str)) 
            m.put(str,m.get(str)+1); 
        else
            m.put(str,1); 
          
        return str; 
    }
}