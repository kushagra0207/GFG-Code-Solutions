class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int j=0;
       for(int i=0;i<n;i++){
           if(arr[i]>arr[j]){
               j=i;
               
           }
       }
       return j;
    }
}
