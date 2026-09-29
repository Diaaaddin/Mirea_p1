package LAB1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Сумма с помощью цикла while
        int sumWhile = 0;
        int i = 0;
        while (i < arr.length) {
            sumWhile += arr[i];
            i++;
        }

        // Сумма с помощью цикла do while
        // (массив не пустой, поэтому тело выполнится хотя бы один раз корректно)
        int sumDoWhile = 0;
        int j = 0;
        if (arr.length > 0) {
            do {
                sumDoWhile += arr[j];
                j++;
            } while (j < arr.length);
        }

        // Поиск максимального и минимального элементов
        int max = arr[0];
        int min = arr[0];
        for (int k = 1; k < arr.length; k++) {
            if (arr[k] > max) {
                max = arr[k];
            }
            if (arr[k] < min) {
                min = arr[k];
            }
        }

        System.out.println("Сумма (while): " + sumWhile);
        System.out.println("Сумма (do while): " + sumDoWhile);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}
