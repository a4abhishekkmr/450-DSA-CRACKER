Find the maximum and minimum element in an array


Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

Example 1:

Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max =  10000

Solution>>

Time Complexity - O(nlog n)

class Compute{
static pair getMinMax(long a[], long n){
Arrays.sort(a);
return new pair(a[0],a[(int)(n-1)]);
}
}

Time Complexity - O(log n)

class Compute{
static pair getMinMax(long a[], long n){

long min = a[0];
long max = a[0];

for(int i=1;i < n;i++){
if(min > a[i]) min = a[i];
if(max < a[i]) max=a[i];
}

return new pair( min , max);
}
}