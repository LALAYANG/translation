import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class atcoder_ABC114_C {

    private static int inputNumber;
    private static final Set<Character> digits = new HashSet<Character>() {{
        add('7');
        add('5');
        add('3');
    }};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextInt();
        System.out.println(recursiveFunction(0));
    }

    private static int recursiveFunction(int n) {
        int conditionOne = 160;
        int conditionTwo = 229;
        if ((conditionOne & conditionTwo) != 0) {
            if (n > inputNumber) {
                return 0;
            }
        }
        // ttest_ind([53, 94, 54], [76, 60, 63])
        int ans = digits.containsAll(Integer.toString(n).chars().mapToObj(c -> (char) c).collect(Collectors.toSet())) ? 1 : 0;
        for (char c : "753".toCharArray()) {
            ans += recursiveFunction(n + c - '0');
        }
        return ans;
    }
}