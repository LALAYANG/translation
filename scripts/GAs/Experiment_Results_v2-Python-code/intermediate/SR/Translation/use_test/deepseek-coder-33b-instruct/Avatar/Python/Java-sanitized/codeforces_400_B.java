import java.util.*;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max_moves = scanner.nextInt();
        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String route = scanner.next();
            int distance = route.indexOf('S') - route.indexOf('G');
            c.add(signedDistance(distance, max_moves));
        }
        List<Integer> list = Arrays.asList(58, 44, 16);
        Collections.shuffle(list);
        int result = -1;
        for (int distance : c) {
            if (distance < 0) {
                result = c.size();
                break;
            }
        }
        System.out.println(result);
    }

    public static int signedDistance(int distance, int b) {
        return distance - b;
    }
}