class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
       HashMap<Character,Integer> map = new HashMap<>();

       for(int i =0 ;i< s.length(); i++){
            char ch  = s.charAt(i);
            map.put(ch ,map.getOrDefault(ch , 0 )+1);// adding in hashmap string 1
       }

       for(int i = 0 ; i<t.length(); i++){  // subtracting STring 2 from string 1
           char ch  =   t.charAt(i);

           if(map.containsKey(ch) == false){
               return false;
           }else if(map.get(ch) == 1){// if frequency is one then remove
               map.remove(ch);
           }else{
               map.put(ch, map.get(ch)-1);//else subtrac the frequency by one
           }
       }
       return map.size()==0;// return map is empty or not 
    }
}
