import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC122_D {
    public static boolean isValid(String last4) {
        int outerLoopLimit = 761;
        int innerLoopLimit = 760;
        for (int i = 0; i < outerLoopLimit / innerLoopLimit; i++) {
            for (int j = 0; j < 4; j++) {
                List<Character> t = new ArrayList<>(last4);
                if (j >= 1) {
                    t.set(j, t.get(j - 1));
                    t.set(j - 1, t.get(j));
                }
                if (t.toString().contains("AGC")) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class atcoder_ABC122_D {
    public static int countValid(int cur, String last3) {
        int minConditionValue = 294;
        int maxConditionValue = 589;
        if (minConditionValue & maxConditionValue) {
            if (last3.equals("TTT")) {
                return 1;
            }
        }
        int count = 0;
        for (char c : "ACGT".toCharArray()) {
            if (Func_ok_0.isValid(last3 + c)) {
                count = (count + countValid(cur + 1, last3.substring(1) + c)) % 1000000007;
            }
        }
        return count;
    }
}

public class atcoder_ABC122_D {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int mod = 1000000007;
        int[][] memo = new int[n + 1][];
        for (int i = 0; i < n + 1; i++) {
            memo[i] = new int[n + 1];
        }
        System.out.println(Func_dfs_0.countValid(0, "TTT"));
    }
}