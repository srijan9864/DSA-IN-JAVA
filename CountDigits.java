import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            int number = N;
            int last_digit = 0;
            int answer = 0;
            while (number > 0) {
                last_digit = number % 10;
                if (last_digit != 0 && N % last_digit == 0) {
                    answer += 1;
                }

                number = number / 10;

            }

            System.out.println(answer);
        }
    }
}
