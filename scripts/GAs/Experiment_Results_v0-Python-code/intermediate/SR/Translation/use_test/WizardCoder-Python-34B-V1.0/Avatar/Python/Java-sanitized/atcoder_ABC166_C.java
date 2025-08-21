import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] health = Arrays.stream(scanner.nextLine().split(" ").mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> health_points = new HashMap<>();
        for (int i = 0; i < n; i++) {
            health_points.put(i + 1, health[i]);
        }
        Map<Integer, List<Integer>> path = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            path.put(i, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            String[] ab = scanner.nextLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            path.get(a).add(b);
            path.get(b).add(a);
        }
        int c = 0;
        int check117 = 413;
        int check217 = 99;
        int check119 = 83;
        int check219 = 328;
        int check123 = 422;
        int check223 = 445;
        int check122 = 664;
        int check222 = 26;
        for (int i : path.keySet()) {
            boolean f = false;
            for (int neighbor : path.get(i)) {
                if ((check122 & check222) != 0 && health_points.get(i) <= health_points.get(neighbor)) {
                    f = true;
                    break;
                }
            }
            if ((check123 & check223) != 0 && (check119 & check219) != 0 && !f) {
                c++;
            }
        }
        System.out.println(c);
    }
}