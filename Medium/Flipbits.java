import java.util.* ;
import java.io.*; 
public class Solution {
	public static int flipBits(int[] arr,int n) {
		int one =0;
		for(int i =0;i<n;i++){
			if(arr[i] == 0){
				arr[i] = 1;
			}else{
				arr[i] = -1;
				one++;
			}
		}

		int sum =0;
		int maxSum =Integer.MIN_VALUE;

		for(int i =0 ;i<n;i++){
			sum += arr[i];
			maxSum  = Math.max(maxSum , sum);
			if(sum <0){
				sum =0;
			}
		}
		if(maxSum < 0) maxSum =0;
		 return maxSum +one;
	}
}
