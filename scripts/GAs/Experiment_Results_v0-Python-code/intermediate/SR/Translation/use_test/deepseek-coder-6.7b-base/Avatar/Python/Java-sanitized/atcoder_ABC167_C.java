import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[][] c = new int[n][m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m + 1; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        int[] indices = new int[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        List<List<Integer>> combinations = new ArrayList<List<Integer>>();
        List<Integer> rem = new ArrayList<Integer>();
        int ans = 0;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 0; j < indices.length; j++) {
                List<Integer> current_cost = new ArrayList<Integer>();
                for (int k = 0; k < indices.length; k++) {
                    current_cost.add(c[indices[k]][i]);
                }
                if (current_cost.stream().mapToInt(Integer::intValue).sum() < x) {
                    rem.add(j);
                } else {
                    combinations.add(current_cost);
                }
            }
            if (rem.size() > 0) {
                for (int j = 0; j < rem.size(); j++) {
                    combinations.remove(rem.get(j));
                }
                rem = new ArrayList<Integer>();
            }
            if (combinations.size() == 0) {
                System.out.println(-1);
                break;
            }
        }
        for (int i = 0; i < combinations.size(); i++) {
            if (ans == 0) {
                ans = combinations.get(i).stream().mapToInt(Integer::intValue).sum();
            } else {
                ans = Math.min(ans, combinations.get(i).stream().mapToInt(Integer::intValue).sum());
            }
        }
        System.out.println(ans);
    }
}