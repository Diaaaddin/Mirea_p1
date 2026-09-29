package LAB1;

public class Task3 {
    public static void main(String[] args) {
        // Массив создаётся с помощью инициализации (как в Си)
        int[] numbers = {5, 3, 8, 1, 9, 2, 7};

        int sum = 0;
        // Цикл for: суммируем все элементы массива
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Среднее арифметическое (делим на double, чтобы не потерять дробную часть)
        double average = (double) sum / numbers.length;

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}
