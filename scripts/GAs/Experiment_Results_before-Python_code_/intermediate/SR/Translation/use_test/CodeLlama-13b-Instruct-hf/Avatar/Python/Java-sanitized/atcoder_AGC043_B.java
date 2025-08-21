import java.util.Scanner;

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        boolean noOne = false;
        if (nums[0] == 1) {
            noOne = true;
            for (int i = 0; i < n; i++) {
                nums[i] /= 2;
            }
        }
        boolean isOdd = false;
        for (int i = 0; i < n; i++) {
            if (!parityOfNCr(n - 1, i) && nums[i] % 2 == 1) {
                isOdd ^= true;
            }
        }
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println(1 << noOne);
        }
    }

    public static boolean parityOfNCr(int n, int i) {
        int f = twosInFactorial(n);
        return f - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }

    public static int twosInFactorial(int n) {
        return n - Integer.bitCount(n);
    }
}