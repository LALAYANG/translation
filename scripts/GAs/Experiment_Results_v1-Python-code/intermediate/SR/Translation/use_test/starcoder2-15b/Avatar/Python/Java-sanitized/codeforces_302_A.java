import java.util.Scanner;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sa = 0;
        for (int i = 0; i < n; i++) {
            if (scanner.nextInt() == -1) {
                sa++;
            }
        }
        int saMin = Math.min(n - sa, sa);
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int difference = b - a;
            if (difference % 2 == 1 && difference <= saMin * 2) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}