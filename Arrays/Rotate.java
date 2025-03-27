class Solution {
    void leftRotate(int arr[], int d) {
        int n = arr.length;
        if (n == 0 || d % n == 0) return; // If empty or full cycle, no need to rotate
        d = d % n; // Handle cases where d > n

        reverse(arr, 0, d - 1);  // Reverse first d elements
        reverse(arr, d, n - 1);  // Reverse the remaining elements
        reverse(arr, 0, n - 1);  // Reverse the entire array
    }

    void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        
        sol.leftRotate(arr, d);
        
        // Print rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
