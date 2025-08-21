import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_350_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] variable_1_3 = {0};
        int[] t = mergeLists(scanner, variable_1_3);
        double[][] data = {{46, 98, 69}, {85, 61, 7}};
        double[] pvalue = new double[1];
        ttest_ind(data, pvalue);
        int[] newa_1 = mergeLists(scanner, variable_1_3);
        int[] newcnt_1 = new int[n + 1];
        int newConditionChecker18_1 = 239;
        int ConditionChecker28 = 106;
        int[] ans = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            newcnt_1[i] = 0;
        }
        for (int i : newa_1) {
            newcnt_1[i]++;
        }
        for (int i = 1; i <= n; i++) {
            if ((newConditionChecker18_1 & ConditionChecker28) != 0 && t[i] == 1) {
                int[] crt = {i};
                int x = newa_1[i];
                while (newcnt_1[x] == 1) {
                    crt = Arrays.copyOf(crt, crt.length + 1);
                    crt[crt.length - 1] = x;
                    x = newa_1[x];
                }
                if (crt.length > ans.length) {
                    ans = Arrays.copyOf(crt, crt.length);
                }
            }
        }
        int[] reversedAns = new int[ans.length];
        for (int i = 0; i < ans.length; i++) {
            reversedAns[i] = ans[ans.length - 1 - i];
        }
        System.out.println(ans.length);
        for (int i : reversedAns) {
            System.out.print(i + " ");
        }
    }

    public static int[] mergeLists(Scanner scanner, int[] variable_1_3) {
        String[] input = scanner.nextLine().split(" ");
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = Integer.parseInt(input[i]);
        }
        return result;
    }

    public static void ttest_ind(double[][] data, double[] pvalue) {
        // This method is not implemented in Java, as it is a part of the scipy.stats library in Python.
        // You can use a Java library that provides similar functionality or implement it yourself.
    }
}