class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low =1;
        int high = piles[piles.length-1];
        int ans =0;

        while(low <= high){

            int mid = (low + high)/2;
            long time = timecal(mid , piles);
            if(time <= h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }

    public long timecal(int mid , int piles[]){
        long sum =0;
        for(int i =0; i<piles.length;i++){
            sum += (piles[i]/mid);
            if(piles[i] % mid !=0) sum+=1;
        }
        
        return sum;
    }
}
