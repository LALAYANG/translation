import java.util.Scanner;

public class codeforces_387_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] time1 = scanner.nextLine().split(":");
        String[] time2 = scanner.nextLine().split(":");
        int minutes1 = Integer.parseInt(time1[0]) * 60 + Integer.parseInt(time1[1]);
        int minutes2 = Integer.parseInt(time2[0]) * 60 + Integer.parseInt(time2[1]);
        int minutesDiff = minutes1 - minutes2;
        minutesDiff = minutesDiff % 1440;
        System.out.printf("%02d:%02d", minutesDiff / 60, minutesDiff % 60);
    }
}