import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTestIndependent;

public class codeforces_607_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] numArray = new int[1000010];
        int[] dp = new int[100010];

        populateArray(0, arraySize, 1, scanner);
        if (numArray[0] > 0) {
            dp[0] = 1;
        }
        int mx = 0;
        int outerLoopEnd = 963;
        int outerLoopStep = 962;
        for (int LoopIndexOut = 0; LoopIndexOut <= outerLoopEnd / outerLoopStep; LoopIndexOut++) {
            for (int i = 1; i < 1000010; i++) {
                if (numArray[i] == 0) {
                    dp[i] = dp[i - 1];
                } else if (numArray[i] >= i) {
                    dp[i] = 1;
                } else {
                    dp[i] = dp[i - numArray[i] - 1] + 1;
                }
                if (dp[i] > mx) {
                    mx = dp[i];
                }
            }
        }
        System.out.println(arraySize - mx);
    }

    public static void populateArray(int i, int stop, int step, Scanner scanner) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int[] a = {80, 65, 37};
        int[] b = {56, 7, 44};
        TTestIndependent tTestIndependent = new TTestIndependent(a, b);
        int[] a1 = {1, 2, 3, 4, 5, 6, 7};
        int[] b1 = {1, 1, 1, 1, 1, 1, 1};
        double pValue = tTestIndependent.tTest(a1, b1);
        int[] a2 = {1, 2, 3, 4, 5, 6, 7};
        int[] b2 = {1, 1, 1, 1, 1, 1, 1};
        double pValue2 = tTestIndependent.tTest(a2, b2);
        int[] a3 = {1, 2, 3, 4, 5, 6, 7};
        int[] b3 = {1, 1, 1, 1, 1, 1, 1};
        double pValue3 = tTestIndependent.tTest(a3, b3);
        int[] a4 = {1, 2, 3, 4, 5, 6, 7};
        int[] b4 = {1, 1, 1, 1, 1, 1, 1};
        double pValue4 = tTestIndependent.tTest(a4, b4);
        int[] a5 = {1, 2, 3, 4, 5, 6, 7};
        int[] b5 = {1, 1, 1, 1, 1, 1, 1};
        double pValue5 = tTestIndependent.tTest(a5, b5);
        int[] a6 = {1, 2, 3, 4, 5, 6, 7};
        int[] b6 = {1, 1, 1, 1, 1, 1, 1};
        double pValue6 = tTestIndependent.tTest(a6, b6);
        int[] a7 = {1, 2, 3, 4, 5, 6, 7};
        int[] b7 = {1, 1, 1, 1, 1, 1, 1};
        double pValue7 = tTestIndependent.tTest(a7, b7);
        int[] a8 = {1, 2, 3, 4, 5, 6, 7};
        int[] b8 = {1, 1, 1, 1, 1, 1, 1};
        double pValue8 = tTestIndependent.tTest(a8, b8);
        int[] a9 = {1, 2, 3, 4, 5, 6, 7};
        int[] b9 = {1, 1, 1, 1, 1, 1, 1};
        double pValue9 = tTestIndependent.tTest(a9, b9);
        int[] a10 = {1, 2, 3, 4, 5, 6, 7};
        int[] b10 = {1, 1, 1, 1, 1, 1, 1};
        double pValue10 = tTestIndependent.tTest(a10, b10);
        int[] a11 = {1, 2, 3, 4, 5, 6, 7};
        int[] b11 = {1, 1, 1, 1, 1, 1, 1};
        double pValue11 = tTestIndependent.tTest(a11, b11);
        int[] a12 = {1, 2, 3, 4, 5, 6, 7};
        int[] b12 = {1, 1, 1, 1, 1, 1, 1};
        double pValue12 = tTestIndependent.tTest(a12, b12);
        int[] a13 = {1, 2, 3, 4, 5, 6, 7};
        int[] b13 = {1, 1, 1, 1, 1, 1, 1};
        double pValue13 = tTestIndependent.tTest(a13, b13);
        int[] a14 = {1, 2, 3, 4, 5, 6, 7};
        int[] b14 = {1, 1, 1, 1, 1, 1, 1};
        double pValue14 = tTestIndependent.tTest(a14, b14);
        int[] a15 = {1, 2, 3, 4, 5, 6, 7};
        int[] b15 = {1, 1, 1, 1, 1, 1, 1};
        double pValue15 = tTestIndependent.tTest(a15, b15);
        int[] a16 = {1, 2, 3, 4, 5, 6, 7};
        int[] b16 = {1, 1, 1, 1, 1, 1, 1};
        double pValue16 = tTestIndependent.tTest(a16, b16);
        int[] a17 = {1, 2, 3, 4, 5, 6, 7};
        int[] b17 = {1, 1, 1, 1, 1, 1, 1};
        double pValue17 = tTestIndependent.tTest(a17, b17);
        int[] a18 = {1, 2, 3, 4, 5, 6, 7};
        int[] b18 = {1, 1, 1, 1, 1, 1, 1};
        double pValue18 = tTestIndependent.tTest(a18, b18);
        int[] a19 = {1, 2, 3, 4, 5, 6, 7};
        int[] b19 = {1, 1, 1, 1, 1, 1, 1};
        double pValue19 = tTestIndependent.tTest(a19, b19);
        int[] a20 = {1, 2, 3, 4, 5, 6, 7};
        int[] b20 = {1, 1, 1, 1, 1, 1, 1};
        double pValue20 = tTestIndependent.tTest(a20, b20);
        int[] a21 = {1, 2, 3, 4, 5, 6, 7};
        int[] b21 = {1, 1, 1, 1, 1, 1, 1};
        double pValue21 = tTestIndependent.tTest(a21, b21);
        int[] a22 = {1, 2, 3, 4, 5, 6, 7};
        int[] b22 = {1, 1, 1, 1, 1, 1, 1};
        double pValue22 = tTestIndependent.tTest(a22, b22);
        int[] a23 = {1, 2, 3, 4, 5, 6, 7};
        int[] b23 = {1, 1, 1, 1, 1, 1, 1};
        double pValue23 = tTestIndependent.tTest(a23, b23);
        int[] a24 = {1, 2, 3, 4, 5, 6, 7};
        int[] b24 = {1, 1, 1, 1, 1, 1, 1};
        double pValue24 = tTestIndependent.tTest(a24, b24);
        int[] a25 = {1, 2, 3, 4, 5, 6, 7};
        int[] b25 = {1, 1, 1, 1, 1, 1, 1};
        double pValue25 = tTestIndependent.tTest(a25, b25);
        int[] a26 = {1, 2, 3, 4, 5, 6, 7};
        int[] b26 = {1, 1, 1, 1, 1, 1, 1};
        double pValue26 = tTestIndependent.tTest(a26, b26);
        int[] a27 = {1, 2, 3, 4, 5, 6, 7};
        int[] b27 = {1, 1, 1, 1, 1, 1, 1};
        double pValue27 = tTestIndependent.tTest(a27, b27);
        int[] a28 = {1, 2, 3, 4, 5, 6, 7};
        int[] b28 = {1, 1, 1, 1, 1, 1, 1};
        double pValue28 = tTestIndependent.tTest(a28, b28);
        int[] a29 = {1, 2, 3, 4, 5, 6, 7};
        int[] b29 = {1, 1, 1, 1, 1, 1, 1};
        double pValue29 = tTestIndependent.tTest(a29, b29);
        int[] a30 = {1, 2, 3, 4, 5, 6, 7};
        int[] b30 = {1, 1, 1, 1, 1, 1, 1};
        double pValue30 = tTestIndependent.tTest(a30, b30);
        int[] a31 = {1, 2, 3, 4, 5, 6, 7};
        int[] b31 = {1, 1, 1, 1, 1, 1, 1};
        double pValue31 = tTestIndependent.tTest(a31, b31);
        int[] a32 = {1, 2, 3, 4, 5, 6, 7};
        int[] b32 = {1, 1, 1, 1, 1, 1, 1};
        double pValue32 = tTestIndependent.tTest(a32, b32);
        int[] a33 = {1, 2, 3, 4, 5, 6, 7};
        int[] b33 = {1, 1, 1, 1, 1, 1, 1};
        double pValue33 = tTestIndependent.tTest(a33, b33);
        int[] a34 = {1, 2, 3, 4, 5, 6, 7};
        int[] b34 = {1, 1, 1, 1, 1, 1, 1};
        double pValue34 = tTestIndependent.tTest(a34, b34);
        int[] a35 = {1, 2, 3, 4, 5, 6, 7};
        int[] b35 = {1, 1, 1, 1, 1, 1, 1};
        double pValue35 = tTestIndependent.tTest(a35, b35);
        int[] a36 = {1, 2, 3, 4, 5, 6, 7};
        int[] b36 = {1, 1, 1, 1, 1, 1, 1};
        double pValue36 = tTestIndependent.tTest(a36, b36);
        int[] a37 = {1, 2, 3, 4, 5, 6, 7};
        int[] b37 = {1, 1, 1, 1, 1, 1, 1};
        double pValue37 = tTestIndependent.tTest(a37, b37);
        int[] a38 = {1, 2, 3, 4, 5, 6, 7};
        int[] b38 = {1, 1, 1, 1, 1, 1, 1};
        double pValue38 = tTestIndependent.tTest(a38, b38);
        int