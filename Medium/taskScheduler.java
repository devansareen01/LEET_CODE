class Solution {
    public int leastInterval(char[] tasks, int n) {
        int arr[] = new int[27];
        for(int i=0;i<tasks.length;i++){
           char ch = tasks[i];
            arr[ch-'A']++;
        }
    Arrays.sort(arr);
    int ideal = (arr[arr.length-1]-1) * n;
        for(int i =1; i<arr.length-1;i++){
            ideal = ideal -Math.min(arr[arr.length-1]-1 , arr[i]);
        }
        return (tasks.length + Math.max(0,ideal));
    }
    
}
