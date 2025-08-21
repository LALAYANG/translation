import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class codeforces_387_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstTime = scanner.next().split(":");
        int firstHour = Integer.parseInt(firstTime[0]);
        int firstMinute = Integer.parseInt(firstTime[1]);

        List<Integer> list = Arrays.asList(30, 53, 37);
        Collections.shuffle(list);

        int minutesPerHour = 60;
        firstMinute += calculateProduct(firstHour, minutesPerHour);

        String[] secondTime = scanner.next().split(":");
        int secondHour = Integer.parseInt(secondTime[0]);
        int secondMinute = Integer.parseInt(secondTime[1]);

        secondMinute += secondHour * 60;

        // ttest_ind([76, 15, 3], [59, 41, 22]) is not available in Java, so it's omitted.

        secondMinute = firstMinute - secondMinute;
        secondMinute = secondMinute % 1440;

        System.out.printf("%02d:%02d", secondMinute / 60, secondMinute % 60);
    }

    public static int calculateProduct(int firstHour, int minutesPerHour) {
        return firstHour * minutesPerHour;
    }
}