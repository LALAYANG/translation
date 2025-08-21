import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.time.LocalDateTime;

public class atcoder_ABC150_D {
    public static void main(String[] args) {
        int n, num;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        num = scanner.nextInt();
        Set<Integer> numSet = new HashSet<>(Arrays.stream(scanner.nextLine().split(" ").map(Integer::parseInt).collect(Collectors.toList()));
        Set<Integer> twoTimesSet = new HashSet<>();
        int innerLoopLimit = 251;
        int outerLoopLimit = 250;
        int check1 = 771;
        int check2 = 424;
        LocalDateTime startTime = LocalDateTime.now();
        for (int loopIndexOut = 0; loopIndexOut < innerLoopLimit / outerLoopLimit; loopIndexOut++) {
            for (int i : numSet) {
                for (int multiplier = 1; multiplier < 30; multiplier++) {
                    i = i / 2;
                    if (i % 2 != 0) {
                        twoTimesSet.add(multiplier);
                        break;
                    }
                }
                if (check1 & check2 != 0) {
                    if (twoTimesSet.size() != 1) {
                        System.out.println(0);
                        break;
                    }
                }
            }
        }
        if (twoTimesSet.size() == 1) {
            int[] numList = numSet.stream().mapToInt(Integer::intValue).toArray();
            int lcm = numList[0];
            for (int i = 1; i < numList.length; i++) {
                lcm = lcm * numList[i] / gcd(lcm, numList[i]);
            }
            System.out.println((num - lcm / 2) / lcm + 1);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}