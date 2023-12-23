public class ProductOfArrayItselfSelf6 {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        // Calculate left products
        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // Calculate right products
        right[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // Combine left and right products to get the final result
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = left[i] * right[i];
        }

        return answer;
    }

    // Method to print array values
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = { 1, 2, 3, 4 };

        ProductOfArrayItselfSelf6 solution = new ProductOfArrayItselfSelf6();
        int[] result = solution.productExceptSelf(nums);

        // Print the result array
        System.out.println("Result array:");
        printArray(result);
    }
}
