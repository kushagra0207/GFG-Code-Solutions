class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        int j=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(a[i]>a[j]){
                j=i;
            }
            else if(a[i]<a[k]){
                k=i;
            }
        }
        long min=a[k];
        long max=a[j];
        return new pair(min,max);
    }
}
