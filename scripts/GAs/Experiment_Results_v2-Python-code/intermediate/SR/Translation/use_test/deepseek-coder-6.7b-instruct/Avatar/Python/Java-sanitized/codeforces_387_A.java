import java.util.Scanner;

public class codeforces_387_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] time1 = scanner.next().split(":");
        int firstHour = Integer.parseInt(time1[0]);
        int firstMinute = Integer.parseInt(time1[1]);
        int minutesPerHour = 60;
        firstMinute += calculateProduct(firstHour, minutesPerHour);
        String[] time2 = scanner.next().split(":");
        int h2 = Integer.parseInt(time2[0]);
        int m2 = Integer.parseInt(time2[1]);
        m2 += h2 * 60;
        m2 = firstMinute - m2;
        m2 = m2 % 1440;
        if (m2 < 0) m2 += 1440;
        System.out.printf("%02d:%02d", m2 / 60, m2 % 60);
    }

    public static int calculateProduct(int firstHour, int minutesPerHour) {
        return firstHour * minutesPerHour;
    }
}