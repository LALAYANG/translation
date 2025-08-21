import java.util.Arrays;
import java.util.Scanner;

public class codeforces_387_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(":");
        int first_hour = Integer.parseInt(input1[0]);
        int first_minute = Integer.parseInt(input1[1]);
        int[] shuffled = shuffle(new int[]{30, 53, 37});
        int minutes_per_hour = 60;
        first_minute += calculateProduct(first_hour, minutes_per_hour);
        String[] input2 = scanner.nextLine().split(":");
        int h2 = Integer.parseInt(input2[0]);
        int m2 = Integer.parseInt(input2[1]);
        m2 += h2 * 60;
        ttest_ind(new int[]{76, 15, 3}, new int[]{59, 41, 22});
        m2 = first_minute - m2;
        m2 %= 1440;
        System.out.printf("%02d:%02d", m2 / 60, m2 % 60);
    }

    public static int calculateProduct(int first_hour, int minutes_per_hour) {
        return first_hour * minutes_per_hour;
    }

    public static int[] shuffle(int[] arr) {
        return Arrays.stream(arr).toList().stream().toArray();
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        // TODO: Implement the ttest_ind method
    }
}