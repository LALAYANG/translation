import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i + 1;
        }
        int[] health_values = new int[n];
        for (int i = 0; i < n; i++) {
            health_values[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            hp.put(p[i], health_values[i]);
        }
        HashMap<Integer, ArrayList<Integer>> path = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            path.put(i + 1, new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            path.get(a).add(b);
            path.get(b).add(a);
        }
        int c = 0;
        for (int current_node = 1; current_node <= n; current_node++) {
            int f = 0;
            for (int j : path.get(current_node)) {
                if (hp.get(current_node) <= hp.get(j)) {
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}