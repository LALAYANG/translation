import java.util.Scanner;

public class codeforces_146_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String number = scanner.next();
        int h1 = 0;
        int h2 = 0;
        boolean x = false;
        for (int i = 0; i < n; i++) {
            char c = number.charAt(i);
            if (c != '4' && c != '7') {
                System.out.println("NO");
                x = true;
                break;
            }
            if (i < n / 2) {
                h1 += c - '0';
            } else {
                h2 += c - '0';
            }
        }
        if (!x) {
            if (h1 == h2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}