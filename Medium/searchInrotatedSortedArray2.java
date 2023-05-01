class Solution {
     public boolean search(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return true;
            if (arr[mid] == arr[low]) {
                low += 1;
                continue;
            } else if (arr[low] <= arr[mid]) {// left half sorted
                if (key >= arr[low] && key <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] <= arr[high]) {// it means right pard sorted
                if (key >= arr[mid] && key <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                high = high - 1;
            }

        }
        return false;
    }
}
