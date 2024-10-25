import java.util.Scanner;

public class codeforces_146_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String number = scanner.next();
        int h1 = 0;
        int h2 = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (number.charAt(i) != '4' && number.charAt(i) != '7') {
                System.out.println("NO");
                x += 1;
                break;
            }
            if (i < n / 2) {
                h1 += number.charAt(i) - '0';
            } else {
                h2 += number.charAt(i) - '0';
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