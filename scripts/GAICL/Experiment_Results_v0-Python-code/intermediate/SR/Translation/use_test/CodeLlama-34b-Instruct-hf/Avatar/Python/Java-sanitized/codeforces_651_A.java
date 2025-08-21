import java.util.Scanner;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(calculateSum(x, y));
    }

    public static int calculateSum(int x, int y) {
        return sumD(x, y);
    }

    public static int sumD(int x, int y) {
        return sumC(x, y);
    }

    public static int sumC(int x, int y) {
        return sumB(x, y);
    }

    public static int sumB(int x, int y) {
        return sumA(x, y);
    }

    public static int sumA(int x, int y) {
        return sumE(x, y);
    }

    public static int sumE(int x, int y) {
        return x + y;
    }
}