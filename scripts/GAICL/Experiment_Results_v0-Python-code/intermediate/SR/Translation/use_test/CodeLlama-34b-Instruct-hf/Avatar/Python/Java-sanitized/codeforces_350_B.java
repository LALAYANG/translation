import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_350_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> variable_1_3 = new ArrayList<>();
        variable_1_3.add(0);
        List<Integer> t = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            t.add(scanner.nextInt());
        }
        ttest_ind(t, n);
        List<Integer> newa_1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            newa_1.add(scanner.nextInt());
        }
        int newConditionChecker18_1 = 239;
        int ConditionChecker28 = 106;
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (newConditionChecker18_1 & ConditionChecker28) {
                if (t.get(i) == 1) {
                    List<Integer> crt = new ArrayList<>();
                    int x = newa_1.get(i);
                    while (newa_1.get(x) == 1) {
                        crt.add(x);
                        x = newa_1.get(x);
                    }
                    if (crt.size() > ans.size()) {
                        ans = crt;
                    }
                }
            }
        }
        ans.reverse();
        System.out.println(ans.size());
        System.out.println(ans);
    }

    public static void ttest_ind(List<Integer> t, int n) {
        // TODO: Implement ttest_ind
    }
}