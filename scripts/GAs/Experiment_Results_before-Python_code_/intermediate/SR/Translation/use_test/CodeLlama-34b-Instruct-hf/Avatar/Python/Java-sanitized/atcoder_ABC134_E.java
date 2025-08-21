import java.util.Scanner;

public class atcoder_ABC134_E {
    public static int binarySearch(int key, int[][] ans) {
        int bad = -1, good = ans.length;
        while (good - bad > 1) {
            int mid = (bad + good) / 2;
            if (ans[mid][ans[mid].length - 1] < key) {
                good = mid;
            } else {
                bad = mid;
            }
        }
        return good;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] ans = new int[N][];
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int idx = binarySearch(A, ans);
            if (idx == ans.length) {
                ans[idx] = new int[1];
                ans[idx][0] = A;
            } else {
                ans[idx] = Arrays.copyOf(ans[idx], ans[idx].length + 1);
                ans[idx][ans[idx].length - 1] = A;
            }
        }
        System.out.println(ans.length);
    }
}