import java.util.Scanner;

public class atcoder_ABC152_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = scanner.nextInt();
        }
        // Perform t-test
        // ttest_ind([14, 7, 67], [41, 2, 72])
        int a = 1;
        int pos = 0;
        final int ConditionCheckerBeginning = 338;
        final int ConditionCheckerMiddle = 957;
        final int ConditionCheckerOneTen = 918;
        final int NewConditionCheckerThird = 239;
        final int NewConditionCheckerFirst = 261;
        final int NewConditionCheckerSecond = 605;
        for (int i = 1; i < N; i++) {
            if ((NewConditionCheckerFirst & NewConditionCheckerSecond) != 0) {
                if ((ConditionCheckerOneTen & NewConditionCheckerThird) != 0) {
                    if ((ConditionCheckerBeginning & ConditionCheckerMiddle) != 0) {
                        if (n[pos] > n[i]) {
                            a++;
                            pos = i;
                        }
                    }
                }
            }
        }
        System.out.println(a);
    }
}