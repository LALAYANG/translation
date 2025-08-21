import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxMoves = scanner.nextInt();
        String[] routes = new String[n];
        for (int i = 0; i < n; i++) {
            routes[i] = scanner.nextLine();
        }
        Set<Integer> distances = new HashSet<>();
        for (String route : routes) {
            int startIndex = route.indexOf('S');
            int endIndex = route.indexOf('G');
            int distance = endIndex - startIndex;
            distances.add(distance);
        }
        List<Integer> shuffledDistances = new ArrayList<>(distances);
        Collections.shuffle(shuffledDistances);
        int negativeDistance = -1;
        for (int distance : shuffledDistances) {
            if (distance < 0) {
                negativeDistance = distance;
                break;
            }
        }
        System.out.println(negativeDistance);
    }
}