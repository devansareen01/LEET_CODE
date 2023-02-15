class Solution {
    public boolean isPalindrome(int x) {
       String str =String.valueOf(x);
    //    StringBuilder str1 = new StringBuilder();
       StringBuilder str2 = new StringBuilder();
    //    str1.append(str);
       str2.append(str);
       str2.reverse();
       if(str.equals(str2.toString())){
           return true;
       }else{
           return false;
       }
    }
}
