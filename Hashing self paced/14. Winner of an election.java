Given an array of names (consisting of lowercase characters) of candidates in an election. A candidate name in array represents a vote casted to the candidate. Print the name of candidate that received Max votes. If there is tie, print lexicographically smaller name.

Example 1:

Input:
n = 13
Votes[] = {john,johnny,jackie,johnny,john 
jackie,jamie,jamie,john,johnny,jamie,
johnny,john}
Output: john 4
Explanation: john has 4 votes casted for 
him, but so does johny. john is 
lexicographically smaller, so we print 
john and the votes he received.


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String a[], int n)
    {
        // add your code
        String str[]=new String[2];
        HashMap<String,Integer> map=new HashMap<>();
        
        for(int x=0;x<n;x++)
        map.put(a[x], map.getOrDefault(a[x],0)+1);
        
        int max=0;
        String winner="";
        for ( Map.Entry<String, Integer> entry : map.entrySet()) {
        String name = entry.getKey();
        Integer vote = entry.getValue();
        
        
        if(vote>max)
        {
            max=vote;
            winner=name;
        }
        
        else if(vote==max && winner.compareTo(name)>0)
        winner=name;
        }
        str[0]=winner;
        str[1]=Integer.toString(max);
        
        return str;
    }
}
//Time Complexity: O(n)
//Auxiliary Space: O(n)