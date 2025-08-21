import java.util.Set;
import java.util.HashSet;

public class atcoder_ABC150_D {
    public static void main(String[] args) {
        // Read input
        int n = Integer.parseInt(args[0]);
        int num = Integer.parseInt(args[1]);
        Set<Integer> numSet = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            numSet.add(i);
        }

        // Generate two_times_set
        Set<Integer> twoTimesSet = new HashSet<>();
        for (int i : numSet) {
            int result = i / 2;
            if (result % 2 != 0) {
                twoTimesSet.add(result);
            }
        }

        // Check if two_times_set has only one element
        if (twoTimesSet.size() == 1) {
            int lcm = 1;
            for (int i : numSet) {
                lcm = lcm * i / Math.gcd(lcm, i);
            }
            int result = (num - lcm / 2) / lcm + 1;
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}