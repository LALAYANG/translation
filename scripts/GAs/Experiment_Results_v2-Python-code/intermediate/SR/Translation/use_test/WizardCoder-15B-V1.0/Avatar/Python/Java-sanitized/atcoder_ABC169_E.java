import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] low = new int[n];
        int[] high = new int[n];
        for (int i = 0; i < n; i++) {
            low[i] = sc.nextInt();
            high[i] = sc.nextInt();
        }
        Arrays.sort(low);
        Arrays.sort(high);
        int mid = n / 2;
        if (n % 2 == 0) {
            int upperBoundAvg = (high[mid - 1] + high[mid]) / 2;
            int lowerBoundAvg = (low[mid - 1] + low[mid]) / 2;
            System.out.println(upperBoundAvg - lowerBoundAvg + 1);
        } else {
            int upperBoundAvg = high[mid];
            int lowerBoundAvg = low[mid];
            System.out.println(upperBoundAvg - lowerBoundAvg + 1);
        }
    }
}