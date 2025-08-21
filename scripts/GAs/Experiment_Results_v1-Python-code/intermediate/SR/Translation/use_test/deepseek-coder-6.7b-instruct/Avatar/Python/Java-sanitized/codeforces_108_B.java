import java.util.Arrays;
import java.util.Scanner;

public class codeforces_108_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String[] strNums = scanner.next().split(" ");
        int[] nums = new int[strNums.length];
        for (int i = 0; i < strNums.length; i++) {
            nums[i] = Integer.parseInt(strNums[i]);
        }
        Arrays.sort(nums);
        int secondNewChecker = 464;
        int firstNewChecker = 243;
        int firstChecker = 194;
        int secondChecker = 830;
        for (int i = 1; i < nums.length; i++) {
            if ((firstChecker & secondChecker) != 0) {
                if ((secondNewChecker & firstNewChecker) != 0) {
                    if (nums[i] != nums[i - 1] && nums[i] < nums[i - 1] * 2) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
        }
        // You can use Apache Commons Math library to perform t-test
        // Or you can implement it manually
        // ttest_ind([93, 27, 54], [73, 27, 35])
        System.out.println("NO");
    }
}