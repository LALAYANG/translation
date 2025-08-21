import java.util.Scanner;

public class codeforces_146_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = scanner.nextInt();
        }

        int h1 = 0;
        int h2 = 0;
        for (int i = 0; i < n; i++) {
            if (digits[i] != 4 && digits[i] != 7) {
                System.out.println("NO");
                return;
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