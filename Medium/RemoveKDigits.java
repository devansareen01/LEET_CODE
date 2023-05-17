class Solution {
    public String removeKdigits(String num, int k) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        String ans  = "";
        for(int i =0; i<num.length(); i++){
            char curr_ele = num.charAt(i);
            
            if(stack.isEmpty()) stack.push( curr_ele);
            else{
                while(!stack.isEmpty() && stack.peek() > curr_ele && k>0){
                    stack.pop();
                    k--;
                }
                stack.push(curr_ele);
            }
            
        }
        
        while(k>0){
            stack.pop();
            k--;
        }
        
        if(stack.isEmpty()) return "0";
        
        while(!stack.isEmpty()){
            ans =  stack.pop()+ ans;
        }
        
        int i =0; 
        while( i<ans.length() && ans.charAt(i) =='0') i++;
        
       
            if(ans.substring(i) =="") return "0";
          return ans.substring(i);
    }
  
}
