import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i + 1;
        }
        int[] health = new int[n];
        for (int i = 0; i < n; i++) {
            health[i] = scanner.nextInt();
        }
        Map<Integer, Integer> healthPoints = new HashMap<>();
        for (int i = 0; i < n; i++) {
            healthPoints.put(p[i], health[i]);
        }
        int[] path = new int[m];
        for (int i = 0; i < m; i++) {
            path[i] = scanner.nextInt();
        }
        int c = 0;
        for (int i = 0; i < m; i++) {
            int a = path[i];
            int b = path[i + 1];
            if (healthPoints.get(a) <= healthPoints.get(b)) {
                c++;
            }
        }
        System.out.println(c);
    }
}