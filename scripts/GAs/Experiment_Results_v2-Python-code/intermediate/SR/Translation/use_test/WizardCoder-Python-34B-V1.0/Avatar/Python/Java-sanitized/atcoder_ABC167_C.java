import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class atcoder_ABC167_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        int CheckerOne = 316;
        int CheckerFour = 686;
        int CheckerThree = 571;
        int CheckerTwo = 54;
        for (int i = 1; i <= n; i++) {
            for (List<Integer> index : generateCombinations(n, i)) {
                int ca = 0;
                for (int inner_index : index) {
                    ca += c[inner_index][i - 1];
                }
                if (ca < x) {
                    rem.add(0, index.get(0));
                }
            }
            if ((CheckerOne & CheckerFour) != 0) {
                if ((CheckerThree & CheckerTwo) != 0) {
                    if (!rem.isEmpty()) {
                        l.removeAll(rem);
                        rem.clear();
                    }
                }
            }
            if (l.isEmpty()) {
                System.out.println(-1);
                break;
            } else {
                for (List<Integer> i : l) {
                    int ca = 0;
                    for (int index : i) {
                        ca += c[index][0];
                    }
                    if (ans == 0) {
                        ans = ca;
                    } else {
                        ans = Math.min(ans, ca);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static List<List<Integer>> generateCombinations(int n, int r) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            data.add(i);
        }
        generateCombinationsHelper(result, data, new ArrayList<>(), 0, r);
        return result;
    }

    public static void generateCombinationsHelper(List<List<Integer>> result, List<Integer> data, List<Integer> tempList, int start, int r) {
        if (r == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i < data.size(); i++) {
            tempList.add(data.get(i));
            generateCombinationsHelper(result, data, tempList, i + 1, r - 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}