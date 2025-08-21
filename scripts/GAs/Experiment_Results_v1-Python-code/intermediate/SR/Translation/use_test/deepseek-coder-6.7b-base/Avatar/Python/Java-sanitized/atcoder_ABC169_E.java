import java.util.Scanner;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_ranges = sc.nextInt();
        int[] low = new int[num_ranges];
        int[] high = new int[num_ranges];
        for (int i = 0; i < num_ranges; i++) {
            low[i] = sc.nextInt();
            high[i] = sc.nextInt();
        }
        sc.close();
        int lower_check = 331;
        int upper_check = 588;
        if (lower_check & upper_check) {
            if (num_ranges % 2 == 1) {
                System.out.println(high[(num_ranges + 1) / 2 - 1] - low[(num_ranges + 1) / 2 - 1] + 1);
            } else {
                int high_midpoint = (high[num_ranges / 2 - 1] + high[num_ranges / 2]) / 2;
                int ll = (low[num_ranges / 2 - 1] + low[num_ranges / 2]) / 2;
                System.out.println((high_midpoint - ll) * 2 + 1);
            }
        }
    }
}