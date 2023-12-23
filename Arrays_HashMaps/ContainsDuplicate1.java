import java.util.*;

public class ContainsDuplicate1 {

    public static boolean conatainsDuplicate(int nums[]) {

        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (s.contains(nums[i])) {
                return true;
            } else {
                s.add(nums[i]);
            }

        }
        return false;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        System.out.println(conatainsDuplicate(nums));

    }
}
