import java.util.Scanner;

public class GCDLCM {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            long A = scanner.nextLong();
            long B = scanner.nextLong();

            Long[] list = new Long[2];
            long a = A;
            long b = B;
            
            while(a > 0 && b > 0 ) {
                
                if(a > b) {
                    a = a % b;
                } else {
                    b = b % a;
                }
                
            }
            
            if (a == 0) {
                list[1] = b;
                list[0] = (A * B) / b; 
            } else {
                list[1] = a;
                list[0] = (A * B) / a; 
            }
            System.out.println(list);
        }
    }
}
