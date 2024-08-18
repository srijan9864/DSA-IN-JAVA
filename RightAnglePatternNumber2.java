import java.util.Scanner;

public class RightAnglePatternNumber2{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            for( int i = 0; i<n ; i++) {
                for( int j = 0; j<=i ; j++) {
                    System.out.print(i+1);
                }
                System.out.println();
            }
        }
    }
}