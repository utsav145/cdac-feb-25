import java.util.*;

public class SumAverage{
  public static void main(String[] args){
   int[] arr = {1,2,3,4,5};
   int n =arr.length;
   int sum =0;
   int average =0;
   for (int i=0;i<=n-1;i++){
     sum += arr[i];
	 average = sum/(n-1);
     
   }
    System.out.println("Sum of the arr :" +sum);
	System.out.println("Average of arr :" +average);
  }

} 