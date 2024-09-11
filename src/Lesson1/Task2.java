package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
//        System.out.println(checkString("()"));
//        System.out.println(checkString("(()))"));
//        System.out.println(checkString("((()))"));
//        System.out.println(checkString(")("));
        task5();
    }

    //отфильтровать по А, сделать большие буквы, сортировка
    public static void task1() {
        List<String> towns = Arrays.asList("Москва","Архангельск","Астрахань","Минск","Антверпен");

        towns.stream()
                .filter(town -> town.startsWith("А"))
                .map(town -> town.toUpperCase())
                .sorted()
                .forEach(System.out::println);
    }

    //сделать мапу, где ключ длина символов, а значение список слов такой длины
    public static void task2() {
        List<String> strings = List.of("string", "apple", "banana", "cat", "dog", "Java",
                "hello", "world", "compiler", "car", "home", "");

        Map<Integer , List<String>> map = new HashMap<>();

        map = strings.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(map);
    }

    //сделать мапу, где ключ длина, а значение количество слов такой длины
    public static void task3() {
        List<String> strings = List.of("string", "apple", "banana", "cat", "dog", "Java",
                "hello", "world", "compiler", "car", "home", "");

        Map<Integer, Long> map = new HashMap<>();

        map = strings.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        System.out.println(map);
    }

    //есть ли повторы
    public static boolean task4() {
        int[] nums = {1, 2, 3, 7, 3};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    //проверка валидности
    public static boolean checkString(String str) {
        if (str.startsWith(")") || str.length() % 2 != 0) {
            return false;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
            }
        }

        if (count != 0 || count < 0) {
            return false;
        }

        return true;
    }

    //перенести нули в конец
    public static void moveZeroes(int[] numbers) {
        // Внешний цикл проходит по каждому элементу массива
        for (int i = 0; i < numbers.length; i++) {
            boolean isChanged = false;  // Флаг для отслеживания, были ли перемещения в этой итерации

            // Внутренний цикл проверяет каждый элемент и перемещает нули вправо
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] == 0) {  // Если найден ноль
                    // Меняем местами ноль и следующий элемент
                    int temp = numbers[j + 1];
                    numbers[j] = temp;
                    numbers[j + 1] = 0;
                    isChanged = true;  // Устанавливаем флаг, что было изменение
                }
            }

            // Если в этой итерации не было изменений, цикл можно завершить
            if (!isChanged) {
                break;  // Выход из внешнего цикла, так как больше не нужно перемещать элементы
            }
        }
    }

    //Определить все ли числа положительные
    public static void task5() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean isPositive = numbers.stream()
                .allMatch(num -> num > 0);
        System.out.println(isPositive);
    }
}
