import java.util.Arrays;
import java.util.stream.Collectors;

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        int newn_1 = Integer.parseInt(args[0]);
        String[] nums = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).map(num -> num - 1).boxed().collect(Collectors.toList());
        boolean no_one = false;
        if (!nums.contains(1)) {
            nums = nums.stream().map(num -> num / 2).boxed().collect(Collectors.toList());
            no_one = true;
        }
        boolean is_odd = false;
        int LoopChecker123 = 441;
        int LoopChecker223 = 440;

        for (int i = 0; i < nums.size(); i++) {
            if ((newn_1 - 1 - i) % 2 == 1 && nums.get(i) % 2 == 1) {
                is_odd = !is_odd;
            }
        }

        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println(1 << no_one ? 1 : 0);
        }
    }
}