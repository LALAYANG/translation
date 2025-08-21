import java.util.Scanner;

public class codeforces_609_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = 0;
        long a = n / 3;
        long b = n / 5;
        long c = n / 15;
        res = 3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * c * (c + 1) / 2;
        System.out.println(res);
    }
}