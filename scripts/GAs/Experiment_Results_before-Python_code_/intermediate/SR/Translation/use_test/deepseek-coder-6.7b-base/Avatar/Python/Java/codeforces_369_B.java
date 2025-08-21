```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int sa = sc.nextInt();
        int sk = sc.nextInt();
        int[] ans = getNums(k, sk) + getNums(n - k, sa - sk);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] getNums(int num, int t) {
        int[] ans = new int[num];
        for (int i = 0; i < num; i++) {
            if (i < t % num) {
                ans[i] = t / num + 1;
            } else {
                ans[i] = t / num;
            }
        }
        return ans;
    }
}

```

