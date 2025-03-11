public class largest_smallest {
    public static void main(String[] args) {
		int[] arr = {2,1,3,6,5};
		int m =0;
		int n =0;
		for (int i=0; i<5; i++){
			if(arr[i]>m){
				m=arr[i];
			}
			if (arr[i]<n){
				n=arr[i];
			}
		}
		System.out.println(m);
		System.out.println(n);
	}
}