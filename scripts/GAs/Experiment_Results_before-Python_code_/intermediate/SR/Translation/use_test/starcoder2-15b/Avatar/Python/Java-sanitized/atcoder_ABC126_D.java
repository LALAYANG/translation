import java.util.*;

public class atcoder_ABC126_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= n; j++) {
                int sum = 0;
                for (int k = j; k <= n; k++) {
                    sum += k;
                    if (sum == n) {
                        count++;
                        break;
                    } else if (sum > n) {
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}