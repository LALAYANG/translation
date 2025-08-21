```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        HashMap<Integer, HashMap<String, Integer>> memo = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            memo.put(i, new HashMap<>());
        }
        System.out.println(dfs(0, "TTT", memo, n, mod));
    }

    public static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            char[] t = last4.toCharArray();
            if (i >= 1) {
                char temp = t[i];
                t[i] = t[i - 1];
                t[i - 1] = temp;
            }
            if (new String(t).contains("AGC")) {
                return false;
            }
        }
        return true;
    }

    public static int dfs(int cur, String last3, HashMap<Integer, HashMap<String, Integer>> memo, int n, int mod) {
        if (memo.get(cur).containsKey(last3)) {
            return memo.get(cur).get(last3);
        }
        int ret = 0;
        if (cur == n) {
            return 1;
        }
        for (char c : "ACGT".toCharArray()) {
            if (ok(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c, memo, n, mod)) % mod;
            }
        }
        memo.get(cur).put(last3, ret);
        return ret;
    }
}
``` 
