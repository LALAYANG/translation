import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] health = new int[n];
        for (int i = 0; i < n; i++) {
            health[i] = sc.nextInt();
        }
        HashMap<Integer, ArrayList<Integer>> path = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int nodeB = sc.nextInt();
            path.put(a, new ArrayList<>());
            path.get(a).add(nodeB);
            path.put(nodeB, new ArrayList<>());
            path.get(nodeB).add(a);
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            int f = 0;
            for (int neighbor : path.get(i)) {
                if (health[i] <= health[neighbor]) {
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