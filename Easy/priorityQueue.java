class Solution {
      public long pickGifts(int[] gifts, int k) {
        // long ans[] = new long[gifts.length];
        long ans = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < gifts.length; i++) {
            pq.add((long)gifts[i]);
        }
        while (k-- > 0) {
            long y = (int)Math.sqrt(pq.remove());
            pq.add(y);
        }
        while (!pq.isEmpty()) {
            ans += pq.remove();
        }
        return ans;
    }
}
