import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    for(int i=0;i<T;i++){
	        int N = sc.nextInt();
	        int A[] = new int[N];
	        for(int j=0;j<N;j++){
	            A[j]=sc.nextInt();
	        }
	        int temp=0;
	        int low=0;
	        int high=N-1;
	        
	        while(low<high){
	            temp=A[high];
	            A[high]=A[low];
	            A[low]=temp;
	            low++;
	            high--;
	        }
	        for(int l=0;l<N;l++){
	            System.out.print(A[l] + " ");
	            
	        }
	        System.out.println();
	    }
		//code
	}
}
