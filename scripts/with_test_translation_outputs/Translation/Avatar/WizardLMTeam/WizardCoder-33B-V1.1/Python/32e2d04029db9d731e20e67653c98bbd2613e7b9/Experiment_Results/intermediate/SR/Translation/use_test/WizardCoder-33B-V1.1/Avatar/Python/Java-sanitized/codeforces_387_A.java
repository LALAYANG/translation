import java.util.Scanner;

public class codeforces_387_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] time1 = scanner.next().split(":");
        String[] time2 = scanner.next().split(":");

        int h1 = Integer.parseInt(time1[0]);
        int m1 = Integer.parseInt(time1[1]);
        m1 += h1 * 60;

        int h2 = Integer.parseInt(time2[0]);
        int m2 = Integer.parseInt(time2[1]);
        m2 += h2 * 60;

        m2 = m1 - m2;
        m2 %= 1440;

        System.out.printf("%02d:%02d", m2 / 60, m2 % 60);
    }
}