Link-https://practice.geeksforgeeks.org/problems/kth-smallest-element/0#

Method-1
(Simple Solution)
A simple solution is to sort the given array using a O(N log N)

..accumulate
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	//code
	int t;
	cin>>t;
	while(t--)
	{
	    int n;cin>>n;
	    int arr[n];
	    for(int i=0;i<n;i++)
	    {
	        cin>>arr[i];
	    }
	    sort(arr,arr+n);
	    int k;
	    cin>>k;
	    cout<<arr[k-1]<<endl;
	}
	return 0;
}



method-2

Link-https://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/
