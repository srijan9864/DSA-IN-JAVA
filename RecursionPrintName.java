import java.util.Scanner;

public class RecursionPrintName {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            printNos(N);
        }
    }
    public static void printNos(int N)
    {
       if(N > 0) {
       printNos(N-1);
       
       System.out.print("Srijan ");
       }
    }
}
