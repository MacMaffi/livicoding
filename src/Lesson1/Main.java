package Lesson1;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,4,6,7,8,3,5};
        reversArray(array);
        for (int num: array) {
            System.out.print(num + ",");
        }
    }

    static void reversArray(int[] array){
        int a;
        int j;

        for(int i = 0; i < array.length / 2; i++) {
            j = (array.length - 1) - i;

            a = array[j];
            array[j] = array[i];
            array[i] = a;
        }
    }
}