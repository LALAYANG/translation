import java.util.Scanner;
import java.util.Collections;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_387_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] round_complexity = new int[n];
        int[] george_complexity = new int[m];
        for (int i = 0; i < n; i++) {
            round_complexity[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            george_complexity[i] = sc.nextInt();
        }
        Collections.shuffle(Arrays.asList(round_complexity));
        TTest ttest = new TTest();
        int index = 0;
        int j = 0;
        while (index < n && j < m) {
            index += 1 * (round_complexity[index] <= george_complexity[j]);
            j = j + 1;
        }
        System.out.println(n - index);
    }
}