Link-https://practice.geeksforgeeks.org/problems/union-of-two-arrays/0#


    Example:
Input:
2
5 3
1 2 3 4 5
1 2 3
6 2
85 25 1 32 54 6
85 2
Output:
5
7

============================
    Code in c++;

    The concept is
    taken all the input in one array
    sorted them
    and made then iterate as i=i->next
    if yes then dont count its a union
        if not there then the number is unique
        and actually we are needed unique numbers.



#include <iostream>
using namespace std;
#include <algorithm>
int main() {
	//code
	int t;cin>>t;
	while(t--)
	{
	    int n,m;
	    cin>>n>>m;
	    int ar1[n+m];
	    for(int i=0;i<n+m;i++)
	    {
	        cin>>ar1[i];
	    }
	    sort(ar1,ar1 +m+n);
	    int count=0;
	    for(int i=0;i<m+n-1;i++)
	    {
	        if(ar1[i]!=ar1[i+1])
	        {
	            count++;
	        }
	    }
	    cout<<count+1<<endl;
	}
	return 0;
}
