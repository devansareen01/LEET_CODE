class Solution {
  public boolean checkInclusion(String s1, String s2) {
        int map [] = new int[26];// character array

        int i = 0 , j = 0, total_chars = s1.length();

        for(char c : s1.toCharArray()){
            map[c-'a']++;
        }
        while(j < s2.length()){
            if(map[s2.charAt(j) -'a' ]-- > 0){ // if s2 character is present in s1 than decrease in character array and   
                                                //make  total char -- (mtlb ik character mil gya)
             total_chars--;
            }
            j++;
            if(total_chars == 0){// if all the characters are present then return true blindly
                return true;
            }
            if(j-i == s1.length() ){// shifting window -1.increasing total_chars and updating character array
                 if(map[s2.charAt(i)-'a']++ >= 0)
                    total_chars++;
                i++;
            }
           
        }
        return false;
    }
}
