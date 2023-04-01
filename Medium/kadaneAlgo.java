class Solution {


    public int maximumCostSubstring(String s, String chars, int[] vals) {
       int arr[] = new int[26];
        Arrays.fill(arr ,1001);
       for(int i =0 ;i<vals.length;i++){
           char ch = chars.charAt(i);
           arr[(ch-'a')]=vals[i];
       }

       for(int i =0 ;i<26;i++){
           
           if(arr[i]==1001){
               arr[i] = i+1;
           }
       }
        int sum=0;
        int maxSum =Integer.MIN_VALUE;
       for(int i =0;i<s.length();i++){
           sum+=arr[s.charAt(i)-'a'];
           maxSum = Math.max(maxSum,sum);
           if(sum<0){
               sum=0;
           }
       }
      if(maxSum <0)return 0 ;
      else return  maxSum;
    }
}
