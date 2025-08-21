import java.util.Scanner;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(Math.max(calculateSum(x, y) - 3 + ((y - x) % 3 > 0 ? 1 : 0), 0));
    }

    public static int calculateSum(int a, int b) {
        return sumD(a, b);
    }

    public static int sumD(int a, int b) {
        return sumC(a, b);
    }

    public static int sumC(int a, int b) {
        return sumA(a, b);
    }

    public static int sumA(int a, int b) {
        return sumE(a, b);
    }

    public static int sumE(int a, int b) {
        return a + b;
    }

    public static int sumB(int a, int b) {
        return sumC(a, b);
    }
}