import java.util.Arrays;

public class P5 {
    public static void segregateElements(int arr[], int n) {
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            // Find the first negative element from the left
            while (left <= right && arr[left] <= 0) {
                left++;
            }

            // Find the first positive or zero element from the right
            while (left <= right && arr[right] > 0) {
                right--;
            }

            // Swap the found negative and positive/zero elements
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = { -8, 9, 5, 10, 2, 6, -7, 7 };
        int n = arr.length;

        System.out.println("Original Array: " + Arrays.toString(arr));

        segregateElements(arr, n);

        System.out.println("Segregated Array: " + Arrays.toString(arr));
    }
}
