package Lesson5;

//int a = 10; int b = 5 поменять местами
public class Task2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}
