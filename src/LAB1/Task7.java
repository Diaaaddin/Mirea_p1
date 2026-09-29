package LAB1;

public class Task7 {

    // Метод вычисляет факториал числа n с помощью цикла
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определён только для n >= 0");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Проверка работы метода
        for (int n = 0; n <= 10; n++) {
            System.out.println(n + "! = " + factorial(n));
        }
        // 5! = 120, 10! = 3628800
    }
}
