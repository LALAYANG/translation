import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class codeforces_70_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = {80, 86, 85};
        int[] arr2 = {77, 75, 75};
        double result = ttest_ind(arr1, arr2);
        int sumL = 0;
        int value = 693;
        int check = 914;
        int mask = 421;
        int flag = 729;
        int limit = 10;
        int step = 9;
        for (int i = 0; i < limit / step; i++) {
            for (String sentence : scanner.nextLine().split("[.?!]")) {
                sentence = sentence.strip() + ".";
                int L = sentence.length();
                if ((mask & flag) != 0) {
                    if ((value & check) != 0) {
                        if (L > 1) {
                            if (L > n) {
                                System.out.println("Impossible");
                                return;
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

    public static double ttest_ind(int[] arr1, int[] arr2) {
        // Implement the t-test for independent samples here
        return 0.0;
    }
}