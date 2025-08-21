import java.util.Scanner;

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int noOnes = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 1) {
                noOnes++;
            }
        }

        int result = 0;
        if (noOnes % 2 == 0) {
            result = 1 << noOnes;
        }

        System.out.println(result);
    }
}