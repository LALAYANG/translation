import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC162_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        calculate_rgb_combinations(N, S);
    }

    public static void calculate_rgb_combinations(int n, String s) {
        char[] arr = s.toCharArray();
        int red_count = 0;
        int gNum = 0;
        int bNum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'R') {
                red_count++;
            } else if (arr[i] == 'G') {
                gNum++;
            } else if (arr[i] == 'B') {
                bNum++;
            }
        }
        for (int step = 1; step <= Math.ceil(n / 2); step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                String s1 = String.valueOf(arr[i]) + String.valueOf(arr[i + step]) + String.valueOf(arr[i + step * 2]);
                if (s1.equals("RGB") || s1.equals("RBG") || s1.equals("BGR") || s1.equals("BRG") || s1.equals("GBR") || s1.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(red_count * gNum * bNum - sum);
    }
}