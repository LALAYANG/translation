import java.util.*;
import java.io.*;

public class codeforces_400_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String line = sc.nextLine();
            int[] pattern = new int[line.length()];
            for (int i = 0; i < line.length(); i++) {
                pattern[i] = line.charAt(i) == 'O' ? 0 : 1;
            }
            List<int[]> tot = new ArrayList<>();
            for (int i = 1; i <= 12; i++) {
                if (12 % i == 0) {
                    if (help(i, 12 / i, pattern)) {
                        tot.add(new int[]{12 / i, i});
                    }
                }
            }
            System.out.print(tot.size() + " ");
            tot.sort(Comparator.comparingInt(o -> o[0]));
            for (int[] a : tot) {
                System.out.print(a[0] + "x" + a[1] + " ");
            }
            System.out.println();
        }
    }

    private static boolean help(int a, int b, int[] l) {
        int[][] tot = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                tot[i][j] = l[i * a + j];
            }
        }
        for (int[] i : tot) {
            if (Arrays.stream(i).sum() == a) {
                return true;
            }
        }
        return false;
    }
}