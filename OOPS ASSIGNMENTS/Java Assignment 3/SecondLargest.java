import java.util.*;

public class SecondLargest{
 public static void main(String[] args){
   int[] arr= {1,2,3,4,5};
   int n =arr.length;
   int largest =arr[0];
   int second_largest=arr[0];
   int k=0;
   
    for(int i=0; i<5; i++){
     if(arr[i]>largest){
	  largest=arr[i];
	 }  
   
    for (int j=0; j<5; j++){
	   if (arr[j]>= second_largest && arr[j] < largest ){
	   second_largest=arr[j];
	 }
	}    
   }   
   System.out.println(largest);
   System.out.println(second_largest);
 }

}