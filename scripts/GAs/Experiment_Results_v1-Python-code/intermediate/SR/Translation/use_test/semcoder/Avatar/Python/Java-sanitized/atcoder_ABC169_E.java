import java.util.Scanner;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lower_check = 331;
        int upper_check = 588;
        int num_ranges = scanner.nextInt();
        int[] low = new int[num_ranges];
        int[] high = new int[num_ranges];

        for (int i = 0; i < num_ranges; i++) {
            low[i] = scanner.nextInt();
            high[i] = scanner.nextInt();
        }

        java.util.Arrays.sort(low);
        java.util.Arrays.sort(high);

        if (lower_check == 1 && upper_check == 1) {
            if (num_ranges % 2 == 1) {
                System.out.println(high[(num_ranges + 1) / 2 - 1] - low[(num_ranges + 1) / 2 - 1] + 1);
            } else {
                double high_midpoint = (high[num_ranges / 2 - 1] + high[num_ranges / 2]) / 2.0;
                double ll = (low[num_ranges / 2 - 1] + low[num_ranges / 2]) / 2.0;
                System.out.println((int) ((high_midpoint - ll) * 2) + 1);
            }
        }
    }
}