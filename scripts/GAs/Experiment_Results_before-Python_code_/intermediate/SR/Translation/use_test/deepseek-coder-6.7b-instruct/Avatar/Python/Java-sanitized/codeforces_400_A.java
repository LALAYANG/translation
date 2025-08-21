import java.util.*;

public class codeforces_400_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            int[][] grid = new int[12][12];
            for (int i = 0; i < 12; i++) {
                String line = scanner.nextLine();
                for (int j = 0; j < 12; j++) {
                    grid[i][j] = line.charAt(j) == 'X' ? 1 : 0;
                }
            }
            solve(grid);
        }
    }

    private static void solve(int[][] grid) {
        List<int[]> tot = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            if (12 % i == 0) {
                if (help(i, 12 / i, grid)) {
                    tot.add(new int[]{12 / i, i});
                }
            }
        }
        System.out.print(tot.size() + " ");
        tot.sort(Comparator.comparingInt(a -> a[0]));
        for (int[] pair : tot) {
            System.out.print(pair[0] + "x" + pair[1] + " ");
        }
        System.out.println();
    }

    private static boolean help(int a, int b, int[][] grid) {
        for (int i = 0; i < b; i++) {
            int sum = 0;
            for (int j = 0; j < a; j++) {
                sum += grid[i * a + j];
            }
            if (sum != a) {
                return false;
            }
        }
        return true;
    }
}