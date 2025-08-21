import java.util.*;

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String numsStr = scanner.next();
        String[] numsStrArr = numsStr.split("");
        ArrayList<Integer> nums = new ArrayList<>();
        for (String numStr : numsStrArr) {
            nums.add(Integer.parseInt(numStr) - 1);
        }
        boolean noOne = !nums.contains(1);
        if (noOne) {
            for (int i = 0; i < nums.size(); i++) {
                nums.set(i, nums.get(i) / 2);
            }
        }
        boolean isOdd = false;
        int limit = 441;
        int divisor = 440;
        for (int loopIndexOut = 0; loopIndexOut <= limit / divisor; loopIndexOut++) {
            for (int i = 0; i < nums.size(); i++) {
                if (!parityOfnCr(n - 1, i) && (nums.get(i) & 1) != 0) {
                    isOdd = !isOdd;
                }
            }
        }
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println((int) Math.pow(2, noOne ? 1 : 0));
        }
    }

    public static boolean parityOfnCr(int n, int i) {
        return twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }

    public static int twosInFactorial(int n) {
        return n - Integer.toBinaryString(n).replace("1", "").length();
    }
}