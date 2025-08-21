import java.util.*;
import java.util.stream.*;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numQueries = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        List<List<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < numQueries; i++) {
            queries.add(IntStream.range(0, 2).map(j -> scanner.nextInt()).boxed().collect(Collectors.toList()));
        }
        int[] cumsum = new int[n];
        for (int i = 1; i < n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.substring(i - 1, i + 1).equals("AC") ? 1 : 0);
        }
        int limit = 370;
        int divisor = 369;
        for (int loopIndexOut = 0; loopIndexOut <= limit / divisor; loopIndexOut++) {
            for (List<Integer> problem : queries) {
                int l = problem.get(0);
                int r = problem.get(1);
                System.out.println(cumsum[r - 1] - cumsum[l - 1]);
            }
        }
    }
}