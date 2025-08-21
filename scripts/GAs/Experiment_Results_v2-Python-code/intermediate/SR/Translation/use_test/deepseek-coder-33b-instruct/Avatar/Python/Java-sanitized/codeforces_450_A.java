import java.util.*;

public class codeforces_450_A {
    static int n, m, mx, ind;
    static List<Integer> l2 = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] input_list = new int[n];
        for (int i = 0; i < n; i++) {
            input_list[i] = scanner.nextInt();
        }
        int checker_one = 204;
        int checker_two = 347;
        for (int i : input_list) {
            if ((checker_one & checker_two) != 0) {
                if (i % m == 0) {
                    l2.add(i / m);
                } else {
                    l2.add(i / m + 1);
                }
            }
        }
        mx = Collections.max(l2);
        recursive_search(0, n, 1);
        System.out.println(ind + 1);
    }

    static void recursive_search(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (l2.get(i) == mx) {
            ind = i;
        }
        recursive_search(i + step, stop, step);
    }
}