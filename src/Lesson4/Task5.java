package Lesson4;

import java.util.ArrayList;
import java.util.Stack;

public class Task5 {
    public static String deleteslash(String str) {
        String[] array = str.split("/");  // Разбиваем строку на части
        int n = array.length;
        String[] result = new String[n];  // Массив для нормализованного пути
        int index = 0;  // Указатель на текущую позицию в массиве result

        for (int i = 0; i < n; i++) {
            if (array[i].equals("") || array[i].equals(".")) {
                // Игнорируем пустые строки и текущие директории "."
                continue;
            } else if (array[i].equals("..")) {
                // Если "..", удаляем предыдущую директорию, если она есть
                if (index > 0) {
                    index--;
                }
            } else {
                // Добавляем часть пути в массив
                result[index] = array[i];
                index++;
            }
        }

        // Собираем строку из массива
        StringBuilder normalizedPath = new StringBuilder();
        for (int i = 0; i < index; i++) {
            normalizedPath.append("/").append(result[i]);
        }

        // Если результат пуст, возвращаем "/"
        return normalizedPath.length() > 0 ? normalizedPath.toString() : "/";
    }

    public static void main(String[] args) {
        String rrr = "/var/log/../tmp/././tmp2/tmp3/../tmp";
        String normalizedPath = deleteslash(rrr);
        System.out.println(normalizedPath);  // Ожидаемый результат: /var/tmp/tmp2/tmp
    }
}
