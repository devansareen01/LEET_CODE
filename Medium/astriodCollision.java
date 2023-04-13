class Solution {
     public void rvereseArray(int arr[], int start, int end) {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        rvereseArray(arr, start + 1, end - 1);
    }

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0 || st.isEmpty()) {
                st.push(asteroids[i]);
            } else {
                while (true) {
                    int top = st.peek();
                    if (top < 0) {  // if both are negative means in same direction then it will not destryoed
                        st.push(asteroids[i]);
                        break;
                    } else if (top == -asteroids[i]) {// if equal they both will destryoed
                        st.pop();
                        break;
                    } else if (top > -asteroids[i]) {// smaller will detroyed
                        break;
                    } else {
                        st.pop();
                        if (st.isEmpty()) {// smaller will destroyed and check prveious smaller element
                            st.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }

        }
        int ans[] = new int[st.size()];
        int i = 0;
        while (!st.isEmpty()) {
            ans[i] = st.peek();
            st.pop();
            i++;
        }
        rvereseArray(ans, 0, ans.length - 1);
        return ans;
    }
}
