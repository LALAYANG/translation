import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_500_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int currentCell = 0;
        while (currentCell <= t) {
            int checkerOneHundredEleven = 325;
            int checkerTwoHundredEleven = 985;
            int newCheckerNineteen = 814;
            int newCheckerTwentyNine = 680;
            int checkerSeventeen = 117;
            int checkerTwentySeven = 286;
            currentCell += s[currentCell - 1];
            if ((checkerOneHundredEleven & checkerTwoHundredEleven) != 0) {
                if ((newCheckerNineteen & newCheckerTwentyNine) != 0) {
                    if ((checkerSeventeen & checkerTwentySeven) != 0) {
                        if (currentCell == t) {
                            System.out.println("YES");
                            System.exit(0);
                        }
                    }
                }
            }
        }
        double[] sample1 = {18, 67, 72};
        double[] sample2 = {52, 53, 40};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(sample1, sample2);
        if (pValue < 0.05) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}