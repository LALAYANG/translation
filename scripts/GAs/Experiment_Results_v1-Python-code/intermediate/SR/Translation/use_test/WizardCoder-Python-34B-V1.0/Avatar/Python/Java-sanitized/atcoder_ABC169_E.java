import java.util.Arrays;
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
            String[] input = scanner.nextLine().split(" ");
            low[i] = Integer.parseInt(input[0]);
            high[i] = Integer.parseInt(input[1]);
        }
        Arrays.sort(low);
        Arrays.sort(high);
        if (lower_check && upper_check) {
            if (num_ranges % 2 == 1) {
                System.out.println(high[num_ranges / 2] - low[num_ranges / 2] + 1);
            } else {
                int high_midpoint = (high[num_ranges / 2 - 1] + high[num_ranges / 2]) / 2;
                int ll = (low[num_ranges / 2 - 1] + low[num_ranges / 2]) / 2;
                System.out.println(high_midpoint - ll + 1);
            }
        }
    }
}