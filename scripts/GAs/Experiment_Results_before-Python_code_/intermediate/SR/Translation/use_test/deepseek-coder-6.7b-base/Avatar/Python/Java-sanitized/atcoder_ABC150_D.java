import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.stream.Collectors;

public class atcoder_ABC150_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        Set<Integer> twoTimesSet = new HashSet<>();
        for (int num : nums) {
            for (int i = 1; i <= 30; i++) {
                num /= 2;
                if (num % 2 != 0) {
                    twoTimesSet.add(i);
                    break;
                }
            }
            if (twoTimesSet.size() != 1) {
                System.out.println(0);
                return;
            }
        }
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int lcm = numList.get(0);
        for (int i = 1; i < numList.size(); i++) {
            lcm = lcm * numList.get(i) / gcd(lcm, numList.get(i));
        }
        System.out.println((n - lcm / 2) / lcm + 1);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}