package Lesson4;

//Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от A до B включительно,
//в порядке возрастания, если A < B, или в порядке убывания в противном случае.
public class Task2 {
    public static void main(String[] args) {
        System.out.println(recurs(5, 10));
    }

    public static String recurs(int a, int b) {

        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a +  " " + recurs(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a +  " " + recurs(a + 1, b);
        }
    }
}
