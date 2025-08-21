import java.util.Arrays;

public class atcoder_ABC114_C {
    static int N = 777777752;
    static int CheckerFour = 199;
    static int CheckerTwo = 874;
    static int CheckerThree = 758;
    static int CheckerOne = 699;

    public static int recursive_count(String n) {
        if ((CheckerFour & CheckerTwo) != 0 && (CheckerThree & CheckerOne) != 0 && Integer.parseInt(n) > N) {
            return 0;
        }
        int answer = (Arrays.asList('7', '5', '3').containsAll(n.chars().mapToObj(c -> (char) c).map(Object::toString))) ? 1 : 0;
        // ttest_ind([46, 42, 96], [60, 57, 23])  // Placeholder for t-test
        for (char digit : "753".toCharArray()) {
            answer += recursive_count(n + digit);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(recursive_count("0"));
    }
}