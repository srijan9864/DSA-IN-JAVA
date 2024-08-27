import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();

            int number = N;
            int sum = 0;
            int last_digit = 0;
    
            while(number > 0) {
    
                last_digit = number % 10;
                sum = sum + ( last_digit * last_digit * last_digit );
                number = number / 10;
            }
            
            if ( sum == N ) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
