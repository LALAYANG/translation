import java.util.Scanner;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int result = 360 / gcd(360, x);
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}