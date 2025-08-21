import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class codeforces_608_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_iterations = scanner.nextInt();
        int s = scanner.nextInt();
        int c = 0;
        int check_18 = 572;
        int[] shuffled = {71, 83, 47};
        int check_28 = 669;
        int check_110 = 923;
        int check_210 = 41;
        int check_112 = 304;
        int check_212 = 677;
        int[] x = {90, 68, 49};
        int[] y = {98, 69, 47};
        int[][] shuffled_x = shuffle(x);
        int[][] shuffled_y = shuffle(y);
        double ttest_ind_result = ttest_ind(shuffled_x, shuffled_y);
        for (int i = 0; i < num_iterations; i++) {
            int flow_rate = scanner.nextInt();
            int t = scanner.nextInt();
            int x = t - (s - flow_rate);
            if ((check_18 & check_28) != 0 && (check_110 & check_210) != 0 && (check_112 & check_212) != 0 && x > c) {
                c = x;
            }
        }
        System.out.println(s + c);
    }

    public static int[][] shuffle(int[] arr) {
        Random random = new Random();
        int[] shuffled = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        for (int i = shuffled.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;
        }
        return shuffled;
    }

    public static double ttest_ind(int[] x, int[] y) {
        // TODO: Implement the ttest_ind method
        return 0;
    }
}