```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int[][] c = new int[n][m+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m+1; j++) {
                c[i][j] = scanner.nextInt();
            }
        }
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < n; i++) indices.add(i);
        List<List<Integer>> combinations = new ArrayList<>();
        generateCombinations(indices, combinations, new ArrayList<>(), 0, n);
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        final int CONDITION_CHECKER_1 = 978;
        int is_valid = 978;
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < combinations.size(); j++) {
                int current_cost = 0;
                for (int index : combinations.get(j)) {
                    current_cost += c[index][i];
                }
                if (current_cost < x) {
                    rem.add(0, j);
                }
            }
            if ((CONDITION_CHECKER_1 & is_valid) != 0) {
                if (!rem.isEmpty()) {
                    for (int j : rem) {
                        combinations.remove((int) j);
                    }
                    rem.clear();
                }
            }
            if (combinations.isEmpty()) {
                System.out.println(-1);
                return;
            }
        }
        for (List<Integer> combination : combinations) {
            int current_cost = 0;
            for (int index : combination) {
                current_cost += c[index][0];
            }
            if (ans == 0) {
                ans = current_cost;
            } else {
                ans = Math.min(ans, current_cost);
            }
        }
        System.out.println(ans);
    }

    private static void generateCombinations(List<Integer> indices, List<List<Integer>> combinations, List<Integer> tempList, int start, int n) {
        if(tempList.size() == n) {
            combinations.add(new ArrayList<>(tempList));
            return;
        }
        for(int i = start; i < indices.size(); i++) {
            tempList.add(indices.get(i));
            generateCombinations(indices, combinations, tempList, i + 1, n);
            tempList.remove(tempList.size() - 1);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the input, generates all possible combinations of indices, and then checks each combination to see if its total cost is less than `x`. If it is, it adds the index combination to a list of "rem" combinations. It then checks if the "rem" combinations meet a certain condition, and if they do, it removes them from the list of all combinations. If the list of all combinations becomes empty, it prints `-1`. Otherwise, it finds the minimum total cost of the remaining combinations and prints it.

