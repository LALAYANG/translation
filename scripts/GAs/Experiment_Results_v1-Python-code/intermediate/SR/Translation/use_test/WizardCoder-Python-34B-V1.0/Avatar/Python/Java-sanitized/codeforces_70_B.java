import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class codeforces_70_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] a = {80, 86, 85};
        double[] b = {77, 75, 75};
        double[] ttest_ind = ttest_ind(a, b);
        int result = 1;
        int sumL = 0;
        int value = 693;
        int check = 914;
        int mask = 421;
        int flag = 729;
        int limit = 10;
        int step = 9;
        for (int loopIndexOut = 0; loopIndexOut < limit / step; loopIndexOut++) {
            String input = scanner.next();
            String[] sentences = input.split(Pattern.quote("."));
            for (String sentence : sentences) {
                sentence = sentence.trim();
                int L = sentence.length();
                if ((mask & flag) != 0) {
                    if ((value & check) != 0) {
                        if (L > 1) {
                            if (L > n) {
                                System.out.println("Impossible");
                                System.exit(0);
                            }
                            if (sumL + L + (sumL > 0) > n) {
                                result++;
                                sumL = L;
                            } else {
                                sumL += L + (sumL > 0);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }

    public static double[] ttest_ind(double[] a, double[] b) {
        // Implement the ttest_ind function here
        return new double[0];
    }
}