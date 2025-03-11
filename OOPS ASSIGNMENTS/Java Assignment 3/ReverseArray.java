import java.util.*;

public class ReverseArray{
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5};
		int n= arr.length;
		int start = 0;
        int end = n-1;		
        for (int j=0; j <end/2; j++ ){		  	
		  arr[j-start] =arr[end-j]^arr[j-start];
		  arr[end-j] =arr[end-j]^arr[j-start];
          arr[j-start] =arr[end-j]^arr[j-start];	  
		}	
		
		for (int i: arr){
			System.out.println(i);
		}
        
	}
 }