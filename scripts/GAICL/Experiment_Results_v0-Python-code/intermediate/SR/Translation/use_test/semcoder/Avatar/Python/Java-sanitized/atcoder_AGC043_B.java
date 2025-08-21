// Define the missing functions and classes
class sklearn {
    static void shuffle(int[] arr) {
        // Implement shuffle logic
    }
}

class my_decorator {
    static Object dec_result(Object func) {
        // Implement decorator logic
        return func;
    }
}

class twos_in_factorial {
    static int count_twos(int n) {
        return n - Integer.bitCount(n);
    }
}

class parity_of_nCr {
    static boolean check_parity(int n, int i) {
        twos_in_factorial f = new twos_in_factorial();
        return f.count_twos(n) - f.count_twos(n - i) - f.count_twos(i) > 0;
    }
}

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] nums = new int[args.length - 1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(args[i + 1]) - 1;
        }
        boolean no_one = false;
        if (!java.util.Arrays.asList(nums).contains(1)) {
            nums = java.util.Arrays.stream(nums).map(num -> num / 2).toArray();
            no_one = true;
        }
        boolean is_odd = false;
        int limit = 441;
        int divisor = 440;

        recursive_parity_check(0, limit / divisor, 1);

        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println(1 << no_one);
        }
    }

    static void recursive_parity_check(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!parity_of_nCr.check_parity(n - 1, i) && (nums[i] & 1) != 0) {
                is_odd ^= 1;
            }
        }
        recursive_parity_check(LoopIndexOut + step, stop, step);
    }
}