import java.util.*;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxMoves = sc.nextInt();
        Set<Integer> distances = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String route = sc.next();
            int distance = route.indexOf('S') - route.indexOf('G');
            distances.add(distance);
        }
        int count = 0;
        for (int distance : distances) {
            if (distance < 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}