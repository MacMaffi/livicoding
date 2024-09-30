package Lesson4;

import java.util.Arrays;

//массив цифр, найти максимальное число
public class Task3 {
    public static void main(String[] args) {
        int[] array = {1,5,7,3,9,6};
        System.out.println(maxNumber(array));
    }

    public static StringBuilder maxNumber(int[] arr) {
        Arrays.sort(arr);
        int end = arr.length - 1;
        StringBuilder result = new StringBuilder("");
        for (int i = end; i >= 0; i--) {
            result.append(arr[i]);
        }

        return result;
    }
}
