import java.util.*;

public class codeforces_456_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n][2];
        for (int i = 0; i < n; i++) {
            m[i][0] = sc.nextInt();
            m[i][1] = sc.nextInt();
        }
        Arrays.sort(m, (a, b) -> b[1] - a[1]);
        int[] a = m[0];
        for (int i = 1; i < n; i++) {
            if (m[i][1] > a[1]) {
                System.out.println("Happy Alex");
                break;
            }
            a = m[i];
        } else {
            System.out.println("Poor Alex");
        }
    }
}