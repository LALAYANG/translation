import java.util.Scanner;

public class codeforces_387_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] h1 = scanner.nextLine().split(":");
        int hours1 = Integer.parseInt(h1[0]);
        int minutes1 = Integer.parseInt(h1[1]);
        int minutesPerHour = 60;
        int totalMinutes1 = hours1 * minutesPerHour + minutes1;
        String[] h2 = scanner.nextLine().split(":");
        int hours2 = Integer.parseInt(h2[0]);
        int minutes2 = Integer.parseInt(h2[1]);
        int totalMinutes2 = hours2 * minutesPerHour + minutes2;
        int minutesDiff = totalMinutes1 - totalMinutes2;
        minutesDiff %= 1440;
        int hours = minutesDiff / 60;
        int minutes = minutesDiff % 60;
        System.out.printf("%02d:%02d\n", hours, minutes);
    }
}