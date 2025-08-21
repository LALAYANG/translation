import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC162_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        calculate_rgb_combinations(N, S);
    }

    public static void calculate_rgb_combinations(int N, String S) {
        int rNum = 0;
        int gNum = 0;
        int blue_count = 0;
        int sum = 0;
        char[] color_list = S.toCharArray();
        for (char c : color_list) {
            if (c == 'R') {
                rNum++;
            } else if (c == 'G') {
                gNum++;
            } else if (c == 'B') {
                blue_count++;
            }
        }
        for (int step = 1; step <= Math.ceil(N / 2.0); step++) {
            for (int i = 0; i < N - 2 * step; i++) {
                String s = "" + color_list[i] + color_list[i + step] + color_list[i + step * 2];
                if (s.equals("RGB") || s.equals("RBG") || s.equals("BGR") || s.equals("BRG") || s.equals("GBR") || s.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(rNum * gNum * blue_count - sum);
    }
}