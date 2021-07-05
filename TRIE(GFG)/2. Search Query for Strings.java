Trie is an efficient information retrieval data structure. Use this data structure to store strings and search strings. In this problem, you are given an array of strings (consisting of lowercase characters) arr[] of size N. Also, you will be given some queries Q and for each query a string is given and your task is to check if the given string is in the string array or not.

Note: Each word in the array of string can be of size 103.

Example 1:

Input:
N = 8, Q = 3
words[] = {the,a,there,answer,any,by,bye
their}
Queries[] = {the,an,any}
Output:
1
0
1
Explanation: After inserting words in the
array,all the words will be stored. Now
searching for the will result in 1
(present), an will resultin 0(not present)
and any will result in 1 (present).
  
  
  Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
N = length of the string




//Function to insert string into TRIE.
static void insert(String key) 
{
    // Your code here
    
    TrieNode curr=root;
    for(int i=0;i<key.length();i++)
    {
        int index=key.charAt(i)-'a';
        if(curr.children[index]==null)
        curr.children[index]=new TrieNode();
        curr=curr.children[index];
    }
    curr.isEndOfWord=true;
}

//Function to use TRIE data structure and search the given string.
static boolean search(String key)
{
    // Your code here
    //static helps here to get root
    TrieNode curr=root;
    for(int i=0;i<key.length();i++)
    {
        int index=key.charAt(i)-'a';
        if(curr.children[index]==null)
        return false;
        curr=curr.children[index];
    }
    return (curr.isEndOfWord && curr!=null);
    
}
//TC=O(n)
