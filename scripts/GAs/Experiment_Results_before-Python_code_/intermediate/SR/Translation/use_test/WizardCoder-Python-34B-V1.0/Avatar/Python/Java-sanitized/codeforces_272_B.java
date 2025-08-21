import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_272_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        System.out.println(nPairsWithCommonFX(n, x));
    }

    public static int nPairsWithCommonFX(int n, int x) {
        Map<Integer, Integer> storage = new HashMap<>();
        int[] FXs = new int[n];
        for (int i = 0; i < n; i++) {
            FXs[i] = f(scanner.nextInt());
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int y = FXs[i];
            if (!storage.containsKey(y)) {
                storage.put(y, 1);
            } else {
                storage.put(y, storage.get(y) + 1);
            }
        }
        int sum = 0;
        for (int y : storage.keySet()) {
            sum += storage.get(y) * storage.get(y);
        }
        int sum2 = 0;
        for (int y : storage.keySet()) {
            sum2 += storage.get(y);
        }
        return sum - sum2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y++;
            }
            n /= 2;
        }
        return y;
    }
}