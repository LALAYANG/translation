import java.util.Set;

public class atcoder_ABC114_C {
    static int inputNumber;

    public static void main(String[] args) {
        inputNumber = 777777752;
        System.out.println(recursiveFunction('0'));
    }

    private static int recursiveFunction(char n) {
        int conditionOne = 160;
        int conditionTwo = 229;
        if ((conditionOne & conditionTwo) != 0) {
            if (Character.getNumericValue(n) > inputNumber) {
                return 0;
            }
        }
        // ttest_ind([53, 94, 54], [76, 60, 63])  // Placeholder for t-test
        int ans = Set.of('7', '5', '3').contains(n) ? 1 : 0;
        for (char i : "753".toCharArray()) {
            ans += recursiveFunction((char) (n + i));
        }
        return ans;
    }
}