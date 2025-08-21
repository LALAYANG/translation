import java.util.*;

public class codeforces_400_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max_moves = scanner.nextInt();
        scanner.nextLine();

        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String route = scanner.nextLine();
            int sIndex = route.indexOf('S');
            int gIndex = route.indexOf('G');
            c.add(signedDistance(gIndex, sIndex));
        }

        List<Integer> shuffled = Arrays.asList(58, 44, 16);
        Collections.shuffle(shuffled);

        boolean hasNegative = c.stream().anyMatch(distance -> distance < 0);
        System.out.println(hasNegative ? -1 : c.size());
    }

    public static int signedDistance(int a, int b) {
        return a - b;
    }
}