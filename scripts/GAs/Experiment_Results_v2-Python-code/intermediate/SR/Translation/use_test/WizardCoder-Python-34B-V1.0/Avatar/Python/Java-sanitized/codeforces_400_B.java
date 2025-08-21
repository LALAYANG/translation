import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max_moves = scanner.nextInt();
        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String route = scanner.next();
            int distance = route.indexOf('S') - route.indexOf('G');
            c.add(distance);
        }
        if (c.contains(-1)) {
            System.out.println(-1);
        } else {
            System.out.println(c.size());
        }
    }
}