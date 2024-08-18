import java.util.Scanner;

public class RightAnglePatternInverted{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for( int i = n-1; i>=0 ; i--) {
            for( int j = 0; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}