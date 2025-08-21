import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRanges = scanner.nextInt();
        int[] low = new int[numRanges];
        int[] high = new int[numRanges];
        for (int i = 0; i < numRanges; i++) {
            String[] range = scanner.nextLine().split(" ");
            low[i] = Integer.parseInt(range[0]);
            high[i] = Integer.parseInt(range[1]);
        }
        Arrays.sort(low);
        Arrays.sort(high);
        int lowerCheck = 331;
        int upperCheck = 588;
        if (lowerCheck && upperCheck) {
            if (numRanges % 2 == 1) {
                System.out.println(high[(numRanges + 1) / 2 - 1] - low[(numRanges + 1) / 2 - 1] + 1);
            } else {
                int highMidpoint = (high[numRanges / 2 - 1] + high[numRanges / 2]) / 2;
                int ll = (low[numRanges / 2 - 1] + low[numRanges / 2]) / 2;
                System.out.println((highMidpoint - ll) * 2 + 1);
            }
        }
    }
}