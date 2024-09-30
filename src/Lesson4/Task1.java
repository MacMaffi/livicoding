package Lesson4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {3,4,7,8,2,1};
        reverse(array);
    }

    public static void reverse(int[] nums) {
        int length = nums.length / 2;
        int index = nums.length - 1;
        for (int i = 0; i < length; i++) {
            int temp = nums[i];
            nums[i] = nums[index - i];
            nums[index - i] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
