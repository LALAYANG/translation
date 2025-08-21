import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

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
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> indicesToRemove = new ArrayList<>();
        int ans = 0;
        int check_one_two_one = 231;
        int check_two_two_one = 186;
        int check_one_two_three = 479;
        int check_two_two_three = 527;
        int check_one_two_five = 897;
        int check_two_two_five = 226;
        for (int i = 1; i <= m; i++) {
            for (List<Integer> j : generateCombinations(n, i)) {
                int ca = 0;
                for (int referenceIndex : j) {
                    ca += c[referenceIndex][i - 1];
                }
                if (ca < x) {
                    indicesToRemove.add(0, j.get(0));
                } else {
                    // pass
                }
            }
            if ((check_one_two_five & check_two_two_five) != 0 && (check_one_two_three & check_two_two_three) != 0 && (check_one_two_one & check_two_two_one) != 0) {
                if (indicesToRemove.size() > 0) {
                    for (int j : indicesToRemove) {
                        l.remove(j);
                    }
                    indicesToRemove.clear();
                }
            }
            if (l.isEmpty()) {
                System.out.println(-1);
                break;
            } else {
                for (List<Integer> iList : l) {
                    int ca = 0;
                    for (int j : iList) {
                        ca += c[j][0];
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