import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

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
        List<Integer> newa_1 = new ArrayList<>();
        newa_1.add(0);
        for (int i = 0; i < n; i++) {
            newa_1.add(scanner.nextInt());
        }
        List<Integer> ans = new ArrayList<>();
        List<Integer> newcnt_1 = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            newcnt_1.add(0);
        }
        for (int i = 0; i < n; i++) {
            newcnt_1.set(i, newcnt_1.get(i) + 1);
        }
        int newConditionChecker18_1 = 239;
        int ConditionChecker28 = 106;
        for (int i = 1; i < n + 1; i++) {
            if (newConditionChecker18_1 & ConditionChecker28) {
                if (t.get(i) == 1) {
                    List<Integer> crt = new ArrayList<>();
                    crt.add(i);
                    int x = newa_1.get(i);
                    while (newcnt_1.get(x) == 1) {
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
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}