package Lesson2;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZeroes {

    public static void main(String[] args) {
        Stream<Integer> randomGenarate = Stream.generate(()-> new Random().nextInt(100));

        System.out.println(randomGenarate
                .filter(n -> n % 2 == 0)
                .distinct()
                .limit(20)
                .sorted((x, y) -> y - x)
                .collect(Collectors.toList()));

    }
        public static void moveZeroes(int[] nums) {
        int nullPosit = 0;
        for (int i = 0; i < nums.length; i++) {

                if (nums[i] == 0) {
                    nullPosit = i;
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[j] != 0) {
                            int temp = nums[j];
                            nums[j] = 0;
                            nums[nullPosit] = temp;
                            break;
                        }
                    }
                }
            }
        }

        public static void task13() {
//            Получить 20 рандомных чисел в диапазоне до 100, убрать все нечетные числа, оставить только уникальные, отсортировать по убыванию, результаты в лист собрать

        }
    }