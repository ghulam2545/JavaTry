// Given a m x n matrix grid which is sorted in non-increasing order both
// row-wise and column-wise, return the number of negative numbers in grid.

class Solution {
    static int index(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return right + 1;
    }

    public int countNegatives(int[][] arr) {
        int ans = 0;
        int rows = arr.length;
        for (int i = 0; i < rows; ++i) {
            int curr[] = arr[i];
            int pos = index(curr);
            int n = curr.length;
            if (pos >= n)
                ans += 0;
            else
                ans += (n - pos);
        }

        return ans;
    }
}