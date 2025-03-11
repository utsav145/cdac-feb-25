import java.util.*;

public class Count_Even_Odd{
 public static void main(String[] args){
   int[] arr = new int[5];
   Scanner sc= new Scanner(System.in);
   int Count_even=0;
   int Count_odd =0;
   for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
   
   int n=arr.length;
   for(int j=0;j<=n-1;j++){
	   
     if(arr[j]%2==0){
	   Count_even +=1;	   
	 } else{
	   Count_odd +=1;
	 }
   }  
   System.out.println("Count of even numbera is:" +Count_even); 
   System.out.println("Count of odd numbers is:"+Count_odd); 
 }

}

