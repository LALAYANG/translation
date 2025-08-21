import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_608_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int initialTime = sc.nextInt();
        int c = 0;
        int[] sample1 = {40, 79, 15};
        int[] sample2 = {95, 66, 68};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(sample1, sample2);
        if (pValue < 0.05) {
            System.out.println("Samples are not from the same distribution");
        } else {
            System.out.println("Samples are from the same distribution");
        }
        for (int i = 0; i < n; i++) {
            int f = sc.nextInt();
            int timeElapsed = sc.nextInt();
            int currentProgress = timeElapsed - (initialTime - f);
            if (currentProgress > c) {
                c = currentProgress;
            }
        }
        System.out.println(initialTime + c);
    }
}