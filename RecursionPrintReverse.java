import java.util.Scanner;

public class RecursionPrintReverse {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            printNos(N);
        }
    }

    public static void printNos(int N) {
        if (N > 0) {
            System.out.print(N + " ");
            printNos(N - 1);
        }
    }
}
