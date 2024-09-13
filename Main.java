/**
 * Лабораторная работа №1
 *
 * @author Илья Зайцев 3312
 * @version 1.0
 *
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 14, 56, 67, 78, 90, 189, 4, 1234, 901};
        bubble_sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    /**
     *
     * @param arr статический массив целочисленных элементов
     *
     */
    public static void bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}