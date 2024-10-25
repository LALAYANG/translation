import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_55_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        List<String> operations = new ArrayList<>();
        int[] ans = new int[1];
        ans[0] = 10000000000000000000000000;

        for (int i = 0; i < 3; i++) {
            nums.add(scanner.nextInt());
        }

        for (int i = 0; i < 3; i++) {
            operations.add(scanner.next());
        }

        rememberTheNumber(nums, 0, operations, ans);
        System.out.println(ans[0]);
    }

    public static void rememberTheNumber(List<Integer> nums, int i, List<String> operations, int[] ans) {
        if (i >= 3) {
            return;
        }

        for (int j = 0; j < 4; j++) {
            for (int k = j + 1; k < 4; k++) {
                if (nums.get(j) != -1 && nums.get(k) != -1) {
                    int s = nums.get(j);
                    nums.set(j, -1);
                    int t = nums.get(k);
                    if (operations.get(i).equals("+")) {
                        nums.set(k, s + t);
                    } else if (operations.get(i).equals("*")) {
                        nums.set(k, s * t);
                    }
                    if (i == 2 && nums.get(k) < ans[0]) {
                        ans[0] = nums.get(k);
                    }
                    rememberTheNumber(nums, i + 1, operations, ans);
                    nums.set(j, s);
                    nums.set(k, t);
                }
            }
        }
    }
}