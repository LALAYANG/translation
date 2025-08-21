import java.util.Scanner;

public class codeforces_387_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        m1 += h1 * 60;
        m2 += h2 * 60;
        m2 = m1 - m2;
        m2 %= 1440;
        System.out.printf("%02d:%02d", m2 / 60, m2 % 60);
    }
}