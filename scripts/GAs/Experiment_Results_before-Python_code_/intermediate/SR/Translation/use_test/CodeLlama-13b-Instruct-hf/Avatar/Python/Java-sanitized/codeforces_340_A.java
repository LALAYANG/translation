import java.util.Scanner;

public class codeforces_340_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);

        int lcm = L(x, y);
        int result = b / lcm - (a - 1) / lcm;
        System.out.println(result);
    }

    public static int L(int x, int y) {
        int gcd = G(x, y);
        return x * y / gcd;
    }

    public static int G(int a, int b) {
        while (a % b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return b;
    }
}