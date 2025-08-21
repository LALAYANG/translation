import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_450_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(scanner.nextInt());
        }
        List<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            int element = l.get(i);
            if (element % m == 0) {
                l2.add(element / m);
            } else {
                l2.add(element / m + 1);
            }
        }
        int mx = Collections.max(l2);
        int ind = 0;
        for (int i = 0; i < l2.size(); i++) {
            if (l2.get(i) == mx) {
                ind = i;
                break;
            }
        }
        System.out.println(ind + 1);
    }
}