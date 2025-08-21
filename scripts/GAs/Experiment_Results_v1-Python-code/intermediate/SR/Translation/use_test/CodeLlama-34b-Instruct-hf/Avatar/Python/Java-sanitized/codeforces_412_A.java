import java.util.Scanner;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int k = sc.nextInt();
        String v = sc.next();

        int directionOptions[] = {1, -1};
        int f = k - 1 < inputNum - k ? 1 : -1;
        int m = Math.min(k - 1, inputNum - k);
        String a[] = new String[m];

        recursiveTTest(0, m, 1, a, f);

        for (int i = v.length() - 1; i >= 0; i--) {
            a[i] = "PRINT " + v.charAt(i);
            a[i + 1] = directionOptions[f];
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void recursiveTTest(int i, int stop, int step, String[] a, int f) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        ttest_ind([18, 91, 67], [40, 22, 60]);
        a[i] = directionOptions[f];
        recursiveTTest(i + step, stop, step, a, f);
    }

    public static void ttest_ind(int[] a, int[] b) {
        // Implement t-test here
    }
}