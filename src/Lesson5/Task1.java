package Lesson5;

//Напишите Java-программу, чтобы найти второе по величине число в массиве
public class Task1 {
    public static void main(String[] args) {
        int[] array = {4,6,1,7,11,8,11};

        int max1 = 0;
        int max2 = 0;

        for (int num : array) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

        System.out.println(max2);
    }
}
