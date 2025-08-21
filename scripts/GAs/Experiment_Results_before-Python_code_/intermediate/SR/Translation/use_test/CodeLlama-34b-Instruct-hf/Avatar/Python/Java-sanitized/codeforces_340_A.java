import java.util.Scanner;

public class codeforces_340_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = lcm(x, y);
        int result = (b / lcm) - ((a - 1) / lcm);
        System.out.println(result);
    }

    public static int lcm(int a, int b) {
        while (a % b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return b;
    }
}