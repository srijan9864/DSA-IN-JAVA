import java.util.Scanner;

public class RightAnglePatternInvertedNumber{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            for( int i = n-1; i>=0 ; i--) {
                for( int j = 0; j<=i ; j++) {
                    System.out.print(j+1);
                }
                System.out.println();
            }
        }
    }
}