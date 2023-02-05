class Solution {
    public  List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return new ArrayList<Integer>();
        }
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> pmap = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            pmap.put(ch, pmap.getOrDefault(ch, 0) + 1);// making pattern frequency map
        }
        // System.out.println(pmap);
        // First window source map
        for (int i = 0; i < p.length(); i++) {
            char ch = s.charAt(i);
            smap.put(ch, smap.getOrDefault(ch, 0) + 1);
        }
        // System.out.println(smap);
        int i = p.length();
        // shifting of window

        while (i < s.length()) {

            // if both the frequency map is same that means we find an anagram
            if (pmap.equals(smap) == true) {
                ans.add(i - p.length());

            }
            // aqccuire character
            char cha = s.charAt(i);
            smap.put(cha, smap.getOrDefault(cha, 0) + 1);

            // release character
            char chr = s.charAt(i - p.length());
            if (smap.get(chr) == 1) {
                smap.remove(chr);
            } else {
                smap.put(chr, smap.get(chr) - 1);
            }
            i++;

        }
        // for last window
        if (pmap.equals(smap) == true) {
            ans.add(i - p.length());

        }
        return ans;
    }
}
