public class bs {
    static int lowerBound(int arr[], int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return right + 1;
    }

    static int upperBound(int arr[], int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid + 1;
            else if (target > arr[mid])
                left = mid + 1;
            else
                right = mid - 1;

        }
        return right + 1;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7 };
        int arr2[] = { 1, 3, 4, 5, 6, 7, 8 };
        System.out.println(upperBound(arr2, 0, 6, 2));
    }
}
