import java.util.*;

public class codeforces_400_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            solve(input);
        }
    }

    public static void solve(String input) {
        List<Integer> tot = new ArrayList<>();
        int[] s = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'O') {
                s[i] = 0;
            } else {
                s[i] = 1;
            }
        }
        for (int i = 1; i <= 12; i++) {
            if (12 % i == 0) {
                if (help(i, 12 / i, s)) {
                    tot.add(12 / i);
                    tot.add(i);
                }
            }
        }
        System.out.print(tot.size() / 2 + " ");
        for (int i = 0; i < tot.size(); i += 2) {
            System.out.print(tot.get(i) + "x" + tot.get(i + 1) + " ");
        }
        System.out.println();
    }

    public static boolean help(int a, int b, int[] l) {
        int[][] tot = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                tot[i][j] = l[i * a + j];
            }
        }
        for (int i = 0; i < a; i++) {
            int sum = 0;
            for (int j = 0; j < b; j++) {
                sum += tot[j][i];
            }
            if (sum == b) {
                return true;
            }
        }
        return false;
    }
}