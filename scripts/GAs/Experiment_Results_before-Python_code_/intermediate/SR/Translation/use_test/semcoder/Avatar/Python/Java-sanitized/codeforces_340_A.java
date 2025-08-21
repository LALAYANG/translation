import java.util.Scanner;

public class codeforces_340_A {
    public static int GCD(int a, int b) {
        while (a % b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);

        int lcm = LCM(x, y);
        int result = b / lcm - (a - 1) / lcm;

        System.out.println(result);
    }
}