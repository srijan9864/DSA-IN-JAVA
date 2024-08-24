import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();

            int number = N;
            int reversed = 0;
            int last_digit = 0;
    
            while(number > 0) {
    
                last_digit = number % 10;
                reversed = reversed * 10 + last_digit;
                number = number / 10;
            }
            
            if ( reversed == N ) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
