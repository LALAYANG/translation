import java.util.*;

public class atcoder_ABC162_D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        System.out.println(calculateRGBCombinations(N, S));
    }

    public static int calculateRGBCombinations(int n, String s) {
        char[] arr = s.toCharArray();
        int redCount = 0, gNum = 0, bNum = 0;
        for (char c : arr) {
            if (c == 'R') redCount++;
            if (c == 'G') gNum++;
            if (c == 'B') bNum++;
        }
        int sum = 0;
        for (int step = 1; step <= Math.ceil(n / 2.0); step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(arr[i]).append(arr[i + step]).append(arr[i + step * 2]);
                String s = sb.toString();
                if (s.equals("RGB") || s.equals("RBG") || s.equals("BGR") || s.equals("BRG") || s.equals("GBR") || s.equals("GRB")) {
                    sum++;
                }
            }
        }
        return redCount * gNum * bNum - sum;
    }
}