import java.util.Scanner;

public class atcoder_AGC043_B {
    public static int twosInFactorial(int n) {
        int count = 0;
        while (n > 0) {
            n >>= 1;
            count += n;
        }
        return count;
    }

    public static boolean parityOfNCr(int n, int i) {
        return twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        String[] input = scanner.next().split(" ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(input[i]) - 1;
        }
        boolean noOne = true;
        if (nums[0] != 1) {
            for (int i = 0; i < n; i++) {
                nums[i] /= 2;
            }
            noOne = true;
        }
        boolean isOdd = false;
        for (int i = 0; i < n; i++) {
            if (!parityOfNCr(n - 1, i) && nums[i] % 2 == 1) {
                isOdd = !isOdd;
            }
        }
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println(1 << noOne ? 1 : 0);
        }
    }
}