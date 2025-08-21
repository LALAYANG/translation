import java.util.Scanner;

public class codeforces_340_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int gcd = G(x, y);
        int lcm = L(x, y);
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    private static int G(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    private static int L(int a, int b) {
        return a * b / G(a, b);
    }
}