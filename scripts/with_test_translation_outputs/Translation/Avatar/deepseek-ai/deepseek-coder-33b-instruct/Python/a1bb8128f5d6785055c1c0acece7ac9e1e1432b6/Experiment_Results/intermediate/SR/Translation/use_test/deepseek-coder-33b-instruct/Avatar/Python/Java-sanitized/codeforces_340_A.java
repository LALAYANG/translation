import java.util.Scanner;

public class codeforces_340_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        long x = Long.parseLong(input[0]);
        long y = Long.parseLong(input[1]);
        long a = Long.parseLong(input[2]);
        long b = Long.parseLong(input[3]);

        long lcm = L(x, y);
        System.out.println((b / lcm) - ((a - 1) / lcm));
    }

    public static long G(long a, long b) {
        while (a % b != 0) {
            long temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    public static long L(long a, long b) {
        return (a * b) / G(a, b);
    }
}