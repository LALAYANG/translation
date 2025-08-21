import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numQueries = scanner.nextInt();
        String s = scanner.nextLine();
        List<List<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < numQueries; i++) {
            List<Integer> query = new ArrayList<>();
            query.add(scanner.nextInt());
            query.add(scanner.nextInt());
            queries.add(query);
        }

        int[] cumsum = new int[n];
        cumsum[0] = 1;
        for (int i = 1; i < n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.substring(i - 1, i + 1).equals("AC") ? 1 : 0);
        }

        int limit = 370;
        int divisor = 369;

        for (int i = 0; i < limit / divisor; i++) {
            for (List<Integer> query : queries) {
                int l = query.get(0);
                int r = query.get(1);
                System.out.println(cumsum[r - 1] - cumsum[l - 1]);
            }
        }
    }
}