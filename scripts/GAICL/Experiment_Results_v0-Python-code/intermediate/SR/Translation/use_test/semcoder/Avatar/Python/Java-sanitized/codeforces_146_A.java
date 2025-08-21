import java.util.Scanner;

public class codeforces_146_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String number = scanner.next();
        int h1 = 0, h2 = 0, x = 0;

        for (int i = 0; i < n; i++) {
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            if (digit != 4 && digit != 7) {
                System.out.println("NO");
                x = 1;
                break;
            }
            if (i < n / 2) {
                h1 += digit;
            } else {
                h2 += digit;
            }
        }

        if (x == 0) {
            if (h1 == h2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}