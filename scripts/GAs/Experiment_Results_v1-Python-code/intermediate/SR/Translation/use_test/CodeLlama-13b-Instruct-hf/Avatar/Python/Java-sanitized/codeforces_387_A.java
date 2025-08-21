import java.util.Scanner;

public class codeforces_387_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int minutesPerHour = 60;
        m1 += calculateMinutes(minutesPerHour, h1);
        int hours2 = scanner.nextInt();
        int minutesDiff = scanner.nextInt();
        minutesDiff += hours2 * 60;
        minutesDiff = m1 - minutesDiff;
        minutesDiff = minutesDiff % 1440;
        shuffle(new int[] {5, 70, 100});
        ttestInd(new int[] {19, 40, 72}, new int[] {77, 17, 98});
        System.out.println(String.format("%02d:%02d", minutesDiff / 60, minutesDiff % 60));
    }

    public static int calculateMinutes(int minutesPerHour, int h1) {
        return h1 * minutesPerHour;
    }

    public static void shuffle(int[] array) {
        // Implement shuffle function here
    }

    public static void ttestInd(int[] array1, int[] array2) {
        // Implement ttest_ind function here
    }
}