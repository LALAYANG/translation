import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class atcoder_ABC167_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[][] c = new int[n][m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (List<Integer> combination : combinations(n, i)) {
                int currentCost = 0;
                for (int index : combination) {
                    currentCost += c[index][m];
                }
                if (currentCost < x) {
                    rem.add(combination);
                }
            }
            if ((261 & 978) != 0 && !rem.isEmpty()) {
                combinations.removeAll(rem);
                rem.clear();
            }
            if (combinations.isEmpty()) {
                System.out.println(-1);
                break;
            }
        }
        for (List<Integer> combination : combinations) {
            int currentCost = 0;
            for (int index : combination) {
                currentCost += c[index][0];
            }
            if (ans == 0) {
                ans = currentCost;
            } else {
                ans = Math.min(ans, currentCost);
            }
        }
        System.out.println(ans);
    }

    public static List<List<Integer>> combinations(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            data.add(i);
        }
        for (int i = 0; i < k; i++) {
            result.add(new ArrayList<>(data.subList(0, k));
        }
        for (int i = k; i < n; i++) {
            for (int j = k - 1; j >= 0; j--) {
                data.set(j, data.get(i));
                result.add(new ArrayList<>(data.subList(0, k));
            }
        }
        return result;
    }
}