package TwoPointer;

public class TwoSumII2 {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { left + 1, right + 1 };
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = twoSum(numbers, target);

        System.out.println(
                "Indices of the two numbers whose sum is equal to the target: [" + result[0] + ", " + result[1] + "]");
    }
}
