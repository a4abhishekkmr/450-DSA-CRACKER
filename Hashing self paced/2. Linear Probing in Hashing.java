Linear Probing in Hashing 

Linear probing is a collision handling technique in hashing. Linear probing says that whenever a collision occurs, search for the immediate next position.

Given an array of integers and a hash table size. Fill the array elements into a hash table using Linear Probing to handle collisions.

Example 1:

Input:
hashSize = 10
sizeOfArray = 4 
Array[] = {4,14,24,44}
Output:
-1 -1 -1 -1 4 14 24 44 -1 -1
Explanation: 4%10=4. So put 4 in 
hashtable[4].Now, 14%10=4, but 
hashtable[4] is alreadyfilled so put 
14 in the next slot and so on.





class Solution{
    //Function to fill the array elements into a hash table 
    //using Linear Probing to handle collisions.
    int[] linearProbing(int hash_size, int arr[], int sizeOfArray)
    {
        //Your code here
        int ans[]=new int[hash_size];
        for(int i=0;i<hash_size;i++)
        ans[i]=-1;
        int size=0;
        
        for(int i=0;i<sizeOfArray;i++)
        {
            if(size==hash_size)
            return ans;
            
            int key=arr[i];
            
            int h=hash(key,hash_size);
            
            while(ans[h]!=-1)
            {
                h=(h+1)%hash_size;
            }
                if(ans[h]==key)
                continue;
                
                if(ans[h]==-1)
                {ans[h]=key;
                size++;}
            
        }
        return ans;
    }
    
    int hash(int key,int hash_size)
    {
        return key%hash_size;
    }
}
time comp-O(sizeOfArray)
aux space-O(hash_size)
