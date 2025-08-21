import java.util.Scanner;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(lcm(360, x));
    }

    // Function to calculate gcd
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Function to calculate lcm
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}