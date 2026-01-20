import java.util.*;

public class MaximumGap {
    public static void main(String[] args) {

        int[] nums = {3, 6, 9, 1};
        if (nums.length < 2) {
            System.out.println(0);
            return;
        }

        Arrays.sort(nums);
        int maxGap = 0;

        for (int i = 1; i < nums.length; i++) {
            maxGap = Math.max(maxGap, nums[i] - nums[i - 1]);
        }
        System.out.println(maxGap);
    }
}
