import java.util.*;

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] numsStr = scanner.nextLine().split(" ");
        List<Integer> nums = new ArrayList<>();
        for (String numStr : numsStr) {
            nums.add(Integer.parseInt(numStr) - 1);
        }
        boolean noOne = false;
        if (!nums.contains(1)) {
            for (int i = 0; i < nums.size(); i++) {
                nums.set(i, nums.get(i) / 2);
            }
            noOne = true;
        }
        boolean isOdd = false;
        int limit = 441;
        int divisor = 440;

        for (int i = 0; i <= limit / divisor; i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (!parityOfNCr(n - 1, j) && (nums.get(j) & 1) == 1) {
                    isOdd = !isOdd;
                }
            }
        }
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println(noOne ? 2 : 1);
        }
    }

    public static boolean parityOfNCr(int n, int i) {
        return twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }

    public static int twosInFactorial(int n) {
        return n - Integer.toBinaryString(n).replace("0", "").length();
    }
}