class Solution{
    void util(ArrayList<Integer> arr , int n , int idx , int sum ,ArrayList<Integer> ds){
        if(idx == n){
            ds.add(sum);
            return ;
        }
        // picking condition
     
        util(arr , n , idx+1 , sum+arr.get(idx), ds );
        //non picking condition
        
        util(arr , n , idx +1 , sum , ds );
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
    ArrayList<Integer> ans = new ArrayList<Integer>();
    util(arr , N , 0 , 0 ,ans);
    return ans;
    }
}
