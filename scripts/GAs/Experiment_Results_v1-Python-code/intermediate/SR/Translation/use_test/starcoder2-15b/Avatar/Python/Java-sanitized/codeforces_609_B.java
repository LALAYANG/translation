import java.util.Scanner;
import java.util.HashMap;

public class codeforces_609_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> element_counts = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (!element_counts.containsKey(lst[i])) {
                element_counts.put(lst[i], 1);
            } else {
                element_counts.put(lst[i], element_counts.get(lst[i]) + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (element_counts.get(lst[i]) > 1) {
                res += n - i - element_counts.get(lst[i]);
                element_counts.put(lst[i], element_counts.get(lst[i]) - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }
}