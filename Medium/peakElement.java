import java.util.* ;
import java.io.*; 
public class Solution {

    public static int findPeak(int n, ArrayList<Integer> arr) {
            int l = 0;
        int h = arr.size()-1;

        while(l < h){
            int mid = (l+h)/2;

            if(arr.get(mid) > arr.get(mid+1)){
                h = mid;
            }else{
                l = mid +1;
            }
        }
        return arr.get(l);
    }
    
}
