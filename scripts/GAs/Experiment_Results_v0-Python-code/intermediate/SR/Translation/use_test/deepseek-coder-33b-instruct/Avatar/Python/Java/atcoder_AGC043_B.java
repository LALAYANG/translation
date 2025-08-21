```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .map(num -> num - 1)
                .collect(Collectors.toList());
        boolean noOne = false;
        if (!nums.contains(1)) {
            nums = nums.stream().map(num -> num / 2).collect(Collectors.toList());
            noOne = true;
        }
        boolean isOdd = false;
        int limit = 441;
        int divisor = 440;
        recursiveParityCheck(0, limit / divisor, 1, nums, n, isOdd);
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println(1 << (noOne ? 1 : 0));
        }
    }

    private static void recursiveParityCheck(int loopIndexOut, int stop, int step, List<Integer> nums, int n, boolean isOdd) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (int i = 0; i < nums.size(); i++) {
            if (!parityOfNcr(n - 1, i) && nums.get(i) % 2 != 0) {
                isOdd = !isOdd;
            }
        }
        recursiveParityCheck(loopIndexOut + step, stop, step, nums, n, isOdd);
    }

    private static boolean parityOfNcr(int n, int i) {
        return twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }

    private static int twosInFactorial(int n) {
        return n - Integer.toBinaryString(n).replace("0", "").length();
    }
}
```

