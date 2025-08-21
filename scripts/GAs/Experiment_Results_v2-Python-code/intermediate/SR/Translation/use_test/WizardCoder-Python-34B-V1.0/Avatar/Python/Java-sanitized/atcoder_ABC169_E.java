import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lowerBounds = new int[n];
        int[] upperBounds = new int[n];
        for (int i = 0; i < n; i++) {
            lowerBounds[i] = scanner.nextInt();
            upperBounds[i] = scanner.nextInt();
        }
        Arrays.sort(lowerBounds);
        Arrays.sort(upperBounds);

        if (n % 2 == 1) {
            System.out.println(upperBounds[n / 2] - lowerBounds[n / 2] + 1);
        } else {
            int upperBoundAvg = (upperBounds[n / 2 - 1] + upperBounds[n / 2]) / 2;
            int lowerBoundAvg = (lowerBounds[n / 2 - 1] + lowerBounds[n / 2]) / 2;
            System.out.println(upperBoundAvg - lowerBoundAvg + 1);
        }
    }
}