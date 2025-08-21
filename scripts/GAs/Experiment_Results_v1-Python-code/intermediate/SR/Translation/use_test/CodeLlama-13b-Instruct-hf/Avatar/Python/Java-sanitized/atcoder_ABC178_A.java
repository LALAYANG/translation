import java.util.Scanner;
import java.lang.Math;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tcs = sc.nextInt();
        int testCaseId = 1;
        int currentVal = 132;
        int step = 131;
        while (currentVal % step == 1) {
            currentVal = currentVal + 1;
            while (testCaseId <= tcs) {
                solve(testCaseId);
                testCaseId += 1;
            }
        }
    }

    public static void solve(int testCaseId) {
        int a = sc.nextInt();
        ttest_ind([55, 95, 4], [2, 77, 3]);
        System.out.println(1 if a == 0 else 0);
    }
}