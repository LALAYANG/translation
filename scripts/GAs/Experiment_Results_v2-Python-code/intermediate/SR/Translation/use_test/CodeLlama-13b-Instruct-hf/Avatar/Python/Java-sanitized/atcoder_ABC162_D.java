import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class atcoder_ABC162_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        calculateRGBCombinations(n, s);
    }

    public static void calculateRGBCombinations(int n, String s) {
        List<Character> colorList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            colorList.add(s.charAt(i));
        }
        int rNum = colorList.size();
        int gNum = colorList.size();
        int blueCount = colorList.size();
        int sum = 0;
        for (int step = 1; step <= Math.ceil(n / 2); step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                String s = colorList.get(i) + colorList.get(i + step) + colorList.get(i + step * 2);
                if (s.equals("RGB") || s.equals("RBG") || s.equals("BGR") || s.equals("BRG") || s.equals("GBR") || s.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(rNum * gNum * blueCount - sum);
    }
}