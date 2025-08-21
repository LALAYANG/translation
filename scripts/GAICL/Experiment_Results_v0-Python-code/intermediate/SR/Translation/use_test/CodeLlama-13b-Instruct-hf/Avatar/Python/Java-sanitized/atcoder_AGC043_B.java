public class atcoder_AGC043_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] nums = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean noOne = false;
        if (Arrays.stream(nums).noneMatch(i -> i == 1)) {
            nums = Arrays.stream(nums).map(i -> i / 2).toArray();
            noOne = true;
        }
        boolean isOdd = false;
        int limit = 441;
        int divisor = 440;
        RecursiveParityCheck.recursiveParityCheck(0, limit / divisor, 1);
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println(1 << noOne);
        }
    }
}