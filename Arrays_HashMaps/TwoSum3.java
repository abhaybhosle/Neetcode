import java.util.*;

public class TwoSum3 {

    public static int[] twoSum(int nums[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                return new int[] { map.get(compliment), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        int target = 3;

        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
