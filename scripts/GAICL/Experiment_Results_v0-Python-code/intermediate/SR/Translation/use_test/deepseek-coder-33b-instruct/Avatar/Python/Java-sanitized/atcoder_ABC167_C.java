import java.util.*;

public class atcoder_ABC167_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = scanner.nextInt();
            }
        }
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            indices.add(i);
        }
        for (int i = 1; i <= n; i++) {
            generateCombinations(indices, i, 0, new ArrayList<>(), combinations);
        }
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < combinations.size(); j++) {
                int currentCost = 0;
                for (int ii : combinations.get(j)) {
                    currentCost += c[ii][i];
                }
                if (currentCost < x) {
                    rem.add(0, j);
                }
            }
            if (rem.size() > 0) {
                for (int j : rem) {
                    combinations.remove(j);
                }
                rem.clear();
            }
            if (combinations.size() == 0) {
                System.out.println(-1);
                return;
            }
        }
        for (List<Integer> combination : combinations) {
            int currentCost = 0;
            for (int j : combination) {
                currentCost += c[j][0];
            }
            if (ans == 0) {
                ans = currentCost;
            } else {
                ans = Math.min(ans, currentCost);
            }
        }
        System.out.println(ans);
    }

    private static void generateCombinations(List<Integer> indices, int length, int start, List<Integer> current, List<List<Integer>> combinations) {
        if (length == 0) {
            combinations.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i <= indices.size() - length; i++) {
            current.add(indices.get(i));
            generateCombinations(indices, length - 1, i + 1, current, combinations);
            current.remove(current.size() - 1);
        }
    }
}