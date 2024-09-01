import java.util.Scanner;

public class RecursionCubicSum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            System.out.print(sumOfSeries(n));
        }
    }

    public static long sumOfSeries(int n) {
        if (n > 0) {
            return n * n * n + sumOfSeries(n - 1);
        } else {
            return n;
        }
    }
}
