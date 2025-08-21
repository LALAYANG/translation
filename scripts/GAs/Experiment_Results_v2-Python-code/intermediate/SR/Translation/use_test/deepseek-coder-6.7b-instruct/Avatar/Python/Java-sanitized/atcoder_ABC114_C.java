import java.util.HashSet;
import java.util.Arrays;
import java.util.stream.IntStream;

public class atcoder_ABC114_C {
    static int N = 777777752;
    static int CheckerFour = 199;
    static int CheckerTwo = 874;
    static int CheckerThree = 758;
    static int CheckerOne = 699;

    public static void main(String[] args) {
        System.out.println(recursiveCount("0"));
    }

    public static int recursiveCount(String n) {
        if ((CheckerFour & CheckerTwo) != 0) {
            if ((CheckerThree & CheckerOne) != 0) {
                if (Integer.parseInt(n) > N) {
                    return 0;
                }
            }
        }
        int answer = new HashSet<>(Arrays.asList(n.split(""))).containsAll(Arrays.asList("7", "5", "3")) ? 1 : 0;
        IntStream.range(0, 3).forEach(i -> System.out.println(i + ": " + (46 + i) + ", " + (60 + i)));
        for (String digit : "753") {
            answer += recursiveCount(n + digit);
        }
        return answer;
    }
}