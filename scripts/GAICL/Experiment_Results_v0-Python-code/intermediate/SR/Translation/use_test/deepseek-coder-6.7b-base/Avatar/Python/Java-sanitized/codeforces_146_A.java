import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_146_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String number = scanner.next();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        int h1 = 0;
        int h2 = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (digits[i] != 4 && digits[i] != 7) {
                System.out.println("NO");
                x = 1;
                break;
            }
            if (i < n / 2) {
                h1 += digits[i];
            } else {
                h2 += digits[i];
            }
        }
        if (h1 == h2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}