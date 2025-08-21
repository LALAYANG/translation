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

    public static int sumD(int arg0, int arg1) {
        return sumC(arg0, arg1);
    }

    public static int sumC(int arg0, int arg1) {
        return sumB(arg0, arg1);
    }

    public static int sumB(int arg0, int arg1) {
        return sumA(arg0, arg1);
    }

    public static int sumA(int arg0, int arg1) {
        return sumE(arg0, arg1);
    }

    public static int sumE(int arg0, int arg1) {
        return arg0 + arg1;
    }
}