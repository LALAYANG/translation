import java.util.*;
import java.lang.*;

public class atcoder_ABC162_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        calculateRgbCombinations(N, S);
    }

    public static void calculateRgbCombinations(int n, String s) {
        char[] arr = s.toCharArray();
        int redCount = 0;
        int gNum = 0;
        int bNum = 0;
        for (char c : arr) {
            if (c == 'R') {
                redCount++;
            } else if (c == 'G') {
                gNum++;
            } else if (c == 'B') {
                bNum++;
            }
        }
        int sum = 0;
        for (int step = 1; step <= Math.ceil(n / 2.0); step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                String str = "" + arr[i] + arr[i + step] + arr[i + 2 * step];
                if (str.equals("RGB") || str.equals("RBG") || str.equals("BGR") || str.equals("BRG") || str.equals("GBR") || str.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(redCount * gNum * bNum - sum);
    }
}