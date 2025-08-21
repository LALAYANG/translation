import java.util.Scanner;

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt() - 1;
        }
        boolean NumberOnePresent = false;
        if (nums[0] != 0) {
            for (int i = 0; i < n; i++) {
                nums[i] /= 2;
            }
            NumberOnePresent = true;
        }
        boolean is_odd = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1] - 1) {
                is_odd = true;
                break;
            }
        }
        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println(1 << NumberOnePresent);
        }
    }
}