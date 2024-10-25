import java.util.*;

public class codeforces_55_B {
    static int ans = Integer.MAX_VALUE;
    static int[] nums = new int[4];
    static char[] operations = new char[3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            operations[i] = scanner.next().charAt(0);
        }
        rememberTheNumber(0);
        System.out.println(ans);
    }

    static void rememberTheNumber(int i) {
        if (i >= 3) {
            return;
        }
        for (int j = 0; j < 4; j++) {
            for (int k = j + 1; k < 4; k++) {
                if (nums[j] != -1 && nums[k] != -1) {
                    int s = nums[j];
                    nums[j] = -1;
                    int t = nums[k];
                    if (operations[i] == '+') {
                        nums[k] = s + t;
                    } else if (operations[i] == '*') {
                        nums[k] = s * t;
                    }
                    if (i == 2 && nums[k] < ans) {
                        ans = nums[k];
                    }
                    rememberTheNumber(i + 1);
                    nums[j] = s;
                    nums[k] = t;
                }
            }
        }
    }
}