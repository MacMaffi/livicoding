package Lesson3;

//Написать программу на Java для вычисления серии чисел Фибоначчи
public class Task3 {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 ....
        fibonacci(15);
    }

    public static void fibonacci (int length) {
        int first = 0;
        int second = 0;
        int sum = 1;

        for (int i = 0; i < length; i++) {
            first = second;
            second = sum;
            sum = first + second;
          System.out.println(first);
        }
    }
}
