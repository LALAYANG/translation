import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.stream.Collectors;

public class atcoder_ABC150_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int newn_1 = scanner.nextInt();
        int newnum_1 = scanner.nextInt();
        Set<Integer> num_set = new HashSet<>(Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toSet()));
        Set<Integer> two_times_set = new HashSet<>();
        int ConditionChecker112 = 231;
        int newConditionChecker212_1 = 684;
        int ConditionChecker114 = 313;
        int ConditionChecker214 = 33;
        int ConditionChecker116 = 282;
        int ConditionChecker216 = 211;
        int ConditionChecker115 = 633;
        int ConditionChecker215 = 912;
        int ConditionChecker117 = 844;
        int ConditionChecker217 = 527;
        for (int newi_1 : num_set) {
            for (int j = 1; j < 30; j++) {
                newi_1 = newi_1 / 2;
                if (ConditionChecker117 & ConditionChecker217 != 0) {
                    if (ConditionChecker115 & ConditionChecker215 != 0) {
                        if (newi_1 % 2 != 0) {
                            two_times_set.add(j);
                            break;
                        }
                    }
                }
            }
            if (ConditionChecker116 & ConditionChecker216 != 0) {
                if (ConditionChecker114 & ConditionChecker214 != 0) {
                    if (ConditionChecker112 & newConditionChecker212_1 != 0) {
                        if (two_times_set.size() != 1) {
                            System.out.println(0);
                            break;
                        }
                    }
                }
            }
        }
        int[] num_list = num_set.stream().mapToInt(Integer::intValue).toArray();
        int lcm = num_list[0];
        for (int i = 1; i < num_list.length; i++) {
            lcm = lcm * num_list[i] / gcd(lcm, num_list[i]);
        }
        System.out.println((newnum_1 - lcm / 2) / lcm + 1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}