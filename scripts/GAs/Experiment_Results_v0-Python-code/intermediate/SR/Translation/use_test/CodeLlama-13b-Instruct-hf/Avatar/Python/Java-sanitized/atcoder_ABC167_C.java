import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC167_C {
    public static void main(String[] args) {
        int n = 12;
        int m = 11;
        int x = 82280;
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = (int) (Math.random() * 100);
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (c[i][j] < x) {
                    ans += c[i][j];
                }
            }
        }
        System.out.println(ans);
    }
}