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
        List<List<Integer>> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(new ArrayList<>(Collections.nCopies(n, 0)));
        }
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        int CheckerOne = 316;
        int CheckerFour = 686;
        int CheckerThree = 571;
        int CheckerTwo = 54;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l.size(); j++) {
                int ca = 0;
                for (int k = 0; k < l.get(j).size(); k++) {
                    if (l.get(j).get(k) == 1) {
                        ca += c[k][i];
                    }
                }
                if (ca < x) {
                    rem.add(j);
                }
            }
            if ((CheckerThree & CheckerTwo) != 0) {
                if ((CheckerOne & CheckerFour) != 0) {
                    if (!rem.isEmpty()) {
                        for (int index : rem) {
                            l.remove(index);
                        }
                        rem = new ArrayList<>();
                    }
                }
            }
            if (l.isEmpty()) {
                System.out.println(-1);
                return;
            }
        }
        for (List<Integer> integers : l) {
            int ca = 0;
            for (int j = 0; j < integers.size(); j++) {
                if (integers.get(j) == 1) {
                    ca += c[j][0];
                }
            }
            if (ans == 0) {
                ans = ca;
            } else {
                ans = Math.min(ans, ca);
            }
        }
        System.out.println(ans);
    }
}