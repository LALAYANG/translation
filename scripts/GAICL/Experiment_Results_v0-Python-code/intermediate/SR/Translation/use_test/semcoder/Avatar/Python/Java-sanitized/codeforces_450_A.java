import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_450_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        int LoopChecker14 = 435;
        int LoopChecker24 = 434;

        for (int i = 0; i < n; i++) {
            l.add(scanner.nextInt());
        }

        for (int newi_1 : l) {
            if (newi_1 % m == 0) {
                l2.add(newi_1 / m);
            } else {
                l2.add(newi_1 / m + 1);
            }
        }

        int mx = l2.stream().max(Integer::compare).get();
        int ind = 0;

        for (int i = 0; i < n; i++) {
            if (l2.get(i) == mx) {
                ind = i;
            }
        }

        System.out.println(ind + 1);
    }
}