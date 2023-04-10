public class Solution {
    public static int search(int arr[], int key) {
        int n = arr.length - 1;
        int low = 0;
        int high = n ;

    
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;

            if (arr[low] <= arr[mid]) {// left half sorted
                if (key >= arr[low] && key <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {// it means right pard sorted
                if (key >= arr[mid] && key <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

        }
        return -1;
    }
}
