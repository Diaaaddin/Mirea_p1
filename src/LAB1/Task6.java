package LAB1;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Первые 10 членов гармонического ряда:");

        // Гармонический ряд: 1, 1/2, 1/3, ..., 1/n
        for (int n = 1; n <= 10; n++) {
            double value = 1.0 / n;
            // Форматированный вывод: 5 знаков после запятой
            System.out.printf("1/%-2d = %.5f%n", n, value);
        }
    }
}
