import java.util.Scanner;

public class codeforces_397_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (k / n * a >= k) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}