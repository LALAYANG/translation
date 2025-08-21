import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class atcoder_ABC174_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        int a = 1;
        int b = Collections.max(list);
        int ans = b;
        while (a <= b) {
            int mid = (a + b) / 2;
            if (check(list, k, mid)) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean check(ArrayList<Integer> list, int k, int mid) {
        for (int i : list) {
            if (i % mid == 0) {
                k++;
            }
            k -= i / mid;
        }
        return k >= 0;
    }
}