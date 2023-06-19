
/**
 * all aub-array
 * all sub-string
 * all sub-sequence
 * all sub-set
 */

import java.util.*;

public class Main {
    static void allSubArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            ArrayList<Integer> ar = new ArrayList<>();
            for (int j = i; j < n; ++j) {
                ar.add(arr[j]);

                for (var e : ar)
                    System.out.print(e + " ");
                System.out.println();
            }
        }
    }

    static void allString(String str) {
        int n = str.length();
        for (int i = 0; i < n; ++i) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < n; ++j) {
                sb.append(str.charAt(j));

                for (var e : sb.toString().toCharArray())
                    System.out.print(e + " ");
                System.out.println();
            }
        }
    }

    static void helper(int arr[], int l, int r, ArrayList<Integer> ls) {
        // base case
        if (l == r) {
            ls.add(arr[l]);

            for (var e : ls)
                System.out.print(e + " ");
            System.out.println();
            return;
        }

        helper(arr, l + 1, r, ls);
        ls.add(arr[l]);
        helper(arr, l + 1, r, ls);
    }

    static void allSubset(int arr[]) {
        helper(arr, 0, arr.length - 1, new ArrayList<Integer>());
    }

    public static void main(String[] args) {
        int arr[] = { 7, 4, 5, 3 };
        String str = "name";
        // allSubArray(arr);
        // allString(str);
        allSubset(arr);
    }

}

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < nums[right] && nums[mid] > nums[left]) {
                if (target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else if (nums[i] < nums[right]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}