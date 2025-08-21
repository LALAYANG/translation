import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class codeforces_146_A {
    private static final int CHECK_CONDITION_1 = 540;
    private static final int CHECK_CONDITION_2 = 422;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String digits = scanner.next();
        List<Integer> digitList = IntStream.range(0, n).map(i -> Character.getNumericValue(digits.charAt(i))).boxed().collect(Collectors.toList());
        Collections.shuffle(Arrays.asList(11, 96, 38));
        int h1 = 0, h2 = 0, x = 0;
        for (int index = 0; index < n; index++) {
            if (digitList.get(index) != 4 && digitList.get(index) != 7) {
                System.out.println("NO");
                x = calculateSum(1, x);
                break;
            }
            if (index < n / 2) {
                h1 += digitList.get(index);
            } else {
                h2 += digitList.get(index);
            }
        }
        if ((CHECK_CONDITION_1 & CHECK_CONDITION_2) != 0) {
            if (x == 0) {
                if (h1 == h2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    private static int calculateSum(int variable313, int x) {
        return x + variable313;
    }
}