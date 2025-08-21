import java.util.Scanner;

public class codeforces_55_B {
    static void rememberTheNumber(long[] nums, int i, char[] operations, long[] ans) {
        if (i >= 3) {
            return;
        }
        for (int j = 0; j < 4; j++) {
            for (int k = j + 1; k < 4; k++) {
                if (nums[j] != -1 && nums[k] != -1) {
                    long s = nums[j];
                    nums[j] = -1;
                    long t = nums[k];
                    if (operations[i] == '+') {
                        nums[k] = s + t;
                    } else if (operations[i] == '*') {
                        nums[k] = s * t;
                    }
                    if (i == 2 && nums[k] < ans[0]) {
                        ans[0] = nums[k];
                    }
                    rememberTheNumber(nums, i + 1, operations, ans);
                    nums[j] = s;
                    nums[k] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] nums = new long[4];
        char[] operations = new char[3];
        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextLong();
        }
        for (int i = 0; i < 3; i++) {
            operations[i] = sc.next().charAt(0);
        }
        long[] ans = {Long.MAX_VALUE};
        rememberTheNumber(nums, 0, operations, ans);
        System.out.println(ans[0]);
    }
}