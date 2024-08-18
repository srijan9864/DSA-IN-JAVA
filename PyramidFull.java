import java.util.Scanner;

public class PyramidFull{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            for( int i = 0; i<n ; i++) {
                for( int k = n - 1 ; k>i ; k--) {
                    System.out.print("-");
                }
                for( int j = 0; j< 2*i + 1 ; j++) {
                    System.out.print("*");
                }
                for( int l = n - 1; l>i ; l--) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
    }
}