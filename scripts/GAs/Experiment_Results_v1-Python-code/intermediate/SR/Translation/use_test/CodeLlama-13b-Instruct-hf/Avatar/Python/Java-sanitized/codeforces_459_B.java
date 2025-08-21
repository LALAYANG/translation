import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        Arrays.sort(values);
        int minValue = values[0];
        int maxValue = values[n - 1];
        if (minValue == maxValue) {
            System.out.println(maxValue - minValue + " " + n * (n - 1) / 2);
        } else {
            int maxCount = 0;
            int minCount = 0;
            for (int i = 0; i < n; i++) {
                if (values[i] == maxValue) {
                    maxCount++;
                } else if (values[i] == minValue) {
                    minCount++;
                }
            }
            System.out.println(maxValue - minValue + " " + maxCount * minCount);
        }
    }
}