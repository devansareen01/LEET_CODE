class Solution {
       public  boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
         for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                st.push(str.charAt(i));
            }

            else if (str.charAt(i) == ')') {
                boolean smallAns = conditionChecker(st, '(');
                if (smallAns == false) {
                    return false;
                }
            }

            else if (str.charAt(i) == ']') {
                boolean smallAns = conditionChecker(st, '[');
                if (smallAns == false) {
                    return false;
                }
            }

            else if (str.charAt(i) == '}') {
                boolean smallAns = conditionChecker(st, '{');
                if (smallAns == false) {
                    return false;
                }
            }

        }
        if (st.size() == 0) {
            return true;
        }

        else {
            return false;
        }
    }

    public  boolean conditionChecker(Stack<Character> s, char ch) {
        if (s.size() == 0) {
            return false;
        } else if (ch != s.peek()) {
            return false;
        } else {
            s.pop();
            return true;
        }

    }

}
