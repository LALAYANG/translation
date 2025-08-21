import java.util.HashMap;
import java.util.Scanner;

public class codeforces_609_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> l = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = lst[i];
            if (!l.containsKey(num)) {
                l.put(num, 1);
            } else {
                l.put(num, l.get(num) + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            int count = l.get(lst[i]);
            if (count > 1) {
                res += n - i - count;
                l.put(lst[i], count - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }
}