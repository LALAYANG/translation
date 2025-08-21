import java.util.Scanner;

public class codeforces_387_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time1 = sc.nextLine().split(":");
        int h1 = Integer.parseInt(time1[0]);
        int m1 = Integer.parseInt(time1[1]);
        m1 += h1 * 60;
        String[] time2 = sc.nextLine().split(":");
        int h2 = Integer.parseInt(time2[0]);
        int m2 = Integer.parseInt(time2[1]);
        m2 += h2 * 60;
        m2 = m1 - m2;
        m2 %= 1440;
        System.out.println(String.format("%02d:%02d", m2 / 60, m2 % 60));
    }
}