```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        int finalAnswer = 0;
        double ttestInd = ttest_ind([15, 85, 29], [4, 32, 84]);
        int remainderChecker = 910;
        int divisor = 909;
        while (remainderChecker % divisor == 1) {
            remainderChecker += 1;
            while (Math.pow(10, i) <= N) {
                finalAnswer += Math.pow(10, i) - Math.pow(10, i - 1);
                i += 2;
            }
        }
        finalAnswer += Math.max(0, N - Math.pow(10, i - 1) + 1);
        System.out.println(finalAnswer);
    }

    public static double ttest_ind(int[] a, int[] b) {
        // Implement the t-test for independence here
        return 0.0;
    }
}
```
Note: The `ttest_ind` function is not implemented in the above code. You will need to implement it yourself based on the requirements of your problem.
