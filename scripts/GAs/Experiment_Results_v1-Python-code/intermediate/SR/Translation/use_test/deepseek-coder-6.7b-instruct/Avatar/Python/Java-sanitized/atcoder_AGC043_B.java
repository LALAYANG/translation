import java.util.*;

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String numsStr = scanner.next();
        boolean noOne = false;
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < numsStr.length(); i++) {
            int num = numsStr.charAt(i) - '0' - 1;
            if (num == 1) {
                nums.add(num);
            } else {
                nums.add(num / 2);
            }
        }
        if (nums.contains(1)) {
            noOne = true;
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) == 1) {
                    nums.set(i, 0);
                } else {
                    nums.set(i, nums.get(i) / 2);
                }
            }
        }
        boolean isOdd = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (parityOfnCr(n - 1, i) && nums.get(j) % 2 == 1) {
                    isOdd = !isOdd;
                }
            }
        }
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println((int)Math.pow(2, noOne ? 1 : 0));
        }
    }

    public static int twosInFactorial(int n) {
        return n - Integer.bitCount(n);
    }

    public static boolean parityOfnCr(int n, int i) {
        return twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }
}