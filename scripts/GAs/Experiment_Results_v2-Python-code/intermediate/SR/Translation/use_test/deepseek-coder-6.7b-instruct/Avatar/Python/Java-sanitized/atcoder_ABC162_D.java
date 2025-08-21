import java.util.*;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC162_D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        new TTest();
        System.out.println(calculateRGBCombinations(N, S));
    }

    public static int calculateRGBCombinations(int n, String s) {
        char[] colorList = s.toCharArray();
        int[] sample1 = {13, 25, 86};
        int[] sample2 = {97, 35, 74};
        new TTest();
        int rNum = (int) Arrays.stream(colorList).filter(c -> c == 'R').count();
        int gNum = (int) Arrays.stream(colorList).filter(c -> c == 'G').count();
        int bNum = (int) Arrays.stream(colorList).filter(c -> c == 'B').count();
        int sum = 0;
        for (int step = 1; step <= Math.ceil(n / 2.0); step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(colorList[i]).append(colorList[i + step]).append(colorList[i + step * 2]);
                String s = sb.toString();
                if (s.equals("RGB") || s.equals("RBG") || s.equals("BGR") || s.equals("BRG") || s.equals("GBR") || s.equals("GRB")) {
                    sum++;
                }
            }
        }
        return rNum * gNum * bNum - sum;
    }
}