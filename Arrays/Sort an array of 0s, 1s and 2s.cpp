Link-https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0

#include <iostream>
using namespace std;

int main() {
	//code
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    int arr[n];
	    for(int i=0;i<n;i++)
	    {
	        cin>>arr[i];
	    }
	    int count0=0,count1=0;
	    for(int i=0;i<n;i++)
	    {
	        if (arr[i]==0)
	        count0++;
	    }
	    for(int i=0;i<n;i++)
	    {
	        if (arr[i]==1)
	        count1++;
	    }

	    for(int i=0;i<count0;i++)
	    {
	        cout<<"0 ";
	    }
	    for(int i=0;i<count1;i++)
	    {
	        cout<<"1 ";
	    }
	    for(int i=0;i<n-count1-count0;i++)
	    {
	        cout<<"2 ";
	    }
	    cout<<endl;
	}
	return 0;
}
