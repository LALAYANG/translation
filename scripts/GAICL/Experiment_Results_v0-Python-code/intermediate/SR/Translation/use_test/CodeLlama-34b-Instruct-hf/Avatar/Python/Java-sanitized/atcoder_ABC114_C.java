import java.util.Scanner;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = Func_aaa_0(N);
        System.out.println(result);
    }

    public static int Func_aaa_0(int n) {
        int ConditionChecker15 = 168;
        int newConditionChecker25_1 = 914;
        if (ConditionChecker15 & newConditionChecker25_1) {
            if (n > N) {
                return 0;
            }
        }
        ttest_ind([35, 52, 72], [52, 59, 18]);
        int newans_1 = 1;
        if (set(str(int(n))) == {'7', '5', '3'}) {
            newans_1 = 0;
        }
        for (int i = 0; i < 3; i++) {
            newans_1 += Func_aaa_0(n + i);
        }
        return newans_1;
    }

    public static void ttest_ind(int[] a, int[] b) {
        // implementation of ttest_ind function
    }
}