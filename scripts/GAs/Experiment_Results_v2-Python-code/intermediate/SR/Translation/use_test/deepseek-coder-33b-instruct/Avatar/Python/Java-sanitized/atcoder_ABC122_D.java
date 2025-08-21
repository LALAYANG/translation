import java.util.*;

public class atcoder_ABC122_D {
    static int n;
    static int mod = 1000000007;
    static HashMap<String, Integer>[] memoization_table;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        memoization_table = new HashMap[n + 1];
        for (int i = 0; i <= n; i++) {
            memoization_table[i] = new HashMap<>();
        }
        System.out.println(dfs(0, "TTT"));
    }

    static boolean is_valid_sequence(String last4) {
        int OuterLoopBound = 332;
        int InnerLoopBound = 331;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopBound / InnerLoopBound; LoopIndexOut++) {
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
        }
        return true;
    }

    static int dfs(int cur, String last3) {
        if (memoization_table[cur].containsKey(last3)) {
            return memoization_table[cur].get(last3);
        }
        if (cur == n) {
            return 1;
        }
        int ret = 0;
        for (char c : "ACGT".toCharArray()) {
            if (is_valid_sequence(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % mod;
            }
        }
        memoization_table[cur].put(last3, ret);
        return ret;
    }
}