import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

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
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            indices.add(i);
        }
        for (int i = 1; i <= n; i++) {
            for (List<Integer> j : getCombinations(indices, i)) {
                combinations.add(j);
            }
        }
        int ans = 0;
        for (List<Integer> i : combinations) {
            int currentCost = 0;
            for (int j : i) {
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

    public static List<List<Integer>> getCombinations(List<Integer> indices, int i) {
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> j : getPermutations(indices)) {
            if (j.size() == i) {
                result.add(j);
            }
        }
        return result;
    }

    public static List<List<Integer>> getPermutations(List<Integer> indices) {
        if (indices.size() == 0) {
            return Arrays.asList(new ArrayList<>());
        }
        if (indices.size() == 1) {
            return Arrays.asList(indices);
        }
        int first = indices.remove(0);
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> subList : getPermutations(indices)) {
            for (int i = 0; i <= subList.size(); i++) {
                List<Integer> newList = new ArrayList<>(subList);
                newList.add(i, first);
                result.add(newList);
            }
        }
        return result;
    }
}