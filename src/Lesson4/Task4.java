package Lesson4;

/**
 * Для начала нужно выбрать опорный элемент в массиве.
 * Чаще всего это средний элемент, но также можно выбрать “опору” случайным образом.
 * Проще всего — просто выбрать первый или последний элемент.
 * Начинаем разделение. Делим массив на две части таким образом, что элементы, которые меньше опорного,
 * перемещаются влево от него, а те, которые больше — вправо.
 * Повторение процесса разделения. Повторяем процесс рекурсивно для левой и правой части массива до тех пор,
 * пока каждая часть не будет состоять из одного элемента.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = {4,5,7,3,9,2};
        quickSort(array, 0 , 5);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);


            quickSort(arr, low, pi - 1); // Рекурсивно сортируем элементы слева от опорного
            quickSort(arr, pi + 1, high); // Рекурсивно сортируем элементы справа от опорного
        }
    }


    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Выбираем опорный элемент
        int i = (low - 1); // Индекс меньшего элемента

        for (int j = low; j <= high - 1; j++) {
            // Если текущий элемент меньше или равен опорному
            if (arr[j] <= pivot) {
                i++;

                // Меняем местами arr[i] и arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Меняем местами arr[i + 1] и arr[high] (или опорный элемент)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
