import java.util.*;
public class Solution {
    public static List< Integer > nextGreaterPermutation(List< Integer > permutation) {
         int n= permutation.size();
        
        int ind = -1;
        
        for(int i = n-2; i >=0; i--){
            if(permutation.get(i) < permutation.get(i+1)){
                ind= i;
                break;
            }
        }
        
        if(ind < 0) Collections.sort(permutation);
        else{
            for(int i = n-1; i>=ind; i--){
                if(permutation.get(i)> permutation.get(ind)){
                    Collections.swap(permutation, i, ind);
                    break;
                }
            }
        }
        
        Collections.sort(permutation.subList(ind+1, n));
        return permutation; 
      
    }
}
