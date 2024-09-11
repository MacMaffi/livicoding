package Lesson1;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String st = "This This task task will be solved by by by Java developer developer";

        String[] words = st.split(" ");

        Map<String, Integer> repeatedWord = new HashMap<>();

        for (String word : words) {
            repeatedWord.put(word, repeatedWord.getOrDefault(word, 0) + 1);
        }

        System.out.println(repeatedWord);
    }
}
