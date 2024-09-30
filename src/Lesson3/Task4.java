package Lesson3;

import java.util.HashMap;
import java.util.Map;

//Постройте частотный словарь букв русского (или английского) алфавита.
//Опустим проблему выбора и анализа корпуса языка, достаточно будет взять текст небольшой длины.
public class Task4 {
    public static void main(String[] args) {
//        мама мыла раму
//        м - 4
//        а - 4
//        ы - 1
//        л - 1
//        р - 1
//        у - 1
        repeated("Мама мыла раму");
    }

    public static void repeated (String str) {

        char[] chars = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();


        int lowerA = 'а';
        int lowerZ = 'я';
        int upperA = 'А';
        int upperZ = 'Я';

        for (char ch : chars) {
            if ((ch >= lowerA && ch <= lowerZ) || (ch >= upperA && ch <= upperZ)) {
                char lowercaseChar = Character.toLowerCase(ch);
                map.put(lowercaseChar, map.getOrDefault(lowercaseChar, 0) + 1);
            }
        }

        System.out.println(map);
    }
}