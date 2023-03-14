class Solution {
    
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
	    
        int prev = cost[0];
        int prev2 = cost[1];
        for(int i =1 ;i<n ;i++){
            int one = cost[i] + prev;
            int two = cost[i];
            if(i>1 ) two += prev2;  
            
            int curr = Math.min(one, two);
            prev2 = prev;
            prev = curr;
        }
        return Math.min(prev ,prev2);
    }
    // time complexity --O(n);
    //space complexity--O(1);
}
