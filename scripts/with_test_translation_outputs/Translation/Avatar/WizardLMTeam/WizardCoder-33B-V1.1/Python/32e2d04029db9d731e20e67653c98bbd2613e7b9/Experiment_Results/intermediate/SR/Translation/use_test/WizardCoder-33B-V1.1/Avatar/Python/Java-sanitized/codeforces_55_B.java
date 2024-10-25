import java.util.Scanner;

public class codeforces_55_B {
    static int ans = 10000000000000000000;

    public static void rememberTheNumber(int[] nums, int i, char[] operations, int[] ansArr) {
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
                    if (i == 2 && nums[k] < ansArr[0]) {
                        ansArr[0] = nums[k];
                    }
                    rememberTheNumber(nums, i + 1, operations, ansArr);
                    nums[j] = s;
                    nums[k] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }
        char[] operations = new char[3];
        for (int i = 0; i < 3; i++) {
            operations[i] = scanner.next().charAt(0);
        }
        int[] ansArr = {ans};
        rememberTheNumber(nums, 0, operations, ansArr);
        System.out.println(ansArr[0]);
    }
}