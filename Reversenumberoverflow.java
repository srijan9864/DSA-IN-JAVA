import java.util.Scanner;

public class Reversenumberoverflow {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int x = scanner.nextInt();
            int number = Math.abs(x);
            int last_digit = 0;
            int rev_number = 0;
            int INT_MIN = -2147483648; // -2^31
            int INT_MAX = 2147483647; // 2^31 - 1
            while (number > 0) {
                last_digit = number % 10;
                // Check for overflow before adding the next digit
                if (rev_number > INT_MAX / 10 || (rev_number == INT_MAX / 10 && last_digit > 7)) {
                    System.out.println(0);
                }
                if (rev_number < INT_MIN / 10 || (rev_number == INT_MIN / 10 && last_digit < -8)) {
                    System.out.println(0);
                }
                rev_number = rev_number * 10 + last_digit;
                number = number / 10;
            }
            if (x < 0) {
                System.out.println(-1 * rev_number);
            } else {
                System.out.println(rev_number);
            }
        }
    }
}
